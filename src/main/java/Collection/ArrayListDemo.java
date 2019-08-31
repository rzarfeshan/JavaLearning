package Collection;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> arrStr = new ArrayList<String>();
		System.out.println(arrStr.size());
		arrStr.add("abc");
		System.out.println(arrStr.size());
		arrStr.add("bcd");
		arrStr.add("cde");
		System.out.println(arrStr);
		System.out.println(arrStr.size());
		arrStr.remove(0);
		System.out.println(arrStr);
		System.out.println(arrStr.size());
		
		ArrayList <Integer> arrInt = new ArrayList<Integer>(3);
		System.out.println(arrInt.size());
		arrInt.add(1); // Autoboxing is done to store the primitive type in Object type.
		arrInt.add(2);
		arrInt.add(3);
		arrInt.add(4);
		System.out.println(arrInt.size());
		System.out.println(arrInt);
		arrInt.ensureCapacity(5);  // increase the capacity to prevent reallocation.
		System.out.println(arrInt.size());
		arrInt.trimToSize(); // decrease the capacity to the size of the array list
		System.out.println(arrInt.size());
		
		// using toArray ()
		
		Integer numArray[] = new Integer[arrInt.size()];
		numArray = arrInt.toArray(numArray);
		
		int sum = 0;
		for (int i:numArray) {
			sum+=i;
		}
		System.out.println("Sum is " + sum);
		
	}

}
