
public class leetcode {
    

    public static void main(String[] args) {
        romanToInt("MCMXCIV");
    }

    public static int romanToInt(String s) {
        int ans = 0;
        int I = 1;
        int IV = 4;
        int V = 5;
        int IX = 9;
        int X = 10;
        int L = 50;
        int C = 100;        
        int D = 500;    
        int M = 1000;
        for(int i = 0; i < s.length(); i++){
            if(i < s.length() - 1 && s.charAt(i) == 'C' && s.charAt(i +1) == 'M'){
                ans += 900;
                i++;
            } else if (i < s.length() - 1 && s.charAt(i) == 'C' && s.charAt(i +1) == 'D'){
                ans += 400;
                i++;
            } else if (i < s.length() - 1 && s.charAt(i) == 'X' && s.charAt(i +1) == 'C'){
                ans += 90;
                i++;
            } else if (i < s.length() - 1 && s.charAt(i) == 'X' && s.charAt(i +1) == 'L'){
                ans += 40;
                i++;
            } else if (i < s.length() - 1 && s.charAt(i) == 'I' && s.charAt(i +1) == 'X'){
                ans += 9;
                i++;
            } else if (i < s.length() - 1 && s.charAt(i) == 'I' && s.charAt(i +1) == 'V'){
                ans += 4;
                i++;
            } else if (s.charAt(i) == 'M'){
                ans += 1000;
            } else if (s.charAt(i) == 'D'){
                ans += 500;
            } else if (s.charAt(i) == 'C'){
                ans += 100;
            } else if (s.charAt(i) == 'L'){
                ans += 50;
            } else if (s.charAt(i) == 'X'){
                ans += 10;
            } else if (s.charAt(i) == 'V'){
                ans += 5;
            } else {
                ans +=1;
            }
        }
        return ans;
    }
}
