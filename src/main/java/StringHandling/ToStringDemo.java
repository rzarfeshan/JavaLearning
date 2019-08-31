package StringHandling;

class Box {
	int height;
	int width;
	int depth;

	Box() {
		height = 12;
		width = 10;
		depth = 16;
	}

	@Override
	public String toString() {
		return "Dimensions are: " + height + " by " + width + " by " + depth;
	}
	
	@Override
	public boolean equals(Object b1) {
		Box b = (Box)b1;
		return ((this.depth == b.depth) && (this.height==b.height) && (this.width==b.width));
	}
}

public class ToStringDemo {

	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box();

		System.out.println(b1.equals(b2));
		System.out.println(b1 == b2);

		String s1 = "Box " + b1;
		System.out.println(s1);
		System.out.println(b1);
		
	}

}
