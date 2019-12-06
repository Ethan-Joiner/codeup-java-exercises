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
        flipEndChars("Hello world!");
        flipEndChars("WoW");
        flipEndChars("G");
        flipEndChars("dfdkf49824fdfdfjhd");
        missingLetter("abcefg");
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

    public static String missingLetter(String str) {
        String alph = "abcdefghijklmnopqrstuvwxyz";
        String missing = "";
        for (int i = 0; i < str.length(); i++){
            for (int j = 0; j < alph.length(); j++){
                if (alph.charAt(j) == str.charAt(i)){
                    if (j + 1 != str.length() && i + 1 != str.length() && i + 1 != alph.length()){
                        if (alph.charAt(j + 1) != str.charAt(i + 1)){
                            missing += str.charAt(i + 1);
                        } else {
                            missing = "No Missing Letter";
                        }
                    }
                }
            }
        }
        System.out.println(missing);
        return missing;
    }


}
