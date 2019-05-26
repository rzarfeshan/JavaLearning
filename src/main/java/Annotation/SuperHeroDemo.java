package Annotation;
class Marvel {
	@LogAnno
	String getHero() {
		return "Super Hero";
	}
	
	
	String putName () {
		return "";
	}
}

class Thor extends Marvel {
	@LogAnno (myHero = "Thor")
	public String getHero() {
		LogAnnoDemo.logIn(this, "getHero");
		return "Thor";
	}
}

class IronMan extends Marvel {
	@LogAnno
	public String getHero() {
		LogAnnoDemo.logIn(this, "getHero");
		return "IronMan";
	}
	
	@Override // It ensures that putName must be available in the superclass.
	String putName () {
		return "";
	}
}

public class SuperHeroDemo {
	public static void main(String[] args) {
		Marvel thor = new Thor();
		thor.getHero();
		Marvel ironMan = new IronMan();
		ironMan.getHero();
	}

}
