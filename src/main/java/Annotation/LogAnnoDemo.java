package Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface LogAnno {
	String inStr() default "Entering into";
	String outStr() default "OUT";
	String myHero() default "Thanos";
}

class MyClass {
	@LogAnno
	public void printLog() {
		LogAnnoDemo.logIn(this, "printLog");
	}
}

public class LogAnnoDemo {
	@LogAnno()
	public static void logIn(Object obj, String methodName) {
		Class<?> c = obj.getClass();
		try {
			Method m = c.getMethod(methodName);
			LogAnno anno = m.getAnnotation(LogAnno.class);
			System.out.println(anno.inStr() + ": " + c.getName() + ":" + m.getName() + "() " + anno.myHero() );

		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		MyClass cObj = new MyClass();
		cObj.printLog();
	}
}
