package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target (ElementType.TYPE)
@Retention (RetentionPolicy.RUNTIME)
@interface targetAnno {
}

@Target ({ElementType.TYPE, ElementType.METHOD})
@Retention (RetentionPolicy.RUNTIME)
@interface targetAnno1 {
}

@targetAnno
@targetAnno1
public class TargetDemo {
	
	//@targetAnno --> Since it is of target "type", it wont work with method. 
	//                It will only work with class, interface and Enumeration.
	@targetAnno1
	public void printMe () {
		System.out.println("Rabeya");
	}


}
