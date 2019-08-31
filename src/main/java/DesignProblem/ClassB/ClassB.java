package DesignProblem.ClassB;

import DesignProblem.ClassC.ClassC;
import DesignProblem.ClassC.InterfaceB;

public class ClassB implements InterfaceB{
	
	public void B1() {
		System.out.println("Inside B:B1");
		ClassC objC = new ClassC();
		objC.C1();
	}

	@Override
	public void B2() {
		// TODO Auto-generated method stub
		
	}

}
