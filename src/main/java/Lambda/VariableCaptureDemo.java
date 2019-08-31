package Lambda;

interface VariableCapture {
	int func(int n);
}

class Instance {
	int i;
	Instance() {
		i = 20;
	}
	Instance(int a) {
		i = a;
	}
	int getValue() {
		return i;
	}
}

public class VariableCaptureDemo {
	static int x = 100;
	public static void main(String[] args) {
		int num = 10;
		Instance i1 = new Instance();
		Instance i2 = new Instance(40);
		
		VariableCapture vc = (n) -> {
			int result = n + num + i1.getValue();
		    i1.i = 30;	// it is changing the instance variable of i1 i.e. i
		    // i1 = i2; // illegal - changing the address, loses its effectively final status.
			// num = 10;  Error - variable must be effectively final
		    x = 120; // static variable can be modified.
			return result;
		};
		// num = 10; Error - cannot use variable in lambda expression. 
		//i1 = i2;
		System.out.println("Variable Capture value: " + vc.func(5));
	}

}
