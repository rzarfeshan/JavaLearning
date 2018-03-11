package Inheritance;

class Figure {
	double dimension1, dimension2;
	
	Figure (double dim1, double dim2) {
		dimension1 = dim1;
		dimension2 = dim2;
	}
	
	double area () {
		System.out.println("Area of Figure is undefined");
		return 0;
	}
}

class Triangle extends Figure {
	Triangle (double dim1, double dim2) {
		super(dim1, dim2);
	}
	
	double area() {
		System.out.println("Area for Triangle");
		return dimension1*dimension2/2;
	}
}

class Rectangle extends Figure {
	Rectangle (double dim1, double dim2) {
		super(dim1, dim2);
	}
	
	double area() {
		System.out.println("Area for Rectangle");
		return dimension1*dimension2;
	}
}


public class DynamicMethodDispatchFigure {

	public static void main(String[] args) {
		Figure fig = new Figure(10,20);
		Triangle tri = new Triangle(10,20);
		Rectangle rec = new Rectangle(10,20);

		Figure figRef;
		figRef = tri;
		System.out.println("Area of triangle = " + figRef.area());
		
		figRef = rec;
		System.out.println("Area of Rectangle = " + figRef.area());
		
		figRef = fig;
		System.out.println("Area of Figure = " + figRef.area());
	}

}
