public class MethodOverloading {
    public static void main(String[] args) {
        //tellJoke();

       /* int[] marks = {55,78,68,48,15,68,48};
        change2(marks);
        System.out.println("The value of marks is: " + marks[0]);
        change(77);*/
        foo();
        foo(222);
    }
    static void foo(){
        System.out.println("Morning Bro");
    }
    static void foo(int a){
        System.out.println("Morning " + a + " Bro");
    }





    static void change(int a){
        a=98;
    }
    static void change2(int[] a){
        a[0]=98;
    }
    static void tellJoke(){
        System.out.println("I invented a new word \n" + "Plagiarism");
    }
}
