import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRank {
    public static void main(String[] args) {

    }

//    Take in an array of grades and round up if passing and within 2 points of a multiple of 5
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> rounded = new ArrayList<>();
        for (int grade : grades) {
            if (grade < 38) {
                rounded.add(grade);
            } else if ((grade + 1) % 5 == 0) {
                grade +=1;
                rounded.add(grade);
            } else if ((grade + 2) % 5 == 0) {
                grade += 2;
                rounded.add(grade);
            } else {
                rounded.add(grade);
            }
        }
        return rounded;
    }

//    Description wont copy over and is too long. S-T for house. A apple loc, B oj loc. Print how many of each fall in range. Must have VERY fast internet to work apparently
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int applesLanded = 0;
        int orangesLanded = 0;
        ArrayList<Integer> houseRange = new ArrayList<>();
        for (int i = s; i <= t; i++) {
            houseRange.add(i);
        }
        for (int apple : apples) {
            if (houseRange.contains(apple + a)) {
                applesLanded++;
            }
        }
        for (int orange : oranges) {
            if (houseRange.contains(orange + b)) {
                orangesLanded++;
            }
        }
        System.out.println(applesLanded);
        System.out.println(orangesLanded);
//        Internet broken?
    }
//    This is still not passing 3 tests with 100k+ tests and saying timeout. Not sure if it is my internet or inefficient code

//    Highest that K - height needs to be
    static int hurdleRace(int k, int[] height) {

        int dose = 0;
        Arrays.sort(height);
        if (k < height[height.length - 1]) {
                dose = (height[height.length - 1]) - k;
        }
        return dose;
    }

//    Each letter in the alphabet is assigned a number. Find the highest number times the length of the word
    static int designerPdfViewer(int[] h, String word) {
        int area;
        Arrays.sort(h);
        area = h[h.length - 1] * word.length();
        return area;
    }

}
