package ExceptionHandling;

class Exc {
	public void func1() {
		try {
			int a = 0;
			int b = 12 / 0;
			System.out.println("Will this printed?");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Am I here");
		} finally {
			System.out.println("Will finally gets executed");
		}
	}
	public void func2() {
		try {
		return;
		}finally {
			System.out.println("Its finally");
		}
	}
}

class NestTry {
	static void nestTry(int a) {
		try {
			if (a==1) a = a/(a-1);
			if (a == 2) {
				int c[] = {1};
				c[42] = 20;
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException");
			throw e;
		}
	}
}

class ThrowsDemo {
	static void throwOne() throws IllegalAccessException {
		System.out.println("Inside throwOne");
		throw new IllegalAccessException();
		//throw new ArrayIndexOutOfBoundsException();
	}
}

public class ExceptionDemo {

	public static void main(String[] args) {
		/*
		 * try { Exc x = new Exc(); x.func2(); x.func1(); } catch (ArithmeticException
		 * e) { System.out.println("Caught Arithemetic exception "); }
		 */
		try {
			ThrowsDemo.throwOne();
		}
		catch(IllegalAccessException e) {
			System.out.println("Exception handled - IllegalAccessException");
			e = new IllegalAccessException("rethrow");
		}
	}

}
