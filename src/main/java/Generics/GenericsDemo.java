package Generics;

// A simple Generic class
class Generic <T> {
	T obj;
	
	//Pass reference to an object of type T 
	Generic(T ob) {
		obj = ob;
	}
	
	// Return Type T objet
	T getObject() {
		return obj;
	}
	
	//show type T
	void showType () {
		System.out.println("Type of T is " + obj.getClass().getName());
	}
}

class Gen2<T> extends Generic<T> {
	Gen2(T o) {
		super(o);
	}
}

public class GenericsDemo {

	public static void main(String[] args) {
		Generic<String> str1 = new Generic<String>("This is string");
		str1.showType();
        
		String str = str1.getObject();
        System.out.println("value: " +str);
		
        Generic<Integer> iObj;
        iObj = new Generic<Integer>(20);
        iObj.showType();
        
        Integer i = iObj.getObject();
        System.out.println("Value: " +i);
        
        //RAW TYPE demonstration
        Generic raw = new Generic(10); // raw type
        str1 = raw; // Ok but potentially wrong
        str1.showType(); // Ok. but potentially wrong
        System.out.println("Value = " +str1);

        // Run time type comparison demonstration
        Generic<Integer> gen1 = new Generic<Integer>(88);
        Gen2<Integer> gen2 = new Gen2<Integer>(99);
        Gen2<String> strGen2 = new Gen2<String>("Generic 2");
        
        if (gen2 instanceof Gen2<?>) {
        	System.out.println("gen2 is instance of Gen2");
        }
        
        if (gen2 instanceof Generic<?>) {
        	System.out.println("gen2 is instance of Generic");
        }
        
        if (gen1 instanceof Generic<?>) {
        	System.out.println("gen1 is instance of Generic");
        }
        
        if (!(gen1 instanceof Gen2<?>)) {
        	System.out.println("gen1 is not instance of Gen2");
        }
        
        //if (gen2 instanceof Gen2<Integer>) {
        	System.out.println("I will not compile");
        //}
	}
}
