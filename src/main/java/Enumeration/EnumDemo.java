package Enumeration;

enum Car {
	Hyundai("i10"), Honda("City"), Maruti("800"), Ford("icon"), Jeep("Limited"), lexus;
	
	String name;
	Car(String model){
		name = model;
	}
	Car () {
		name = "not available";
	}
	
	String getModel() {
		return name;
	}
}

public class EnumDemo {
	public static void main(String[] args) {
		Car car;
		car = Car.Hyundai;
		
		System.out.println("Value of car = " + car);
		System.out.println();
		
		car = Car.Maruti;
		if (car == Car.Maruti) {
			System.out.println("car is contain = " + car);
		}
		
		Car allCars[] = Car.values();
		for (Car c: allCars) {
			System.out.println("Model of " + c + " is " + c.getModel() );
		}
		
		Car car1 = Car.valueOf("Jeep");
		System.out.println("valueOf Jeep:" + car1);
		
		switch(car) {
		case Hyundai: 
			System.out.println("I am Hyundai");
			break;
		case Honda:
			System.out.println("I am Honda");
			break;
		case Jeep:
			System.out.println("I am Jeep");
			break;
		case Ford:
			System.out.println("I am Ford");
			break;
		case Maruti:
			System.out.println("I am Maruti");
			break;
		default:
			System.out.println("I am default");
			break;
		}
	}
}
