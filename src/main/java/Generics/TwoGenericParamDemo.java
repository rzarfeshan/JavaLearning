package Generics;

class TwoGenericParamClass<T, V> {
	T tObj;
	V vObj;
	
	TwoGenericParamClass(T obj1, V obj2) {
		tObj = obj1;
		vObj = obj2;
	}
	
	void showTypes() {
		System.out.println("Type of T is: " + tObj.getClass().getName());
		System.out.println("Type of V is: " + vObj.getClass().getName());
	}
	
	T getTObj() {
		return tObj;
	}
	
	V getVObj() {
		return vObj;
	}
}

public class TwoGenericParamDemo {

	public static void main(String[] args) {
		TwoGenericParamClass<Integer, String> Obj1 = new TwoGenericParamClass<Integer, String>(88, "Generic Class");
		Obj1.showTypes();
		
		Integer iObj = Obj1.getTObj();
		System.out.println("Value of T is: " + iObj);
		
		String str = Obj1.getVObj();
		System.out.println("Value of V is: " + str);
	}

}
