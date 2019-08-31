package Generics;

class NonGeneric {
	Object obj;
	
	NonGeneric(Object ob) {
		obj = ob;
	}
	
	void showType() {
		System.out.println("Type of the Object is: " + obj.getClass().getName());
	}
	
	Object getObject() {
		return obj;
	}
}

public class NonGenericDemo {

	public static void main(String[] args) {
		NonGeneric iObj = new NonGeneric(22);
		iObj.showType();
		
		Integer i = (Integer)iObj.getObject();
		System.out.println("Value: " + i);
		
		NonGeneric strObj = new NonGeneric("I am of String type");
		strObj.showType();
		
		String str = (String)strObj.getObject();
		System.out.println("Value: " + str);
		
	}

}
