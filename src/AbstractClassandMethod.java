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
    public void Sum(int num1, int num2){
        int total = num1 + num2;
        System.out.println(total);
    }
}

public class AbstractClassandMethod {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.greet();

        FrenchChild fc = new FrenchChild();
        fc.greet();

        fc.Sum(20,20);

    }
}
