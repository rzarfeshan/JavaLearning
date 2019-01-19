package Classes;

class Outer {
	public int outerX;

	Outer() {
		outerX = 10;
	}

	void OuterDisplay() {

		Inner innObj = new Inner();
		innObj.innerDisplay();
		System.out.println("In Outer and Inner member is = " + innObj.innX);
		//System.out.println("In Outer and Inner member is = " + innX); // --> innX is not known to outer scope directly.
	}

	class Inner {
		public int innX;

		Inner() {
			innX = 5;
		}

		void innerDisplay() {
			System.out.println("Outer member is = " + outerX);
			System.out.println("In Inner and Inner member is = " + innX);
		}
	}
	
	static class InnerStatic {
		public int innStaticX;

		InnerStatic() {
			innStaticX = 5;
		}

		void innerDisplay() {
			Outer out = new Outer();
			System.out.println("Outer member is = " + out.outerX);
			//System.out.println("Outer member is = " + outerX); // --> Cannot access outerX without an Outer object.
			System.out.println("In Inner and Inner member is = " + innStaticX);
		}
	}
}

public class NestedClassDemo {

	public static void main(String[] args) {
		Outer outObj = new Outer();
		outObj.OuterDisplay();
		Outer.Inner inn1;
		Outer.Inner innObj1 = outObj.new Inner();
		innObj1.innerDisplay();
	}

}
