package review;

import java.util.Arrays;

public class ArraysReview {
    static String[] names= new String[4];

    public static void main(String[] args) {
        Arrays.fill(names, "Jeff");

        names = Arrays.copyOf(names, 5);

        Arrays.fill(names, "Tim");
    }
}
