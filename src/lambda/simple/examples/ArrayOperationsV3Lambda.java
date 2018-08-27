package lambda.simple.examples;

import java.util.function.Predicate;

public class ArrayOperationsV3Lambda {
	
	//����� � ������� �����, �����, ������, �������� ��-��
	
	public static void getElements(int[] num, Predicate<Integer> condition){
			for (int i = 0; i < num.length; i++) {
				if (condition.test(num[i])) {
					System.out.println(num[i]);
				}
		}
	}
	
	
	public static void main(String[] args){
		int[] numbers={3, 4, -1, 22, -4, 33};
		System.out.println("Positive elements");
		getElements(numbers, arrayElem->{return arrayElem>0;});
		System.out.println("Negative elements");
		getElements(numbers, (Integer num)->{return num<0;}); // ��� ���������������� ������� ������� �� ��������� Predicate 
		System.out.println("Odd elements");
		getElements(numbers, (arrayElem)->{return arrayElem%2!=0;}); // ��� � ��� ��������� ������� �� ��������� ���������� Predicate
		System.out.println("Even Elenents");
		getElements(numbers, arrayElem->{return arrayElem%2==0;}); // ���� ������� ��������� ������ ���� �������, ������ �� ��������
	}
}
