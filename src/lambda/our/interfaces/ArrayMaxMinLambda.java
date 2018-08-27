package lambda.our.interfaces;

import java.util.function.Predicate;

import org.omg.Messaging.SyncScopeHelper;

public class ArrayMaxMinLambda {
	
	//в массиве найти минимальный эл-т среди положительных и максимальный среди отрицательных

	/*public int numPositionPositive(int[] numbers) {
		int position=-1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]>0) {
				position=i;
				break;
			}
		}
		return position;
	}*/
	
	/*public int numPositionNegative(int[] numbers) {
		int position=-1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]<0) {
				position=i;
				break;
			}
		}
		return position;
	}*/
	
	//последующий метод лямбда заменяет два предыдущих
	
	public static int numPos(int[] numbers, Predicate<Integer> checkPos) {
		int position=-1;
		for (int i = 0; i < numbers.length; i++) {
			if (checkPos.test(numbers[i])) {
				position=i;
				break;
			}
		}
		return position;
	}
	
	/*public static int getMinPos(int[] num) {
		int minPositivePos=numPos(num, element->{return element>0;}); // определили позицию первого полож. эл-та массива
		if (minPositivePos==-1) {
			System.out.println("Array don't have finding elements");
		}else {
			for (int i = minPositivePos+1; i < num.length; i++) {
				if (num[i]<num[minPositivePos] && num[i]>0) {
					minPositivePos=i;
				}
			}
		}
		return minPositivePos;
	}
	
	public static int getMaxPos(int[] num) {
		int maxNegativePos=numPos(num, element->{return element<0;}); // определили позицию первого полож. эл-та массива
		if (maxNegativePos==-1) {
			System.out.println("Array don't have finding elements");
		}else {
			for (int i = maxNegativePos+1; i < num.length; i++) {
				if (num[i]>num[maxNegativePos] && num[i]<0) {
					maxNegativePos=i;
				}
			}
		}
		return maxNegativePos;
	}*/
	
	public static int getFindingPos(int[] num, Predicate<Integer> checkPos, MyPredicate<Integer> compareElement) {
		int findingPosElem=numPos(num, checkPos); // определили позицию полож. или отрицательного эл-та
		if (findingPosElem==-1) {
			System.out.println("Array don't have finding elements");
		}else {
			for (int i = findingPosElem+1; i < num.length; i++) {
				if (compareElement.test(num[i], num[findingPosElem]) && checkPos.test(num[i])) {
					findingPosElem=i;
				}
			}
		}
		return findingPosElem;
	}
	
	public static void prosessingArray(int[] num) {
		outArray(num);
		System.out.println("Finding of positive element");
		int numMinPos=getFindingPos(num, elem->{return elem>0;}, (elem1, elem2)->{return elem1<elem2;});
		if (numMinPos!=-1) {
			System.out.println("Minimum in group of positive is "+num[numMinPos]);
		}
		System.out.println("Finding negative element");
		int numMaxNeg=getFindingPos(num, elem->{return elem<0;}, (elem1, elem2)->{return elem1>elem2;});
		if (numMaxNeg!=-1) {
			System.out.println("Maximum in group of negative is "+num[numMaxNeg]);
		}
		System.out.println("-------------------------------------------------------");
	}
	
	public static void outArray(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] numbersPositive={2, 4, 1, 6};
		int[] numbersNegative={-2, -4, -1, -6};
		int[] numbersRegular={2, -4, -1, 6};
		int[] numbersNull={0, 0, 0, 0};
		prosessingArray(numbersPositive);
		prosessingArray(numbersNegative);
		prosessingArray(numbersRegular);
		prosessingArray(numbersNull);
	}

}
