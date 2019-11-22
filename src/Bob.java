import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (true) {
            if (input.endsWith("?")) {
                System.out.println("Sure");
            } else if (input.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (input.equalsIgnoreCase("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }
            input = sc.nextLine();
        }
    }
}
