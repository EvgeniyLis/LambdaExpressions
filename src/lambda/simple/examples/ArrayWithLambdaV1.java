package lambda.simple.examples;

import java.util.Arrays;

public class ArrayWithLambdaV1 {
	
	// ������������� ������ � ������� ����������� � ��������

	public static void main(String[] args) {
		Double[] numbers={23.4, 45.5, -6.5, 5.6, -43.6}; // ������� ����� � ���� �������� ����� ����� 
		Arrays.sort(numbers, new DoubleSortUp());
		System.out.println("Array after sorting UP");
		for (Double elem : numbers) {
			System.out.println(elem);
		}
		Arrays.sort(numbers, new DoubleSortDown());
		System.out.println("Arrays after sorting DOWN");
		for (Double elem : numbers) {
			System.out.println(elem);
		}
	}

}
