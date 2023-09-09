abstract class Parent{
    public Parent(){
        System.out.println("I am a constructor from Parent");
    }

    abstract public void greet();
}

class Child extends Parent{
    @Override
    public void greet() {
        System.out.println("Hellooo");
    }
}

class FrenchChild extends Parent{
    @Override
    public void greet() {
        System.out.println("Bonjourrr Ca va Bien ?");
    }
}

public class AbstractClassandMethod {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.greet();

        FrenchChild fc = new FrenchChild();
        fc.greet();

    }
}
