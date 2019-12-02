package movies;
import util.Input;
import java.util.Scanner;
import java.util.Arrays;
public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        MoviesArray moviesArray = new MoviesArray();
        Boolean keepGoing = true;
        Movie[] movies = moviesArray.findAll();
        Scanner sc = new Scanner(System.in);





        do {
            System.out.println("What would you like to do? \n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category\n");
            System.out.println("Enter your choice: ");
            String answer = input.getString();

            switch(answer) {
                case ("0"):
                    keepGoing = false;
                    break;
                case ("1"):
                    for (Movie movie : movies) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
                    break;
                case("2"):
                    for (Movie movie : movies) {
                    if (movie.getCategory().equalsIgnoreCase("animated")){
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                    break;
                case("3"):
                    for (Movie movie : movies) {
                    if (movie.getCategory().equalsIgnoreCase("drama")){
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                    break;
                case("4"):
                    for (Movie movie : movies) {
                    if (movie.getCategory().equalsIgnoreCase("horror")){
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                    break;
                case("5"):
                    for (Movie movie : movies) {
                    if (movie.getCategory().equalsIgnoreCase("scifi")){
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                    break;
                default:
                    System.out.println("Invalid entry");
                    break;
                }



//            if (answer.equalsIgnoreCase("0")) {
//                keepGoing = false;
//            }
//            if (answer.equalsIgnoreCase("1")){
//                for (Movie movie : movies) {
//                    System.out.println(movie.getName() + " -- " + movie.getCategory());
//                }
//            }
//            if (answer.equalsIgnoreCase("2")){
//                for (Movie movie : movies) {
//                    if (movie.getCategory().equalsIgnoreCase("animated")){
//                    System.out.println(movie.getName() + " -- " + movie.getCategory());
//                    }
//                }
//            }
//            if (answer.equalsIgnoreCase("3")){
//                for (Movie movie : movies) {
//                    if (movie.getCategory().equalsIgnoreCase("drama")){
//                        System.out.println(movie.getName() + " -- " + movie.getCategory());
//                    }
//                }
//            }
//            if (answer.equalsIgnoreCase("4")){
//                for (Movie movie : movies) {
//                    if (movie.getCategory().equalsIgnoreCase("horror")){
//                        System.out.println(movie.getName() + " -- " + movie.getCategory());
//                    }
//                }
//            }
//            if (answer.equalsIgnoreCase("5")){
//                for (Movie movie : movies) {
//                    if (movie.getCategory().equalsIgnoreCase("scifi")){
//                        System.out.println(movie.getName() + " -- " + movie.getCategory());
//                    }
//                }
//            }
//            else {
//                System.out.println("Invalid entry");
//            }
        } while (keepGoing);





    }
}
