class MyEmployee{
    private int id;
    private String name;
    private int age;

    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }

    public void setAge(int a){
        this.age = a;
    }
    public int getAge(){
        return age;
    }
}

class Office{
    private int totalEmp;
    private String deps;


}


public class settersgetters {
    public static void main(String[] args) {

        MyEmployee emp = new MyEmployee();
        emp.setId(12);
        emp.setName("Shaheer");
        emp.setAge(27);

        emp.setId(13);
        emp.setName("Nawaz");
        emp.setAge(28);

        String eName = emp.getName();
        int eId = emp.getId();
        int eAge = emp.getAge();

        System.out.println(eName);
        System.out.println(eId);
        System.out.println(eAge);

    }
}
