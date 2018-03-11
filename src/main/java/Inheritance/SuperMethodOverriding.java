package Inheritance;

class A1 {
	int a, b;
	A1(int i, int j) {
		a = i;
		b = j;
	}
	
	void show() {
		System.out.println("Value of a and b is " + a + " " + b);
	}
}

class B1 extends A1 {
	int c;
	B1(int i, int j, int k) {
		super(i, j);
		c = k;
	}
	
	void show () {
		super.show();
		System.out.println("Value of c = " + c);
	}
	
	// method overloading 
	void show (String msg) {
		System.out.println(msg);
	}
}

public class SuperMethodOverriding {

	public static void main(String[] args) {
		B1 myB1Obj = new B1(10, 20, 30);
		myB1Obj.show("This is an example of method overloading");
		myB1Obj.show();
		

	}

}
