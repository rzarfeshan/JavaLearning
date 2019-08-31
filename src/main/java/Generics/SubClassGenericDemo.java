package Generics;

class NonGen {
	int i;
	
	NonGen(int a) {
		i = a;
	}
	
	void showMe() {
		System.out.println("My value is: " + i);
	}
}

class Gen<T> extends NonGen {
	T obj;
	
	Gen(T tObj, int a) {
		super(a);
		obj = tObj;
	}
	
	void showMe() {
		System.out.println("Gen value is: " + obj);
	}
}

public class SubClassGenericDemo {

	public static void main(String[] args) {
		Gen<String> genObj = new Gen<String>("Rabeya", 100);
		genObj.showMe();
		
		NonGen nonGen = new Gen<String>("Rabab", 20);
		nonGen.showMe();
		
		NonGen nonGen1 = new NonGen(10);
		nonGen1.showMe();
	}
}
