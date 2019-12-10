public class Program {
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

    public static void main(String[] args) {
//        flipEndChars("Hello world!");
//        flipEndChars("WoW");
//        flipEndChars("G");
//        flipEndChars("dfdkf49824fdfdfjhd");
//        missingLetter("abdefg");
//        reverseCase("Happy Birthday");
//        sevenBoom(new int[]{35, 4, 9, 37});
//        erase("he##l#hel#llo");
        lengthen("abcdefg", "ab");
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



}
