package Lambda;

interface StringFuncInterface1 {
	String func (String str);
}

class MyStringOperation1 {
	String reverseString(String str) {
		String result = "";
		for(int i = str.length()-1; i >=0 ; i--)
		{
			result += str.charAt(i);
		}
		return result;
	}
}

public class InstanceMethodRefDemo {
	static String stringOper(StringFuncInterface strInterface, String str) {
		return strInterface.func(str);
	}
	public static void main(String[] args) {
		MyStringOperation1 myStrRefObj = new MyStringOperation1();
		System.out.println(stringOper(myStrRefObj::reverseString, "Zarfeshan"));
	}

}
