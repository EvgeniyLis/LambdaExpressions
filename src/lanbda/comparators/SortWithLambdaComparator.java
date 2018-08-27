package lanbda.comparators;

import java.util.Arrays;
import java.util.Comparator;

// превратить компараторы в лямбду

public class SortWithLambdaComparator {

	public static void main(String[] args) {
		Integer[] numbers={2, 34, 6, -7};
		System.out.println("Array before sorting");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		Arrays.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer num1, Integer num2) {
				return Integer.compare(num1, num2);
			}
		});
		System.out.println("Array after sorting UP");
		for (Integer elem : numbers) {
			System.out.println(elem);
		}
		Arrays.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer num1, Integer num2) {
				return Integer.compare(num2, num1);
			}
		});
		System.out.println("Array after sorting DOWN");
		for (Integer elem : numbers) {
			System.out.println(elem);
		}
	}

}
