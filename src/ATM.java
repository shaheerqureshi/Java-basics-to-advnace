import java.util.Scanner;

import static java.lang.System.exit;

public class ATM {
    static int balance = 50000;
    static int savBalance = 30000;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Press 1 to Begin");
        int i = sc.nextInt();
        if(i == 1){
            System.out.println("Please enter your pin");
            int pinn = sc.nextInt();
            insertPin(pinn);
        }
    }
    static void insertPin(int pin){
        if(pin == 1234){
            System.out.println("Pin entered successfully");
            selectAcc();
        }else{
            System.out.println("invalid pin");
        }
    }
    static void selectAcc(){
        System.out.println("please select account");
        System.out.println("Press 1 for Current");
        System.out.println("Press 2 for Saving");
        System.out.println("Press 3 for back");
        int acc = sc.nextInt();
        switch (acc){
            case 1:
                System.out.println("your balance in current account is: " + balance);
                withdrawFromCurr();
                break;
            case 2:
                System.out.println("Your balance in Savings is: " + savBalance);
                withdrawFromSav();
                break;
            case 3:
                return;
            default:
                System.out.println("Please Enter a valid Input");
                selectAcc();
        }
    }
    static void withdrawFromCurr(){
        System.out.println("Select the amount you want to withdraw");
        int finalBal = sc.nextInt();
        balance -= finalBal;
        System.out.println("Your total balance is " + balance);
        Thanks();
    }
    static void withdrawFromSav(){
        System.out.println("Select the amount you want to withdraw");
        int finalBal = sc.nextInt();
        savBalance -= finalBal;
        System.out.println("Your total balance is " + savBalance);
        Thanks();
    }

    static void Thanks(){
        System.out.println("Thanks for using atm");
    }

}
