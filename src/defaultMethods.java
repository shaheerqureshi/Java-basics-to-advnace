import javax.swing.plaf.IconUIResource;

interface Camera{
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

interface Wifi{
    String[] getNetworks();
    void connecToNetwork(String network);
}

class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling number " + phoneNumber);
    }
    void pickNumber(){
        System.out.println("Connecting..... ");
    }

}

class MySmartPhone extends CellPhone implements Wifi, Camera{
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
public class defaultMethods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        String[] nwks = ms.getNetworks();
        for (String item:nwks) {
            System.out.println(item);
        }

    }
}
