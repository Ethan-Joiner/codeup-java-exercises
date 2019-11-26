package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);


    public String getString(){
        scanner.nextLine();
        return scanner.nextLine();
    }

    public boolean yesNo() {
        scanner.nextLine();
        String input = scanner.nextLine();
        return  input.equalsIgnoreCase("yes") ||
                input.equalsIgnoreCase("y") ||
                input.equalsIgnoreCase("yep") ||
                input.equalsIgnoreCase("yeah") ||
                input.equalsIgnoreCase("of course") ||
                input.equalsIgnoreCase("indeed");
    }

    public int getInt(int min, int max) {
            int input;
        do {
            System.out.println("Enter a number");
            input = scanner.nextInt();
        } while (input < min || input > max);
        return input;
    };

    public int getInt() {
        System.out.println("Enter a number");
        return scanner.nextInt();
    };

    public double getDouble(double min, double max) {
        double input;
        do {
            System.out.println("Enter a number");
            input = scanner.nextDouble();
        } while (input < min || input > max);
        return input;
    };

    public double getDouble() {
        System.out.println("Enter a number");
        return scanner.nextDouble();
    };

    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println(input.yesNo());
        System.out.println("input.getInt(10,50) = " + input.getInt(10,50));
    }
}
