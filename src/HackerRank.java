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
//    Consider starting over, plan does not work
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
//    Not sure what the problem is, still failing a couple tests. Ask sophie/justin
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
//    May need to delete and start over. Find on site for refresher
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
//    Return to this. Need to find on the site
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

//    Take in a list of items charged (bill), add together and remove index of k, if equals B correct, if not print difference
//    Passed 10/12, needs review. Ask sophie/justin
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int total = 0;
        for (int item: bill) {
            if (item != bill.get(k)) {
                total += item;
            }
        }
        if (total / 2 == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - (total / 2));
        }
    }

//    Take in n (length of array) and an array and return the number of pairs
//    Established pairs at 0. Sorted array to put numbers in order. Ran loop from first number through second to last. If there was a match pairs was in creased by one, and the index was increased by two. If not, the next number was checked
    static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        Arrays.sort(ar);
        for (int i = 0; i < (n - 1); i ++) {
            if (ar[i] == ar[i + 1]) {
                pairs++;
                i++;
            }
        }
        return pairs;
    }

//    N is the number of pages in the book, p is the desired page. Write a function to determine the minimum number of page turns. Even numbered pages will be on the left, odds on the right
    static int pageCount(int n, int p) {
        int turnCount = 0;
//        If the number of total pages - desired page is smaller, start from the back of the book, else start from the front
        if (n - p < n - 1) {
            if (n - p == 1 && )
        } else if (n - p > n - 1) {
        }
        return turnCount;
    }

// N is the number of "valleys" entered. String will containt U (+1) and D(-1). Starting from 0, n should be the number of times it gets below zero
    static int countingValleys(int n, String s) {
        int valleys = 0;
        int position = 0;
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) == 'U') {
                position++;
            } else if (s.charAt(i) == 'D') {
                if (position == 0) {
                    valleys++;
                }
                position--;
            }
        }
        return valleys;
    }

//    Starting at 1, rotate between doubling and adding 1.
    static int utopianTree(int n) {
        int height = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                height *= 2;
            } else {
                height++;
            }
        }
        return height;
    }
// K is number required (at minimum). A is array of numbers that anything <=0 is good and over is bad.
//    Created empty number variable and empty string variable. Looped through and if conditions were meant increased count
    static String angryProfessor(int k, int[] a) {
        int onTime = 0;
        String cancelled = "";
        for (int i = 0; i < a.length; i ++){
            if (a[i] <= 0) {
                onTime++;
            }
        }
        if (onTime >= k) {
            cancelled = "NO";
        } else {
            cancelled = "YES";
        }
        return cancelled;
    }

//    I is start day, j is last day. Test each day by subtracting it from its reverse. If evenly divisible by K then increase days
    static int beautifulDays(int i, int j, int k) {
        int days = 0;
        String reverse = "";
        List<Integer> range = new ArrayList<>();
        for (int x = i; x <= j; x++) {
            range.add(x);
        }



        return days;

    }
}
