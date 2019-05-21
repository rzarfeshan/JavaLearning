package Inheritance;
class A2 
{
	int i;
	
	void displayA() {
		System.out.println("Super i = " + i);
	}
}

class B2 extends A2{
	int i;
	B2(int a, int b) {
		super.i = a;
		i = b;
	}
	void display() {
		System.out.println("Super i = " + super.i);
		System.out.println("Sub i = " + i);
	}
}

public class SuperKeywordDemo {

	public static void main(String[] args) {
		B2 bObj = new B2(10, 20);
		bObj.display();
	}

}
