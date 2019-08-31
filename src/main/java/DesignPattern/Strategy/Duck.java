package DesignPattern.Strategy;

public abstract class Duck {
 FlyBehavior flyB;
 QuackBehavior quackB;

 public void performFly() {
	 flyB.fly();
 }
 
 public void performQuack() {
	 quackB.makeSound();
 }
	
}
