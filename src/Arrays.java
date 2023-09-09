import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Classroom of 500 students
        //int [] marks = new int[5];
       /* int[] marks = {80,4,44,66,88,99};
        System.out.println(marks.length);
        String[] names = {"Shaheer", "Ali", "Zain", "Qureshi"};

        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
        }

        System.out.println("Printing using foreach loop");
        for(String element: names){
            System.out.println(element);
        }
*/

//        int flats[][] = new int[2][3];
//        flats[0][0] = 101;
//        flats[0][1] = 102;
//        flats[0][2] = 103;
//        flats[1][0] = 201;
//        flats[1][1] = 202;
//        flats[1][2] = 203;
//
//        for (int i = 0; i < flats.length; i++) {
//            for (int j = 0; j < flats[i].length; j++) {
//                System.out.print(flats[i][j]);
//                System.out.print("  ");
//            }
//            System.out.println("\n");
//        }

        // problem 1
        /*float[] arr = {15.1f,48.5f,88.5f,55.1f};
        float sum = 0f;
        for (float i = 0; i < arr.length; i++) {
            sum = sum+arr[(int) i];

        }
        System.out.println(sum);*/

        float[] arr = {15.1f,48.5f,88.5f,55.1f};
        float num = sc.nextFloat();
        boolean isInArr = false;
        for (float i = 0; i < arr.length; i++) {
            if (num == arr[(int) i]) {
                isInArr = true;
                break;
            }
        }
            if(isInArr){
                System.out.println("number is present in array");
            }else{
                System.out.println("num is not present in array");
            }
    }
}
