interface Bicycle{
    int a = 40;
    void applyBreak(int decrement);
    void applySpeed(int increment);
}

class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("pee peeee");
    }
    public void applyBreak(int decrement){
        System.out.println("applying break");
    }
    public void applySpeed(int increment){
        System.out.println("increasing speed");
    }
}


public class InterfacesJava {
    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();
        ac.applyBreak(50);

    }
}
