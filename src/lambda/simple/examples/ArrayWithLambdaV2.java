package lambda.simple.examples;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayWithLambdaV2 {
	
	// отсортировать массив в порядке возрастания и убывания

	public static void main(String[] args) {
		Double[] numbers={23.4, 45.5, -6.5, 5.6, -43.6}; // дробная часть в коде вводится через точку 
		Arrays.sort(numbers, new Comparator<Double>() {

			@Override
			public int compare(Double num1, Double num2) {
				return num1.compareTo(num2);
			}
		});
		System.out.println("Array after sorting UP");
		for (Double elem : numbers) {
			System.out.println(elem);
		}
		Arrays.sort(numbers, new Comparator<Double>() {

			@Override
			public int compare(Double num2, Double num1) {
				return num1.compareTo(num2);
			}
		});
		System.out.println("Arrays after sorting DOWN");
		for (Double elem : numbers) {
			System.out.println(elem);
		}
	}

}
