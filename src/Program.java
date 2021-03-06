import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Program {

    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, -4, 0};

//        plusMinus(numbers);
//        staircase(4);
//        System.out.println(timeConversion("06:40:03AM"));
//        System.out.println(timeConversion("13:40:22AM"));
//        System.out.println(hackerrankInString("hacakaeararanaka"));
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));

    }

    //    Take a string and swap the first and last letter, unless they are the same, or the string is too short
    public static String flipEndChars(String s) {
        if (s.length() < 2) {
            System.out.println("Incompatible");
            return "Incompatible";
        } else if (s.charAt(s.length() - 1) == (s.charAt(0)) && s.length() > 2) {
            System.out.println("Two's a pair.");
            return "Two's a pair.";
        } else {
            String swap = "";

            swap += s.charAt(s.length() - 1);

            for (int i = 1; i < s.length() - 1; i++) {
                swap += s.charAt(i);
            }
            swap += s.charAt(0);
            System.out.println(swap);
            return swap;
        }
    }


    public static boolean getXO(String str) {
        int x = 0;
        int o = 0;
        boolean equal = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' || str.charAt(i) == 'X') {
                x++;
            } else if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
                o++;
            }
        }
        if (x == o) {
            equal = true;
        }
        return equal;
    }

    // Method to take in a string and return a string the same but without any vowels
    public static String removeVowels(String s) {
        String noVowel = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u' && s.charAt(i) != 'A' && s.charAt(i) != 'E' && s.charAt(i) != 'I' && s.charAt(i) != 'O' && s.charAt(i) != 'U') {
                noVowel += s.charAt(i);
            }
        }
        return noVowel;
    }

    // UNFINISHED
    public static String missingLetter(String str) {
        String alph = "abcdefghijklmnopqrstuvwxyz";
        String missing = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < alph.length(); j++) {
                if (alph.charAt(j) == str.charAt(i)) {
                    System.out.println(alph.charAt(j + 1));

                    if (j + 1 != str.length() && i + 1 != str.length() && i + 1 != alph.length()) {
                        if (alph.charAt(j + 1) != str.charAt(i + 1)) {
                            missing += alph.charAt(i + j);
                            System.out.println(missing);
                            break;
                        } else {
                            missing = "No Missing Letter";
                        }
                        break;
                    }
                    break;
                }
                if (!missing.equalsIgnoreCase("")) {
                    break;
                }
            }
        }
        System.out.println(missing);
        return missing;
    }

    // Method to take in a string and reverse the case of every letter
    public static String reverseCase(String str) {
        String j = "";
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            j += str.charAt(i);
            if (!j.equals(j.toLowerCase())) {
                reverse += j.toLowerCase();
                j = "";
            } else if (!j.equals(j.toUpperCase())) {
                reverse += j.toUpperCase();
                j = "";
            }
        }
        System.out.println(reverse);
        return reverse;
    }

    // Method to take in an array and return boom if 7 appears.
    public static String sevenBoom(int[] arr) {
        String boom = "there is no 7 in the array";
        for (int num : arr) {
            String number = String.valueOf(num);
            System.out.println(number);
            for (int i = 0; i < number.length(); i++) {
                if (number.charAt(i) == '7') {
                    boom = "Boom!";
                    break;
                }
            }
        }
        System.out.println(boom);
        return boom;
    }

    // UNFINISHED
    public static String erase(String str) {
        char j = ' ';
        char k = ' ';
        String erased = "";
        for (int i = 0; i < str.length() - 1; i++) {
            j = str.charAt(i);
            k = str.charAt(i + 1);
            if (j != '#' && k != '#') {
                erased += j;
            }
        }
        System.out.println(erased);
        return erased;
    }

    // Method to take in two strings, and add letters, in order, of the smaller string to itself until they are the same length
    public static String lengthen(String str1, String str2) {
        String longer = "";
        boolean flag = true;
        while (flag) {
            if (str1.length() > str2.length()) {
                longer = str2;
                for (int i = 0; i < (str1.length() - str2.length()); i++) {
                    longer += longer.charAt(i);
                    System.out.println(longer);
                }
            }
            if (str2.length() > str1.length()) {
                longer = str1;
                for (int i = 0; i < (str2.length() - str1.length()); i++) {
                    longer += longer.charAt(i);
                    System.out.println(longer);
                }
            }
            if (str1.length() == longer.length() || str2.length() == longer.length()) {
                flag = false;
            }
            System.out.println(longer);
        }
        return longer;
    }

    // Method to take in a string and return amount of words
    public static int countWords(String s) {
        int count = 0;
        String[] arrOfStr = s.split(" ");
        count = arrOfStr.length;
        System.out.println(count);
        return count;
    }

    // Take in an array of numbers 1-10 missing 1 number and return the missing number
    public static int missingNum(int[] nums) {
        int missing = 10;
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != testArray[i]) {
                System.out.println(nums[i]);
                System.out.println(testArray[i]);
                missing = testArray[i];
                break;
            }
        }
        System.out.println(missing);
        return missing;
    }

    //    Write a function that returns true if two rooks can attack each other, and false otherwise.
    public static boolean canCapture(String[] rooks) {
        boolean canAttack = false;
        if (rooks[0].charAt(0) == rooks[1].charAt(0)) {
            canAttack = true;
        }
        if (rooks[0].charAt(1) == rooks[1].charAt(1)) {
            canAttack = true;
        }
        return canAttack;
    }

