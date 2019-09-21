package Basics;

import javax.management.RuntimeErrorException;

public class HelloWorld {
public static final String SLIDES = "Slides";
	
public static final boolean isAcceptable(String type) {
	if (!(type  instanceof String)) {
		return false;
	}
	
	if (!type.equals(SLIDES)) {
		return false;
	}
	return true;
}

private static int poistiveCheck(int x, int y) {
	assert (x > y) :  "failed";
	return x-y;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello to the Java world");
		System.out.println(poistiveCheck(20, 19));
		poistiveCheck(18, 19);
		boolean boolA = false;
		boolean boolB = false;
		
		if (boolA = boolB) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are unequal");
		}

		int i1 =1; 
		int i2=2;
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(i1&i2);
		System.out.println((i1|i2) == 3);
		System.out.println((i1^i2) < 4);
		System.out.println(b1 | !b2);
		
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" ").deleteCharAt(0).insert(0,"H").append("Waorld!");
		System.out.println(sb);
		System.out.println(print());
	}
	static Exception print() {
		return new Exception();
	}

}
