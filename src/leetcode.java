
public class leetcode {
    

    public static void main(String[] args) {
        romanToInt("MCM");
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
            if(s.charAt(i) == 'M' && s.charAt(i +1) == 'C'){
                ans += 900;
            }
                System.out.println(ans);

        }
        return ans;
    }
}
