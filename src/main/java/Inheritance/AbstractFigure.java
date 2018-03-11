package Inheritance;

abstract class Figure1 {
	double dimension1, dimension2;
	
	Figure1 (double dim1, double dim2) {
		dimension1 = dim1;
		dimension2 = dim2;
	}
	
	abstract double area (); 
}

class Triangle1 extends Figure1 {
	Triangle1 (double dim1, double dim2) {
		super(dim1, dim2);
	}
	
	double area() {
		System.out.println("Area for Triangle");
		System.out.println(" ");
		return dimension1*dimension2/2;
	}
}

class Rectangle1 extends Figure1 {
	Rectangle1 (double dim1, double dim2) {
		super(dim1, dim2);
	}
	
	double area() {
		System.out.println("Area for Rectangle");
		return dimension1*dimension2;
	}
}


public class AbstractFigure {
	public static void main(String[] args) {
		//Figure1 fig = new Figure1(10,20);
		Triangle1 tri = new Triangle1(10,20);
		Rectangle1 rec = new Rectangle1(10,20);

		Figure1 figRef;
		figRef = tri;
		System.out.println("Area of triangle = " + figRef.area());
		
		figRef = rec;
		System.out.println("Area of Rectangle = " + figRef.area());
		
		//figRef = fig;
		//System.out.println("Area of Figure = " + figRef.area());
	}
}
