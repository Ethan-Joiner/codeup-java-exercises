import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        addition(1, 2);
        subtraction(3, 2);
        multiplication (1, 2);
        division(3, 2);
        mod(10, 2);
//        getInteger(1,10);
            boolean again;
        do {
            getFactorial();
            System.out.println("Would you like to continue? Enter yes or no");
            String cont = sc.nextLine();
            if (cont.equalsIgnoreCase("yes")) {
                again = true;
            } else {
                again = false;
            }
        } while (again);


    }
    public static void addition(int first, int second) {
        System.out.println(first + second);
    }
    public static void subtraction(int first, int second) {
        System.out.println(first - second);
    }
    public static void multiplication(int first, int second) {
        System.out.println(first * second);
    }
    public static void division(float first, float second) {
        System.out.println(first / second);
    }
    public static void mod(int first, int second) {
        System.out.println(first % second);
    }
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int numInput = 0;
        while (numInput < min || numInput > max) {
            System.out.println("Enter a number between one and ten.");
            numInput = sc.nextInt();
        }
        return numInput;
    }
    public static void getFactorial() {
        int userNumber = getInteger(1, 10);
        long factorial = 1;
        for (int i = 1; i <= userNumber; i++) {
            factorial *= i;
            if (i == userNumber) {
                System.out.println(userNumber + "! = " + factorial);
            }
        }
    }
}
