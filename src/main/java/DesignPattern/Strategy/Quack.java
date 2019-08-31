package DesignPattern.Strategy;

public class Quack implements QuackBehavior{
	public void makeSound() {
		System.out.println("Quack");
	}

}
