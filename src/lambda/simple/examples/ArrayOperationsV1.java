package lambda.simple.examples;

public class ArrayOperationsV1 {
	
	//найти в массиве полож, отриц, четные, нечетные эл-ты
	
	public static void outPositive(int[] num){
			for (int i = 0; i < num.length; i++) {
				if (num[i]>0) {
					System.out.println(num[i]);
				}
		}
	}
	
	public static void outNegative(int[] num){
		for (int i = 0; i < num.length; i++) {
			if (num[i]<0) {
				System.out.println(num[i]);
			}
	}
}
	public static void outEven(int[] num){
		for (int i = 0; i < num.length; i++) {
			if (num[i]%2==0) {
				System.out.println(num[i]);
			}
	}
}
	public static void outOdd(int[] num){
		for (int i = 0; i < num.length; i++) {
			if (num[i]%2!=0) {
				System.out.println(num[i]);
			}
	}
}
	
	public static void main(String[] args){
		int[] numbers={3, 4, -1, 22, -4, 33};
		System.out.println("Positive elements");
		outPositive(numbers);
		System.out.println("Negative elements");
		outNegative(numbers);
		System.out.println("Odd elements");
		outOdd(numbers);
		System.out.println("Even Elenents");
		outEven(numbers);
	}
}
