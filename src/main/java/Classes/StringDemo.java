package Classes;

public class StringDemo {

	public static void main(String[] args) {
		String str1 = "My name is";
		String str2[] = {"Rabeya", "Zarfeshan"};
		String str3 = str1 + " " + str2[0] + " "+ str2[1];
		
		System.out.println(str1);
		System.out.println(str2[0] +" "+ str2[1]);
		System.out.println(str3);
		
		
		String strObj1 = "First String";
		String strObj2 = "Second String inserted";
		String strObj3 = strObj1;
		
		System.out.println("Length of the string 1 = " + strObj1.length());
		System.out.println("Length of the string 2 = " + strObj2.length());
				
		System.out.println("Char at index 3 in strOb1: " + strObj1.charAt(3));
		
		if (strObj1.equals(strObj2)) {
			System.out.println("strObj1 == strObj2");
		}
		else {
			System.out.println("strObj1 != strObj2");
		}
		
		if (strObj1.equals(strObj3)) {
			System.out.println("strObj1 == strObj3");
		}
		else {
			System.out.println("strObj1 != strObj3");
		}
		
		String arrObj[] = {"One", "Two", "Three" ,"Four", "Five"};
		
		for (int i = 0; i < arrObj.length; i++) {
			System.out.println("arrObj[" + i + "] = " + arrObj[i] );
		}
			
		for (String x:arrObj)
			System.out.println(x);
	}

}
