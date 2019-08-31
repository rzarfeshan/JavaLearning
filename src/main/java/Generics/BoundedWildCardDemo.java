package Generics;

class TwoD {
	int x, y;
	
	TwoD (int i, int j) {
		x = i;
		y = j;
	}
}

class ThreeD extends TwoD {
	int z;
	ThreeD (int a, int b, int c) {
		super(a, b);
		z = c;
	}
}

class FourD extends ThreeD {
	int w;
	
	FourD(int a, int b, int c, int d) {
		super(a, b, c);
		w = d;
	}
}

class Coords<T extends TwoD> {
	T[] coords;
	
	Coords(T[] obj) {
		coords = obj;
	}
}

public class BoundedWildCardDemo {

	static void showXY(Coords<?> c) {
		System.out.println("X and Y coordinates are: ");
		for (int i = 0; i < c.coords.length; i++) {
			System.out.println(c.coords[i].x + " and " + c.coords[i].y) ;
		}
		System.out.println();
	}
	
	static void showXYZ(Coords<? extends ThreeD> c) {
		System.out.println("X, Y and Z coordinates are: ");
		for (int i = 0; i < c.coords.length; i++) {
			System.out.println(c.coords[i].x + ", " + c.coords[i].y + " and " + c.coords[i].z);
		}
		System.out.println();
	}
	
	static void showAll(Coords<? extends FourD> c) {
		System.out.println("X, Y, Z and T Coordinates are: ");
		for (int i = 0; i < c.coords.length; i++) {
			System.out.println(c.coords[i].x + ", " + c.coords[i].y + ", " + c.coords[i].z + " and " + c.coords[i].w);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		TwoD twoD[] = { 
				new TwoD (0, 7), 
				new TwoD(6, 8),
				new TwoD(8, 0)
		};
		
		Coords<TwoD> twoDCoords = new Coords<TwoD>(twoD);
		System.out.println("Content of twoD coords");
		showXY(twoDCoords);
		//showXYZ(twoDCoords);
		
		ThreeD threeD[] = {
				new ThreeD(2, 3, 4),
				new ThreeD(9, 8, 7)
		};
		
		Coords<ThreeD> threeDCoords = new Coords<ThreeD>(threeD);
		System.out.println("Content of threeD Coords");
		showXYZ(threeDCoords);
		showXY(threeDCoords);
		//showAll(threeDCoordsD); 
		
		FourD fourD[] = { 
				new FourD(1, 2, 3, 4)
		};
		Coords<FourD> fourDCoords =  new Coords<FourD>(fourD);
		showXY(fourDCoords);
		showXY(fourDCoords);
		showAll(fourDCoords);
	}

}
