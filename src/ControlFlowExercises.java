import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = sc.nextInt();
        System.out.printf("What number would you like to go up to? %d%n%n", input);
        System.out.println("Here is your table!\n");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int i = 1; i <= input; i++) {
            System.out.printf("%d      | %d       | %d\n", i, (i * i), (i * i * i));
        }
    }
}
