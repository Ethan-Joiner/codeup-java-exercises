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
            System.out.println("5 - view movies in the scifi category");
            System.out.println("6 - add a movie");
            System.out.println("7 - search for movie by name\n");
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
                case("6"):
                    System.out.println("Please enter a name");
                    String name = input.getString();
                    System.out.println("Please enter a category");
                    String category = input.getString();
                    Movie newMovie[] = addMovie(movies, new Movie(name, category));
                    movies = newMovie;
                    break;
                case("7"):
                    System.out.println("Enter the name of the movie you're trying to find");
                    String searchTerm = input.getString();
                    for (Movie movie : movies) {
                        if (movie.getName().equalsIgnoreCase(searchTerm)) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case("8"):
                    System.out.println("Enter the name of the movie you would like to delete");
                    String delete = input.getString();

                    int index = -1;

                    for (int i = 0; (i < movies.length) && (index == -1); i++) {
                        if (movies[i].getName().equalsIgnoreCase(delete)) {
                            index = i;
                            int originalPosition = index;
                            int newPosition = movies.length -1;
                            Movie temp = movies[originalPosition];
                            movies[originalPosition] = movies[newPosition];
                            movies[newPosition] = temp;
                            Movie deletedMovie[] = deleteMovie(movies);
                            movies = deletedMovie;
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
    public static Movie[] addMovie(Movie[] moviesList, Movie movie) {
        Movie[] copy = Arrays.copyOf(moviesList, moviesList.length + 1);
        copy[copy.length - 1] = movie;
        return copy;
    }
    public static Movie[] deleteMovie(Movie[] moviesList) {
        Movie[] copy = Arrays.copyOf(moviesList, moviesList.length - 1);
        return copy;
    }
}
