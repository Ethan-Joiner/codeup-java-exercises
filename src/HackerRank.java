import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRank {
    public static void main(String[] args) {
//        int[] test = {2,5,1,3,4,4,3,5,1,1,2,1,4,1,3,3,4,2,1};
        ArrayList<Integer> testing = new ArrayList<>(Arrays.asList(2,5,1,3,4,4,3,5,1,1,2,1,4,1,3,3,4,2,1));
        System.out.println(birthday(testing,18,7));

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
//    Come back to this
//    static int designerPdfViewer(int[] h, String word) {
//        int area;
//        int start = 0;
//        String alpha = "abcdefghijklmnopqrstuvwxyz";
//        for (int i = 0; i < h.length - 1; i ++) {
//            if (h[i] > start && word.contains(alpha[i])) {
//
//            }
//        }
////        Arrays.sort(h);
//        area = h[h.length - 1] * word.length();
//        return area;
//    }

//    Tally times highest and lowest are reached from array
    static int[] breakingRecords(int[] scores) {
        int min = scores[0];
        int max = scores[0];
        int minCount = 0;
        int maxCount = 0;
        int[] maxMin = new int[2];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                maxCount++;
                max = scores[i];
            } else if (scores[i] < min) {
                minCount++;
                min = scores[i];
            }
        }
        maxMin[0] = maxCount;
        maxMin[1] = minCount;
        return maxMin;
    }

//    S is array of numbers to be added, d is total expected, m is how many touching can be considered
    static int birthday(List<Integer> s, int d, int m) {
        int total = 0;
        int counter = 0;
        for (int i = 0; i < s.size(); i++) {
            int start = i;
            for (int j = 0; j < m; j++) {
                if (start < s.size()) {
                    total += s.get(start);
                    start++;
                    System.out.println("Start is " + start);
                }
                if (total == d) {
                    System.out.println("I is " + i);
                    counter++;
                    total = 0;
                }
            }
            total = 0;
        }
        return counter;
    }

//    Take in an array and an int. Find how many pairs in the array are evenly divisible by k
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            for (int j = (i + 1); j < n; j++){
                if ((ar[i] + ar[j]) % k == 0) {
                    total++;
                }
            }
        }
        return total;
    }
}
