package lambda.homework;

import lambda.our.interfaces.MinMaxPredicate;

public class MinMaxLambda {
	
	// найти макс и мин эл-т массива
	
	/*public static int minElem(int[] num) {
		int position=0;
		for (int i = 1; i < num.length; i++) {
			if (num[i]<num[position]) {
				position=i;
			}
		}
		return num[position];
	}*/
	
	/*public static int maxElem(int[] num) {
		int position=0;
		for (int i = 1; i < num.length; i++) {
			if (num[i]>num[position]) {
				position=i;
			}
		}
		return num[position];
	}*/
	
	public static int getMinMax(int[] nums, MinMaxPredicate mmp) {
		int position=0;
		for (int i = 0; i < nums.length; i++) {
			if (mmp.compare(nums[i], nums[position])) {
				position=i;
			}
		}
		return nums[position];
	}

	public static void main(String[] args) {
		int[] numbers={1, -3, 5, 9, -5};
		int min;
		int max;
		//min=minElem(numbers);
		//max=maxElem(numbers);
		//System.out.println(min);
		//System.out.println(max);
		min=getMinMax(numbers, /*new MinMaxPredicate() {
			
			@Override
			public boolean compare(int num1, int num2) {
				return num1<num2;
			}
		}*/ (num1, num2)->{return num1<num2;});
		max=getMinMax(numbers, /*new MinMaxPredicate() {
			
			@Override
			public boolean compare(int num1, int num2) {
				return num1>num2;
			}
		}*/ (num1, num2)->{return num1>num2;});
		System.out.println(min);
		System.out.println(max);
	}

}
