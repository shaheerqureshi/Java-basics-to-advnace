interface Bicycle{
    int a = 40;
    int b = 70;
    void applyBreak(int decrement);
    void applySpeed(int increment);
}

interface Blowhorns{
    void blowhornkk();
    void blowhornmm();
}

class AvonCycle implements Bicycle, Blowhorns{
    void blowHorn(){
        System.out.println("pee peeee");
    }
    public void applyBreak(int decrement){
        System.out.println("applying break");
    }
    public void applySpeed(int increment){
        System.out.println("increasing speed");
    }

    @Override
    public void blowhornkk() {
        System.out.println("blowinggggggggggg");
    }

    @Override
    public void blowhornmm() {
        System.out.println("blowingg at maxxx");

    }
}


public class InterfacesJava {
    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();
        ac.applyBreak(50);

        // can create properties in Interface
        System.out.println(ac.a);
        System.out.println(ac.b);

        //cannot modify the interfaces
        // ac.a = 445;

        ac.blowhornkk();
        ac.blowhornmm();

    }
}
