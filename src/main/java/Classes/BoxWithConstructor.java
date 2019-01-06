package Classes;

public class BoxWithConstructor {
	public static void main(String[] args) {
		Box noBox = new Box();
		System.out.println("Volume of noBox = " + noBox.calculateVolume());
		
		Box rectangle = new Box(5, 4, 3);
		System.out.println("Volume of rectangle = " + rectangle.calculateVolume());
		
		Box myCube = new Box(3);
		System.out.println("Volume of myCube = " + myCube.calculateVolume());
		
		Box cubeClone = new Box(myCube);
		System.out.println("Volume of Clone = " + cubeClone.calculateVolume());
	}


}
