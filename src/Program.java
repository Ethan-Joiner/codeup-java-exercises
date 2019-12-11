import java.lang.reflect.Array;
import java.util.Arrays;

public class Program {

//    Take a string and swap the first and last letter, unless they are the same, or the string is too short
    public static String flipEndChars(String s) {
         if (s.length() < 2) {
             System.out.println("Incompatible");
             return "Incompatible";
         } else  if (s.charAt(s.length() - 1) == (s.charAt(0)) && s.length() > 2) {
             System.out.println("Two's a pair.");
             return "Two's a pair.";
         } else {
            String swap = "";

            swap += s.charAt(s.length() - 1);

            for (int i = 1; i < s.length() - 1; i++){
                swap += s.charAt(i);
            }
            swap += s.charAt(0);
            System.out.println(swap);
            return swap;
        }
    }



    public static boolean getXO (String str) {
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
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u' && s.charAt(i) != 'A' && s.charAt(i) != 'E' && s.charAt(i) != 'I' && s.charAt(i) != 'O' && s.charAt(i) != 'U'){
                noVowel += s.charAt(i);
            }
        }
            return noVowel;
    }
// UNFINISHED
     public static String missingLetter(String str) {
        String alph = "abcdefghijklmnopqrstuvwxyz";
        String missing = "";
        for (int i = 0; i < str.length(); i++){
            for (int j = 0; j < alph.length(); j++){
                if (alph.charAt(j) == str.charAt(i)){
                    System.out.println(alph.charAt(j + 1));

                    if (j + 1 != str.length() && i + 1 != str.length() && i + 1 != alph.length()){
                        if (alph.charAt(j + 1) != str.charAt(i + 1)){
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
                if (!missing.equalsIgnoreCase("")){
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
        for (int num : arr){
            String number = String.valueOf(num);
            System.out.println(number);
            for (int i = 0; i < number.length(); i++){
                if (number.charAt(i) == '7'){
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
        for (int i = 0; i < str.length() - 1; i++){
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
        int[] testArray = {1,2,3,4,5,6,7,8,9,10};
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != testArray[i]){
                System.out.println(nums[i]);
                System.out.println(testArray[i]);
                missing = testArray[i];
                break;
            }
        }
        System.out.println(missing);
        return missing;
    }



}
