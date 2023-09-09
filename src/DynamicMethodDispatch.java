class Phone{
    public void On(){
        System.out.println("Turning On.....");
    }
    public void ShowTime(){
        System.out.println("The Time is 9 am");
    }
    public void playGame(){
        System.out.println("Playing Game");
    }
}

class SmartPhone extends Phone{
    public void On(){
        System.out.println("Turning on from SmartPhone");
    }
    public void playMusic(){
        System.out.println("Playing Music....");
    }
    public void playGame(){
        System.out.println("Playing game on SmartPhone");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        //Phone obj = new Phone();
        //obj.ShowTime();

        Phone obj = new SmartPhone();
        obj.On();
        obj.playGame();
        obj.ShowTime();

    }
}
