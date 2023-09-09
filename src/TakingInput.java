import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int totalMarks = 500;
        final int totalMark = 100;

        float mark1 = sc.nextInt();
        float mark2 = sc.nextInt();
        float mark3 = sc.nextInt();
        float mark4 = sc.nextInt();
        float mark5 = sc.nextInt();
        float percentage  = (mark1 + mark2 + mark3 + mark4 + mark5) / totalMarks * totalMark;

        System.out.println("your percentage is " + percentage);
    }
}