// Create a method that takes a string as its argument and returns the string in reversed order

    public static String reverse(final String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);
        return reversed;
    }

//    A group of friends have decided to start a secret society. The name will be the first letter of each of their names, sorted in alphabetical order.
//
//    Create a function that takes in an array of names and returns the name of the secret society.

    public static String societyName(String[] friends) {
        String secret = "";
        Arrays.sort(friends);
        for (String friend : friends) {
            secret += friend.charAt(0);
        }
        System.out.println(secret);
        return secret;
    }

//    Create a function that takes a string as an argument and returns true if each letter in the string is surrounded by a plus sign. Return false otherwise.

    public static boolean plusSign(String str) {
        boolean isPlus = false;
        int falseCount = 0;
        String letters = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '+' && i > 0 && i < str.length() - 1) {
                for (int j = 0; j < letters.length(); j++) {
                    if (str.charAt(i) == letters.charAt(j)) {
                        if (str.charAt(i - 1) == '+' && str.charAt(i + 1) == '+') {
                            isPlus = true;
                        } else {
                            isPlus = false;
                            falseCount++;
                        }
                    }
                }
            }
        }
        if (falseCount > 0) {
            isPlus = false;
        }
        System.out.println(isPlus);
        return isPlus;
    }

//    Create a function that returns "even" if a number has an even number of factors and "odd" if a number has an odd number of factors.

    public static String factorGroup(int num) {
        String answer = "even";
        double sqrt = Math.sqrt(num);
        if (sqrt % 1 == 0) {
            answer = "odd";
        }
        System.out.println(answer);
        return answer;
    }

//    Write a function that takes in a string and returns it with all letters shifted one forward, with all vowels capitalized
//public static String LetterChanges(String str) {
//    String newStr = "";
//    String alpha = "abcdefghijklmnopqurtuvwxyz";
//    for (int i = 0; i < str.length(); i++){
//        for(int j = 0; j < alpha.length(); j++){
//            if (str.charAt(i) == alpha.charAt(j)){
//                if(str.charAt(i) == "a")
//                newStr += alpha.charAt(j + 1);
//            }
//        }
//    }
//    String new2 = “”;
////    for (int x = 0; i < new.
//    return newStr;
//}

    public static String LetterChanges(String str) {
        if (str == null || str.length() == 0) return str;
        String str1 = new String();
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == 'Z') {
                str1 += (char) 65;
            } else if (str.charAt(i) == 'z') {
                str += (char) 97;
            } else {
                str1 += (char) (str.charAt(i) + 1);
            }
        }
        return str1;
    }

    //    Function to take in a base and an exponent and return the former to the power of the latter
    public static double exponent(double a, double b) {
        double total = a;
        for (double i = b; i > 1; i--) {
            total *= a;
        }
        return total;
    }

    //    Function to combine two arraylists and return sorted
    public ArrayList<Integer> combineSort(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> combo = new ArrayList<Integer>();
        combo.addAll(a);
        combo.addAll(b);
        Collections.sort(combo);
        return combo;
    }


    //    Create a function that takes an array of numbers and returns the sum of the two lowest positive numbers.
    public static int sumTwoSmallestNums(int[] arr) {

        ArrayList<Integer> positives = new ArrayList<>();
        Arrays.sort(arr);
//        Practice doing more of these types of for loops
        for (int value : arr) {
            if (value > 0) {
                positives.add(value);
            }
        }
        return positives.get(0) + positives.get(1);
    }

    static int simpleArraySum(int[] ar) {
        /*
         * Write your code here.
         */
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

//    Is this not the same thing I just did?
    static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;

    }
