package DesignPattern.Strategy;

public class MallardDuck extends Duck {
	MallardDuck() {
		flyB = new FlyWithWings();
		quackB = new Quack();
	}
	
}
