import java.util.Scanner;
public class PracticeFunctions {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*System.out.println("Enter a number which you want to get the table for");
        int num = sc.nextInt();
        multiply(num);*/

        myPattern(20);
    }
    static void myPattern(int n){
        for(int i = 0; i <=n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void multiply(int n){
        for(int i = 1; i <=10; i++){
            System.out.printf("%d x %d = %d\n",n,i, n*i);
        }
    }
}
