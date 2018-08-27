package lambda.our.interfaces;

public class ArraySortWithoutComparator {
	
	public static void sort(int[] num, MyPredicate<Integer>Pr) {
		int temp;
		for (int border = 0; border < num.length-1; border++) {
			for (int i = 0; i < num.length-border-1; i++) {
				if (Pr.test(num[i], num[i+1])) {
					temp=num[i];
					num[i]=num[i+1];
					num[i+1]=temp;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		int[] numbers={1, 45, -4, -5, 12};
		int temp;
		for (int border = 0; border < numbers.length-1; border++) {
			for (int i = 0; i < numbers.length-border-1; i++) {
				if (numbers[i]>numbers[i+1]) {
					temp=numbers[i];
					numbers[i]=numbers[i+1];
					numbers[i+1]=temp;
				}
			}
		}
		System.out.println("Array after sorting UP");
		for (int elem : numbers) {
			System.out.println(elem);
		}
		for (int border = 0; border < numbers.length-1; border++) {
			for (int i = 0; i < numbers.length-border-1; i++) {
				if (numbers[i]<numbers[i+1]) {
					temp=numbers[i];
					numbers[i]=numbers[i+1];
					numbers[i+1]=temp;
				}
			}
		}
		System.out.println("Array after sorting DOWN");
		for (int elem : numbers) {
			System.out.println(elem);
		}
		
		System.out.println("Array efter sort by Lambda");
		sort(numbers, (num1, num2)->{return num1>num2;});
		System.out.println("Array after sorting Up");
		for (int elem : numbers) {
			System.out.println(elem);
		}
		sort(numbers, (num1, num2)->{return num1<num2;});
		System.out.println("Array after sorting DOWN");
		for (int elem : numbers) {
			System.out.println(elem);
		}
	}

}
