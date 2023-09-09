interface Camera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("bonjour ca va");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording Video in 4K");
    }
}

interface Wifi2{
    String[] getNetworks();
    void connecToNetwork(String network);
}

class CellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("calling number " + phoneNumber);
    }
    void pickNumber(){
        System.out.println("Connecting..... ");
    }

}

class MySmartPhone2 extends CellPhone2 implements Wifi2, Camera2{
    public void takeSnap(){
        System.out.println("taking snap");
    }
    //public void record4KVideo(){
    //    System.out.println("Taking snap and recording video in 4K");
    //}

    public void recordVideo(){
        System.out.println("Recording Video");
    }
    public String[] getNetworks(){
        System.out.println("getting List of Networks");
        String[] networkList = {"Shaheer", "Jayden123","getYourOwnWifi"};
        return networkList;
    }
    public void connecToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}

public class PolymorphismInInterfaces {
    public static void main(String[] args) {
        Camera2 cam1 = new MySmartPhone2();
        cam1.record4KVideo();

        MySmartPhone2 msp = new MySmartPhone2();
        msp.callNumber(4568);

    }
}
