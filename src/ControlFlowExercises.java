import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Boolean another = true;
        do {
            System.out.println("Give me a number between 0 and 100");
            byte gradeNumber = sc.nextByte();
            if (gradeNumber >= 88) {
                System.out.println("A");
            } else if (gradeNumber >= 80) {
                System.out.println("B");
            } else if (gradeNumber >= 67) {
                System.out.println("C");
            } else if (gradeNumber >= 60) {
                System.out.println("D");
            } else if (gradeNumber >= 0) {
                System.out.println("F");
            } else {
                System.out.println("Invalid Input");
            }
            System.out.println("Would you like to enter another grade? Enter Yes or No");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("yes")) {
                another = true;
            } else if (answer.equalsIgnoreCase("no")) {
                another = false;
            }

        } while (another);
    }
}