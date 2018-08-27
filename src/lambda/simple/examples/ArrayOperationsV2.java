package lambda.simple.examples;

import java.util.function.Predicate;

public class ArrayOperationsV2 {
	
	//найти в массиве полож, отриц, четные, нечетные эл-ты
	
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
		Predicate<Integer> positive=new Predicate<Integer>() { // именованный объект positive

			@Override
			public boolean test(Integer arrayElem) {
				return arrayElem>0;
			}
		};
		getElements(numbers, positive);
		System.out.println("Negative elements");
		getElements(numbers, new Predicate<Integer>() { // безымянный объект

			@Override
			public boolean test(Integer arrayElem) {
				return arrayElem<0;
			}
		});
		System.out.println("Odd elements");
		getElements(numbers, new Predicate<Integer>() {

			@Override
			public boolean test(Integer arrayElem) {
				return arrayElem%2==0;
			}
		});
		System.out.println("Even Elenents");
		getElements(numbers, new Predicate<Integer>() {

			@Override
			public boolean test(Integer arrayElem) {
				return arrayElem%2!=0;
			}
		} );
	}
}
