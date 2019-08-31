package DesignProblem.ClassC;

public class ClassC {
	public static InterfaceB objIntB;
	public void C1() {
		System.out.println("Inside C:C1");
	}
	
	public void C2() {
		System.out.println("Inside C:C2");
		//ClassB objB = new ClassB();
		//objB.B1();
		objIntB.B2();
	}

}
