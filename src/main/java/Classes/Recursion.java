package Classes;

class Factorial{
	int factCompute(int num) {
		int result;
		if (num == 1) return num;
		result = factCompute(num - 1) * num;
		return result;
	}
}

class RecArray {
	int arr[];
	RecArray(int index) {
		arr = new int[index];
	}
	
	void printArray(int index) {
		if (index == 0 ) return;
		printArray(index - 1);
		System.out.println("arr[" + (index - 1) + "] = " + arr[index - 1]);
	}
}


public class Recursion {

	public static void main(String[] args) {
		Factorial fact = new Factorial();
		System.out.println("factorial of 5 = " + fact.factCompute(5));
		
		RecArray rec1 = new RecArray(5);
		for (int i = 0; i <5; i++) rec1.arr[i] = i+1;
		rec1.printArray(5);
	}

}
