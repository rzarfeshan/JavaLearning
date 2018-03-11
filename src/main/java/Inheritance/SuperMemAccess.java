package Inheritance;

class SuperA {
	private int i;
	SuperA (int a) {
		i = a;
		System.out.println("Initializing SuperA, i = " + i);
	}
}

class SubB extends SuperA{
	int i;
	SubB (int a, int b) {
		super(a);
		//super.i = a;  // i is private to SuperA, hence not accessible
		i = b;
	}
	void printValue () {
		//System.out.println("Value of A's i = " + super.i);
		System.out.println("Value of B's i = " + i);
	}
}

public class SuperMemAccess {

	public static void main(String[] args) {
		
		SubB myBObj = new SubB(5, 10);
		myBObj.printValue();

	}

}
