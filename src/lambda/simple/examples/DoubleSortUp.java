package lambda.simple.examples;

import java.util.Comparator;

public class DoubleSortUp implements Comparator<Double> {

	@Override
	public int compare(Double num1, Double num2) {
		return num1.compareTo(num2);
	}

}
