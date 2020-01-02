package Christmas;

import java.util.Arrays;
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
        Reindeer Dasher = new Reindeer("Dasher");
        Reindeer Dancer = new Reindeer("Dancer");
        Reindeer Prancer = new Reindeer("Prancer");
        Reindeer Vixen = new Reindeer("Vixen");
        Reindeer Comet = new Reindeer("Comet");
        Reindeer Cupid = new Reindeer("Cupid");
        Reindeer Donner = new Reindeer("Donner");
        Reindeer Blitzen = new Reindeer("Blitzen");
        Reindeer Rudolph = new Reindeer("Rudolph");
        flightCrew[0] = Dasher;
        flightCrew[1] = Dancer;
        flightCrew[2] = Prancer;
        flightCrew[3] = Vixen;
        flightCrew[4] = Comet;
        flightCrew[5] = Cupid;
        flightCrew[6] = Donner;
        flightCrew[7] = Blitzen;
        flightCrew[8] = Rudolph;

        flightCrew = addReindeer(flightCrew, new Reindeer("Olive"));

        for(Reindeer deer : flightCrew){
            System.out.println(deer.name);
        }

    }
    public static Reindeer[] flightCrew = new Reindeer[9];
    public static Reindeer[] addReindeer(Reindeer[] many, Reindeer one){
        Reindeer[] copy = Arrays.copyOf(many, many.length + 1);
        copy[copy.length -1] = one;
        return copy;
    }



}
