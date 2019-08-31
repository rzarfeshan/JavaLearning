package Generics;

class Gen1<T> {
	T obj;
	 
	Gen1(T tObj) {
		obj = tObj;
	}
	
	void showMe() {
		System.out.println("My Value is: " + obj);
	}
}

class NonGen1<T> extends Gen1<T> {
	int i;
	
	NonGen1(int a, T tObj) {
		super(tObj);
		i = a;
	}
	
	void showMe() {
		System.out.println("My Value is: " + i + " and " + obj );
	}
}

public class SuperClassGenDemo {
	public static void main(String[] args) {
		NonGen1<String> n1 = new NonGen1<String>(10, "Java");
		n1.showMe();
		
		Gen1<Integer> g1 = new Gen1<Integer>(10);
		g1.showMe();
	}

}
