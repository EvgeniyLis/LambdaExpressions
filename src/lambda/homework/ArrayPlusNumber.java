package lambda.homework;

import lambda.our.interfaces.SumSubstr;

//дано число, посчитать разность и сумму эл-тов массива и числа

public class ArrayPlusNumber {
	
	/*public static int summa(int[] nums, int number) {
		for (int i = 0; i < nums.length; i++) {
			number+=nums[i];
		}
		return number;
	}*/
	
	/*public static int substr(int[] nums, int number) {
		for (int i = 0; i < nums.length; i++) {
			number-=nums[i];
		}
		return number;
	}*/
	
	public static int getResult(int[] nums, int number, SumSubstr res) {
		for (int i = 0; i < nums.length; i++) {
			number=res.sumsubstr(number, nums[i]);
		}
		return number;
	}
	

	public static void main(String[] args) {
		int number=56;
		int[] numbers={1, 1, 1, 1, 1};
		//System.out.println(summa(numbers, number));
		//System.out.println(substr(numbers, number));
		int summa=getResult(numbers, number, /*new SumSubstr() {
			
			@Override
			public int sumsubstr(int num, int arI) {
				return num+arI;
			}
		}*/ (num, ar)->{return num+ar;});
		int substr=getResult(numbers, number, /*new SumSubstr() {
			
			@Override
			public int sumsubstr(int num, int arI) {
				return num-arI;
			}
		}*/ (num, ar)->{return num-ar;});
		System.out.println(summa);
		System.out.println(substr);
	}

}
