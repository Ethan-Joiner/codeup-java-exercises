package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);


    public String getString(){
        return scanner.nextLine();
    }

    public boolean yesNo() {
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

    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println(input.yesNo());
        System.out.println("input.getInt(10,50) = " + input.getInt(10,50));
    }
}
