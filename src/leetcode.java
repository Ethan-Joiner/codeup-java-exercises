
public class leetcode {
    

    public static void main(String[] args) {
        // romanToInt("MCMXCIV");
        int[] testArray = {3,3};
        twoSum(testArray, 6);
    }

    public static int romanToInt(String s) {
        int ans = 0;
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



// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

public static int[] twoSum(int[] nums, int target) {
    int[] ans = new int[2];
    for(int i = 0; i < nums.length; i++){
        for(int j = 1; j < nums.length; j++){
            System.out.println("i in loop" + i);
            System.out.println("j in loop" + j);
            System.out.println(nums[i]);
            System.out.println(nums[j]);
            if(nums[i] + nums[j] == target){
                ans[0] = i;
                ans[1] = j;
                break;
            }
        }
    }
    return ans;
        
}



}
