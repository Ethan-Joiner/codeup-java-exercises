
// remove this first line

public class MethodsLecStudent {

//  METHODS

    /*
        TO DO TOGETHER: Write a public static method called orderFood that
        prints the message "I would like fries please."
     */
    public static void orderFood() {
        System.out.println("I would like fries please");
    }


/*
    TO DO: Create a main method in this class. Use it to call your
    orderFood method. Run the program to see the results.
 */


    /*
        TO DO: Write a public static method called favoriteSong that prints
        your favorite song.
     */
    public static void favoriteSong() {
        System.out.println("Only Time: Enya");
    }


    /*
        TO DO: Write a public static method called weeksIn that prints
        message saying how many weeks you've been at Codeup.
     */
    public static void weeksIn() {
        System.out.println("10");
    }

//  METHOD OVERLOADING

/*
    TO DO TOGETHER: Overload your orderFood method. Create a version that
    takes in one String parameter which can replace the item they are
    ordering.
 */
public static void orderFood(String food) {
    System.out.printf("I would like %s please!\n", food);

}

/*
    TO DO: Overload orderFood again. Create a version that takes in two
    parameters: a String replacing the item being ordered, and an int that
    represents how many of the item they would like to order. Display a new
    message using these arguments.
 */
public static void orderFood(String item, int amount) {
    System.out.printf("Your order is %d %s\n", amount, item);
}

/*
    TO DO TOGETHER: We'll overload orderFood again. We'll still have two
    parameters in this new version, however they will both be Strings
    representing two different items the customer wants. Let's display a
    new message reflecting the change.
 */
public static void orderFood(String first, String second) {
    System.out.printf("First item is : %s and second is: %s", first, second);
}

//  RECURSION

/*
    BONUS: Take a look at the Fibonacci sequence. Write a
    recursive method that accepts an int argument representing the number
    or results printed out following the Fibonacci sequence.

    For example:

    fibonacci(5) would print -> 0 1 1 2 3
    fibonacci(10) would print -> 0 1 1 2 3 5 8 13 21 34
 */

// HINT: The recursive method should return an int for each number in the series

// HINT: you may need an additional method using a for loop to actually print
// each number. This is the one you'll call in your main()


    public static void main(String[] args) {
        orderFood("burger");
        orderFood("hot dogs", 50);
        orderFood("sushi", "pizza");
    }
}