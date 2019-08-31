package Lambda;

interface GenericInterface<T> {
	T func(T t);
}

public class GenericInterfaceDemo {

	public static void main(String[] args) {
		GenericInterface<Integer> f1 = (n) -> {
			int result = 1;
			for (int i = 1; i <= n ; i++ )
				result = result * i;
			return result; 
		};
		System.out.println("Factorial of 5 is: " + f1.func(5));
		
		// Reverse a String
		GenericInterface<String> revStr = (str) -> {
			String result = ""; 
			for (int i = str.length()-1; i>=0; i--)
			{
				result += str.charAt(i);
			}
			return result;
		};
		
		System.out.println("Reverse of Expression is : " + revStr.func("expression"));
		System.out.println("Reverse of Rabeya is : " + revStr.func("rabeya"));
	}

}
