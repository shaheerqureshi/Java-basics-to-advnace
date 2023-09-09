import javax.swing.plaf.IconUIResource;

interface Camera{
    void takeSnap();
    void recordVideo();
}

interface Wifi{
    String getNetworks();
    void connecToNetwork(String network);
}

class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling number " + phoneNumber);
    }
    void pickNumber(){
        System.out.println("Connecting..... ");
    }
    void takeSnap(){
        System.out.println("taking snap");
    }
}

public class defaultMethods {
    public static void main(String[] args) {

    }
}
