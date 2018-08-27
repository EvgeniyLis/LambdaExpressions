package lambda.homework;

import java.util.function.Predicate;

import org.omg.CORBA.PUBLIC_MEMBER;

import lambda.our.interfaces.MyOperation;
import lambda.our.interfaces.MyPredicate;

public class SumMultiple {
	
	//дан массив элементов, найти сумму среди положительных и произведение среди отрицательных

	
	/*public static int positiveSumm(int[] num) {
		int positiveSumm=0;
		for (int i = 0; i < num.length; i++) {
			if (num[i]>0) {
				positiveSumm+=num[i];
			}
		}

		return positiveSumm;
	}*/
	
	/*public static int negativeMultiple(int[] num) {
		int negativeMultiplu=1;
		for (int i = 0; i < num.length; i++) {
			if (num[i]<0) {
				negativeMultiplu*=num[i];
			}
		}
		return negativeMultiplu;
	}*/
	
	public static int getResult(int[] num, Predicate<Integer> condition, MyOperation operation) {
		int result=1;
		for (int i = 0; i < num.length; i++) {
			if (condition.test(num[i])) {
				result=operation.getOperation(result, num[i]);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] numbers= {2, -3, -4, 5, 6, -5};
		/*int summa=positiveSumm(numbers);
		int multiplu=negativeMultiple(numbers);*/
		/*int summa=getResult(numbers, new Predicate<Integer>() {

			@Override
			public boolean test(Integer num) {
				return num>0;
			}
		}, new MyOperation() {
			
			@Override
			public int getOperation(int res, int elem) {
				return res+elem;
			}
		})-1;
		int multiplu=getResult(numbers, new Predicate<Integer>() {

			@Override
			public boolean test(Integer num) {
				return num<0;
			}
		}, new MyOperation() {
			
			@Override
			public int getOperation(int res, int elem) {
				return res*elem;
			}
		});*/
		int summa=getResult(numbers, num->{return num>0;}, (res, elem)->{return res+elem;})-1;
		int multiplu=getResult(numbers, num->{return num<0;}, (res, elem)->{return res*elem;});
		System.out.println("Summ of positive is "+summa);
		System.out.println("Multiplu of negative is "+multiplu);
		
	}

}
