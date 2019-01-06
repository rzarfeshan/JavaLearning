package Classes;

public class SimpleBox {

	public static void main(String[] args) {
		Box myBox = new Box();
		myBox.height = 10;
		myBox.width = 2;
		myBox.depth = 3;
		
		//double volume = myBox.height * myBox.width * myBox.depth;
		//System.out.println("Volume is = " + volume);

		myBox.volume();
		System.out.println("Volume of my box is: " + myBox.calculateVolume());
		
		Box myBox1 = new Box();
		myBox1.setDimension(2, 3, 4);
		System.out.println("Volume of the myBox1 is: " + myBox1.calculateVolume());
		// TODO Auto-generated method stub

	}

}
