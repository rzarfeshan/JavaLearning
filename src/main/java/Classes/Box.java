package Classes;

public class Box {
	double height;
	double width;
	double depth;
	
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
	
	// Calculate volume and display
	// Simple Method
	public void volume()
	{
		System.out.println(height*width*depth);
	}
	
	// Calculate volume and return
	// Method returning volume
	public double calculateVolume() 
	{
		return height*width*depth;
	}
	
	//Method that sets Box dimension
	// Parametrized Method
	public void setDimension(double paramHeight, double paramWidth, double paramDepth) {
		height = paramHeight;
		width = paramWidth;
		depth = paramDepth;
	}
}
