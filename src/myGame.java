import java.io.Console;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int guesses = 1;
    private int randNum;
    public Game(){
        int upper = 100;
        int num = 0;
       Random rand = new Random();
       num = rand.nextInt(upper);
       System.out.println("Computer Number is: " + num);
       randNum = num;
    }
    public void setGuesses(){
        guesses++;
    }

    public int getRandomNum(){
        return this.randNum;
    }
    public int userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number to check");
        int i = sc.nextInt();
        return i;
    }
    public void isCorrectNum(){
        int compNum = this.randNum;
        int userNum = userInput();

        if(userNum > compNum){
            System.out.println("oops: computer Number is smaller--- TRY AGAIN");
            isCorrectNum();
            guesses++;
            System.out.println(guesses);
        }
        else if(userNum < compNum){
            System.out.println("oops: Computer Number is bigger--- TRY AGAIN");
            isCorrectNum();
            guesses++;
            System.out.println(guesses);
        }
        else if(userNum == compNum && guesses == 1 ){
            System.out.println("HEYYYY YOU GOT THIS IN FIRST Try");
        } else if (userNum == compNum && guesses > 1) {
            System.out.println("you got this in " + guesses + "tries");

        }
        //System.out.println("User Number is: " + userNum);
    }
}

public class myGame {
    public static void main(String[] args) {
        Game g = new Game();
        g.isCorrectNum();
    }
}
