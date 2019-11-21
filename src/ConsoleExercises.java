import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is approximately %.2f%n", pi);
//
        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter a number");
//        int userInt = scanner.nextInt();
//
//        System.out.println("Enter three words");
//        String wordOne = scanner.next();
//        String wordTwo = scanner.next();
//        String wordThree = scanner.next();
//
//        System.out.println(wordOne);
//        System.out.println(wordTwo);
//        System.out.println(wordThree);

//        System.out.println("Enter a sentence");
//        String sentence = scanner.nextLine();
////        scanner.next();
//        System.out.printf("Your sentence was %s%n", sentence);

        System.out.println("Enter the length of your classroom as a number");
        String lengthString = scanner.nextLine();
        float lengthInt = Float.parseFloat(lengthString);
        System.out.println("Enter the width of your classroom as a number");
        String widthString = scanner.nextLine();
        float widthInt = Float.parseFloat(widthString);
        System.out.printf("The area of your room is %f%n", lengthInt * widthInt);
        System.out.printf("The perimeter of your room is %f%n", lengthInt * 2 + widthInt * 2);





    }
}
