import java.util.Random;
import java.util.Scanner;

public class HighLow {
         static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        do {
             Random random = new Random();
             int winningNumber = random.nextInt(100) + 1;
             System.out.println("Give me a number to guess");
             guessGame(getInteger(1,100), winningNumber);
            System.out.println("Play again?");
        } while(sc.nextLine().equalsIgnoreCase("yes"));
    }

    public static void guessGame(int guess, int winningNumber) {

        if (guess == winningNumber) {
            System.out.println("You won");
        } else if (guess < winningNumber) {
            System.out.println("Guess higher, try again");
            guessGame(getInteger(1,100), winningNumber);
        } else {
            System.out.println("Guess lower, try again");
            guessGame(getInteger(1,100), winningNumber);
        }
    }
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int numInput = 0;
        while (numInput < min || numInput > max) {
//            System.out.println("Enter a number between one and ten.");
            numInput = sc.nextInt();
        }
        return numInput;
    }
}
