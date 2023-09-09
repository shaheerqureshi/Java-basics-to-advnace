public class VarArgs {
    public static void main(String[] args) {
        System.out.println("welcome to varArgs");
        System.out.println("The sum of 4, 5 is: " + sum(4,5));
        System.out.println("The sum of 4, 5 is: " + sum(4,5,8));
        System.out.println("The sum of 4, 5 is: " + sum(4,5,8,77));
    }
    /*static int sum(int a, int b){
        return a + b;
    }*/

    static int sum(int ...arr){
        //Available as int[] arrr;
        int result = 0;
        for(int a: arr){
            result +=a;
        }
        return result;
    }
}
