
public class leetcode {
    

    public static void main(String[] args) {
        // romanToInt("MCMXCIV");
        // int[] testArray = {3,2,95,4,-3};
        // twoSum(testArray, 6);
        // lengthOfLongestSubstring("aabaab!bb");
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

// public static int[] twoSum(int[] nums, int target) {
//     int[] ans = new int[2];
//     for(int i = 0; i < nums.length; i++){

//         for(int j = (i + 1); j < nums.length; j++){
//             if(nums[i] + nums[j] == target){
//                 ans[0] = i;
//                 ans[1] = j;
//                 return ans;
//             }
//         }
//     }
//     return ans;
// }


// This is a cheating solution on how to abuse hashmaps. Use it for reference. 
// public class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
//         for(int i = 0; i < numbers.length; i++){
//             Integer requiredNum = (Integer)(target - numbers[i]);
//             if(indexMap.containsKey(requiredNum)){
//                 int toReturn[] = {indexMap.get(requiredNum), i};
//                 return toReturn;
//             }

//             indexMap.put(numbers[i], i);
//         }
//         return null;
//     }
// }

// Find the longest substring with no repeating characters
public static int lengthOfLongestSubstring(String s) {
    if(s.equals("")){
        return 0;
    } else {
    StringBuilder currentLongest = new StringBuilder();
    String longest = " ";
    for(int i = 0; i < s.length(); i++){
        if(!currentLongest.toString().contains((Character.toString(s.charAt(i))))){
            System.out.println("Index is " + i);
            System.out.println("Adding " + s.charAt(i) + " to " + currentLongest);
            currentLongest.append(s.charAt(i));
            if(currentLongest.length() > longest.length()){
                longest = currentLongest.toString();
                System.out.println("Longest is now " + longest);
            }
        } else {
            System.out.println("Index is " + i);
            System.out.println("Duplicate letter found - " + s.charAt(i));
            System.out.println("Currentlongest is " + currentLongest);
            System.out.println("Letter exists in currentlongest at " + currentLongest.toString().indexOf(Character.toString(s.charAt(i))));
            StringBuilder replace = new StringBuilder(currentLongest.toString().substring((currentLongest.toString().indexOf(s.charAt(i)))));
            if(!replace.toString().contains(Character.toString(s.charAt(i)))){
                replace.append(s.charAt(i));
            }
            System.out.println("Replacement string is " + replace);
            currentLongest.setLength(0);
            currentLongest.append(replace);
        }
    }
    System.out.println(longest.length());
    return longest.length();     
}
}

// Remove all instances of val from nums. Must be done without creating a new array.
public static int removeElement(int[] nums, int val) {
    int len = nums.length;
    for(int i = 0; i < nums.length; i++){
        if(nums[i] == val){
            len--;
            nums[i] = 9999;
        }
    }
    return len;    
}

// COMPLETED. Find the first instance of 'needle' in 'haystack'
public int strStr(String haystack, String needle) {
    if(needle == ""){
        return 0;
    } else {
        return haystack.indexOf(needle);
    }
}
}
