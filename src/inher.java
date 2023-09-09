class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a cinstructor");
    }
}

class derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Animal{
    int legs;
    String name;
    String type;
    Animal(){
        System.out.println("I am a constructor");
    }
    Animal(String speak){
        System.out.println(" I can do " + speak);
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class Dog extends Animal{
    String speak;
    Dog(){
        System.out.println("i am a dog");
    }
    Dog(String speakk){
        super(speakk);
    }

    public String getSpeak() {
        //speak = "I can Bark too";
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }
}




public class inher {
    public static void main(String[] args) {
        Dog d = new Dog("WOOF WOOF");
        //d.setSpeak("I can Bark woof woof");
        d.setLegs(4);
        System.out.println(d.getSpeak());
        System.out.println(d.getLegs());

    }
}
