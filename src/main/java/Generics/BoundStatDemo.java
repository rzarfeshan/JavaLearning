package Generics;

class NonBoundStat<T> {
	T[] nums;
	
	NonBoundStat(T[] tObj) {
		nums = tObj;
	}
	
	double average() {
		double sum = 0.0;
		for (int i = 0; i < nums.length; i++)
		{
	//		sum += nums[i].doubleValue(); // Compiler doen't know that the intending to create nonBoundStat object
										  // on only numeric type class
		}
		return sum/nums.length;
	}
}

class BoundStat<T extends Number> {
	T[] nums;
	
	BoundStat(T[] tObj) {
		nums = tObj;
	}
	
	double average() {
		double sum = 0.0;
		for (int i = 0; i < nums.length; i++)
		{
			sum +=nums[i].doubleValue(); // Defines an upper limit that only intending class would be Number or subclass of Number
		}
		return sum/nums.length;
	}
	
	boolean isSameAverage(BoundStat<?> statObj) {
		if (average() == statObj.average()) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class BoundStatDemo {

	public static void main(String[] args) {
		Integer numArray[] = {1, 2, 3, 4, 5};
		BoundStat<Integer> iObj = new BoundStat<Integer> (numArray);
		Double iAverage = iObj.average();
		System.out.println("Integer average is: " +iAverage);
		
		Double dArray[] = {1.1, 2.2, 3.3, 4.4, 5.5};
		BoundStat<Double> dStat = new BoundStat<Double>(dArray);
		Double dAverage = dStat.average();
		System.out.println("Average of the double: " + dAverage);
		
		// Below line of code is result in Compilation error as String is not a subclass of Number.
		// So, String is not a valid type parameter substitute for T
		/*
		String strArray[] = {"1", "2", "3"};
		BoundStat<String> strStat = new BoundStat<String>(strArray);
		Double strAverage = strStat.average();
		System.out.println("Average of the String: " + strAverage);
		*/
		
		if (dStat.isSameAverage(iObj)) {
			System.out.println("Same Average");
		}
		else {
			System.out.println("Average is not same");
		}
	}
}
