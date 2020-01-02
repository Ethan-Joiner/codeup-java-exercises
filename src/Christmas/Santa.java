package Christmas;

import java.util.Scanner;
public class Santa {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Boolean flag = true;
        while (flag) {
            System.out.println("What would you like for Christmas?");
            String request = sc.nextLine();
            if (request.length() > 2) {
                flag = false;
            }
        }
    }

}
