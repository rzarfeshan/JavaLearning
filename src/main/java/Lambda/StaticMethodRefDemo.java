package Lambda;

interface StringFuncInterface {
	String func (String str);
}

class MyStringOperation {
	static String reverseString(String str) {
		String result = "";
		for(int i = str.length()-1; i >=0 ; i--)
		{
			result += str.charAt(i);
		}
		return result;
	}
}

public class StaticMethodRefDemo {

	static String stringOper(StringFuncInterface strInterface, String str) {
		return strInterface.func(str);
	}
	public static void main(String[] args) {
		// passes Method reference instead of function interface reference
		System.out.println(stringOper(MyStringOperation::reverseString, "Zarfeshan"));
	}

}