// Passed all
//    Take in an array of numbers and return decimals of positive, negative, and 0
    static void plusMinus(int[] arr) {
        float positives = 0;
        float negatives = 0;
        float zeroes = 0;
        for (int value : arr) {
            if (value > 0) {
                positives++;
            } else if (value < 0) {
                negatives++;
            } else {
                zeroes++;
            }
        }
        System.out.println(positives / arr.length);
        System.out.println(negatives / arr.length);
        System.out.println(zeroes / arr.length);
    }

// Passed all
    static void staircase(int n) {
        String step = "";
        int count = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j < count) {
                    step += " ";
                } else {
                    step += "#";
                }
            }
            System.out.println(step);
            step = "";
            count--;
        }
    }

//    Take an array of ints and return the minimum and maximum sums from the numbers provided
//    Passed all
    static void miniMaxSum(int[] arr) {
        long min = 0;
        long max = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            min += arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
            max += arr[i];
        }
        System.out.println(min + " " + max);
    }

    static int birthdayCakeCandles(int[] ar) {
//        Passed all tests
        int blown = 1;
        Arrays.sort(ar);
        for (int i = ar.length -2; i >= 0; i--) {
            if (ar[i] == ar[i + 1]) {
                blown ++;
            } else if (ar[i] != ar[i + 1]) {
                break;
            }
        }
        return blown;
    }

//        Passed all
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        Integer alice = 0;
        int bob = 0;
        List<Integer> score = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                alice++;
            } else if (a.get(i) < b.get(i)) {
                bob++;
            }
        }
        score.add(alice);
        score.add(bob);
        return score;
        
    }

//    Comparing distance between 3 objects on a plane
//    Passed all tests
    static String catAndMouse(int x, int y, int z) {
        int CatA = z - x;
        int CatB = z - y;
        if (CatA < 0) {
            CatA *= -1;
        }
        if (CatB < 0) {
            CatB *= -1;
        }
        if (CatA < CatB) {
            return "Cat A";
        } else if (CatA > CatB) {
            return "Cat B";
        } else {
            return "Mouse C";
        }
    }
// Convert time to military
//    Passed all tests
    static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));
        String amOrPm = s.substring(8);
        System.out.println(hour);
        System.out.println(amOrPm);
        if (hour < 12 && amOrPm.equals("PM")) {
            hour += 12;
        } else if (hour >= 12 && amOrPm.equals("AM")){
            hour -= 12;
        }
        String militaryTime;
        if (hour > 9) {
            militaryTime = hour + s.substring(2, 8);
        } else {
            militaryTime = "0" + hour + s.substring(2, 8);
        }
        return militaryTime;
    }

//    Take in a string and return Yes or No if it contains the entire spelling of hackerrank
//    Passed all tests
    static String hackerrankInString(String s) {
        String checkingForWord = "";
        String hacker = "hackerrank";
        int counter = 0;
        for (int i = 0; i < s.length(); i++){
            if (counter < hacker.length() && s.charAt(i) == hacker.charAt(counter)) {
                checkingForWord += s.charAt(i);
                counter++;
            }
        }
        if (checkingForWord.equals(hacker)) {
            return "YES";
        } else {
            return "NO";
        }
    }

//    Test to see if a string contains every letter of the alphabet
//    Needs review
    static String pangrams(String s) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int counter = 0;
        for (int i = 0; i < alpha.length(); i++){
            for(int j = 0; j < s.length(); j++) {
                if (alpha.charAt(i) == s.charAt(j)) {
                    counter++;
                    System.out.println(counter);
//                    break;
                }
                if (counter == 26)
                    break;
            }
        }
        if (counter == 26) {
            return "pangram";
        } else {
            return "not pangram";
        }
    }

}
