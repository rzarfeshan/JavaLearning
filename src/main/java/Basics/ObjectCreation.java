package Basics;

public class ObjectCreation {

    private Object limit = new Object() {{
        System.out.print("A");
    }};

    public ObjectCreation() {
    	this(new Object() {{
            System.out.print("B");
        }});
        System.out.print("C");
    }

    public ObjectCreation(Object o) {
        System.out.print("D");
    }

    public static void main(String[] args) {
        new ObjectCreation();
    }
}