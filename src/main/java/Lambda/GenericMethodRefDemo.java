package Lambda;

interface GenInterface<T> {
	int func(T[] t, T v);
}

class MyOperClass {
	static <T> int countMatching(T[] t, T v) {
		int count = 0;
		for (int i = 1; i < t.length; i++) {
			if (t[i] == v) {
				count++;
			}
		}
		return count;
	}
}

public class GenericMethodRefDemo {
	static <T> int myFuncRef(GenInterface<T> gen, T[] t, T v) {
		return gen.func(t, v);
	}
	public static void main(String[] args) {
		Integer numArr[] = {1, 2, 4, 3, 4, 5, 6, 4, 4};
		String strArr[] = {"one", "two", "three", "two"};
		
		int count = myFuncRef(MyOperClass::<Integer>countMatching, numArr, 4);
		System.out.println(count);
		
		int countStr = myFuncRef(MyOperClass::<String>countMatching, strArr, "two");
		System.out.println(countStr);
	}

}
