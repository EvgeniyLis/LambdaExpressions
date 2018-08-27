package lambda.simple.examples;

import java.util.Comparator;

public class DoubleSortDown implements Comparator<Double> {

	@Override
	public int compare(Double num1, Double num2) {
		return num2.compareTo(num1);
	}

}
