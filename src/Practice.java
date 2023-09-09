import java.util.Scanner;

class Employee{
    int id;
    int salary;
    String name;

    void getDetails(){
        System.out.println("my id is " + id);
        System.out.println("my name is " + name);
    }
    int getSalary(){
        return salary;
    }
}

class Tommy{
    public void hit(){
        System.out.println("hitting the enemy");
    }
    public void run(){
        int i = 1;
       do {
           System.out.println("running from enemy");
           i++;
       }while (i <= 5);
    }
}


public class Practice {
    public static void main(String[] args) {
        System.out.println("this is out custom class");

        Employee shaheer = new Employee();
        int id = shaheer.id = 12;
        String name = shaheer.name = "Shaheer Qureshi";
        shaheer.salary = 1422;
        //System.out.println(id + " " + name);
        shaheer.getDetails();
        int sal = shaheer.getSalary();
        System.out.println(sal);

        Tommy tom = new Tommy();
        tom.hit();
        tom.run();

    }
}