package Basics;

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

	}

}
