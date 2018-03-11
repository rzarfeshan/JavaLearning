package Inheritance;

class A {
	A() {
		System.out.println("This is A default constructor");
	}
	A(int a) {
		System.out.println("This is A parameter constructor");
	}
}

class B extends A {
	B() {
		System.out.println("This is B default constructor");
	}
	B(int b) {
		//super(b);
		System.out.println("This is B parameter constructor");
	}
}

class C extends B {
	C(int c) {
		//super(c);
		System.out.println("This is C parameter constructor");
	}
}

public class SuperConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C myCObj = new C(2);

	}

}
