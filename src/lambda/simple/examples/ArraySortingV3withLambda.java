package lambda.simple.examples;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortingV3withLambda {
	
	// ������������� ������ � ������� ����������� � ��������

	public static void main(String[] args) {
		Double[] numbers={23.4, 45.5, -6.5, 5.6, -43.6}; // ������� ����� � ���� �������� ����� ����� 
		Arrays.sort(numbers, (Double num1, Double num2)->{return num1.compareTo(num2);});
		System.out.println("Array after sorting UP");
		for (Double elem : numbers) {
			System.out.println(elem);
		}
		Arrays.sort(numbers, (num1, num2)->{return num2.compareTo(num1);});
		System.out.println("Arrays after sorting DOWN");
		for (Double elem : numbers) {
			System.out.println(elem);
		}
	}

}
