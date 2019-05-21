package Inheritance;

public class BoxDemo {

	public static void main(String[] args) {
		Box basicBox = new Box(10, 10, 10);
		BoxWeight weightedBox = new BoxWeight(20, 20, 20, 20);
		BoxWeight weightedBox1 = new BoxWeight(30, 30, 30, 30);
		Box basicBox1 = new Box(40, 40, 40);
        //weightedBox1 = basicBox; // Super class cant be assign to child reference.
        basicBox1 = weightedBox1;
        //basicBox1.displayBoxWeight(); // basicBox1 is reference of super class, doesnt know child class members.
		basicBox.displayBox();
		weightedBox.displayBoxWeight();
		System.out.println(basicBox);
	}

}

class Box {
	private double height;
	private double width;
	private double depth;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Box [height=").append(height).append(", width=").append(width).append(", depth=").append(depth)
				.append("]");
		return builder.toString();
	}

	// Default Constructor
	Box(){
		height = -1;
		width = -1;
		depth = -1;
	}
	
	// Parametrized Constructor
	// parameter variable hiding the instance variable, in this case use "this" keyword.
	Box (double height, double width, double depth){
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	Box(double len) {
		height = width = depth = len;
	}

	Box(Box b) {
		height = b.height;
		width = b.width;
		depth = b.depth;
	}
	
	void displayBox() {
		System.out.println("Box height = " + height);
		System.out.println("Box width = " + width);
		System.out.println("Box depth = " + depth);
	}
	
	double getHeight() {return height;}
	double getWidth() {return width;}
	double getDepth() {return depth;}
}

class BoxWeight extends Box
{
	double weight;
	BoxWeight(){
		weight = -1;
	}
	BoxWeight(double height, double width, double depth, double weight) {
		//this.height = height;
		//this.width = width;
		//this.depth = depth;
		// use of super instead of above 3 initialization
		// this enables super class to defined its member private.
		super(height, width, depth);
		this.weight = weight;
	}
	
	void displayBoxWeight() {
		System.out.println("Box height = " + getHeight());
		System.out.println("Box width = " + getWidth());
		System.out.println("Box depth = " + getDepth());
		System.out.println("Box weight = " + weight);
	}
}
