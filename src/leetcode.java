import java.util.ArrayList;


public class leetcode {
    


    public static void main(String[] args) {
       
        // romanToInt("MCMXCIV");
        String[] testArray = {"flower", "flower", "flower", "flower"};
        longestCommonPrefix(testArray);
        // twoSum(testArray, 6);
        // lengthOfLongestSubstring("aabaab!bb");
        // trap(testArray);
        // searchInsert(testArray, 2);
        // lengthOfLastWord("a ");
        // maxProfit(testArray);
        // isValid("([)]");
    }
  // Take in an array of strings and return the longest common substring, else return an empty string
        public static String longestCommonPrefix(String[] strs) {
            if(strs.length < 2 || strs[0].isEmpty()){
                return strs[0];
            }
            int loopflag = 1;
            char current = ' ';
            String ans = "";
            int inc = 0;
            while(loopflag == 1){
                for(int i = 0; i < strs.length; i++){
                    if(i == 0){
                        System.out.println("Restating loop, iteration is " + inc);
                        System.out.println("Answer length = " + ans.length());
                        System.out.println("Needed length to exit = " + strs[0].length());
                        if(ans.length() == strs[0].length()){
                            loopflag = 0;
                            break;
                        }
                        current = strs[i].charAt(inc);   

                    } else if(inc != strs[i].length() && current == strs[i].charAt(inc)) {
                        if(i == strs.length - 1){
                            ans += current;
                            System.out.println(ans + " = current ans");
                            System.out.println(strs[0]);
                         
                            inc++;
                            System.out.println(ans);
                        }
                            continue;
                    } else {
                        loopflag = 0;
                        break;
                    }
                    }
            }        
            System.out.println(ans);
            return ans;
        }

    // public static int romanToInt(String s) {
    //     int ans = 0;
    //     for(int i = 0; i < s.length(); i++){
    //         if(i < s.length() - 1 && s.charAt(i) == 'C' && s.charAt(i +1) == 'M'){
    //             ans += 900;
    //             i++;
    //         } else if (i < s.length() - 1 && s.charAt(i) == 'C' && s.charAt(i +1) == 'D'){
    //             ans += 400;
    //             i++;
    //         } else if (i < s.length() - 1 && s.charAt(i) == 'X' && s.charAt(i +1) == 'C'){
    //             ans += 90;
    //             i++;
    //         } else if (i < s.length() - 1 && s.charAt(i) == 'X' && s.charAt(i +1) == 'L'){
    //             ans += 40;
    //             i++;
    //         } else if (i < s.length() - 1 && s.charAt(i) == 'I' && s.charAt(i +1) == 'X'){
    //             ans += 9;
    //             i++;
    //         } else if (i < s.length() - 1 && s.charAt(i) == 'I' && s.charAt(i +1) == 'V'){
    //             ans += 4;
    //             i++;
    //         } else if (s.charAt(i) == 'M'){
    //             ans += 1000;
    //         } else if (s.charAt(i) == 'D'){
    //             ans += 500;
    //         } else if (s.charAt(i) == 'C'){
    //             ans += 100;
    //         } else if (s.charAt(i) == 'L'){
    //             ans += 50;
    //         } else if (s.charAt(i) == 'X'){
    //             ans += 10;
    //         } else if (s.charAt(i) == 'V'){
    //             ans += 5;
    //         } else {
    //             ans +=1;
    //         }
    //     }
    //     return ans;
    // }



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

// COMPLETED. Find the first instance of 'needle' in 'haystack': Easy
public int strStr(String haystack, String needle) {
    if(needle == ""){
        return 0;
    } else {
        return haystack.indexOf(needle);
    }
}

// COMPLETED. Int is an array of ints. Find the maximum area. : Medium.
public int maxArea(int[] height) {
    int j = height.length - 1;
    int area = 0;
    for(int i = 0; i < height.length; i++){
        if(height[i] > height[j]){
            if(height[j] * (j - i) > area){
                area = height[j] * (j - i);
            }
        j--;
        i--;
        } else if (height[i] < height[j]){
            if(height[i] * (j - i) > area){
                area = height[i] * (j - i);
            }
        } else {
            if(height[i] * (j - i) > area){
                area = height[i] * (j - i);
            }
        }
    }
    return area;       
}
// Rainwater trap : Hard
public static int trap(int[] height) {
    int water = 0;
    int currentwater = 0;
    int leftwall = 0;
    int leftwallindex = 0;
    int filler = 0;
    int oldwall = 0;
    int oldwallindex = 0;
    if(height.length > 1 && height[0] == height[height.length - 1] && height[0] > height[1] && height[height.length - 1] > height[height.length - 2]){
        for(int i = 1; i < height.length - 1; i++){
            water += height[0] - height[i];
        }
    } else {
    for(int i = 0; i < height.length; i++){
        System.out.println("Index " + i);
       
        if(height[i] >= leftwall){
            if(oldwall != 0 && leftwall < oldwall && height[i] > leftwall && height[i] == oldwall){
                water += (height[i] - leftwall) * (i - (oldwallindex + 1));
            }
            if(oldwall != 0 && leftwall < oldwall && height[i] > leftwall){
                System.out.println("Oldwall if working");
                water += (height[i] - oldwall) * (i - (oldwallindex + 1));
            }
            leftwall = height[i];
            leftwallindex = i;
            water += currentwater;
            currentwater = 0;
            filler = 0;
            System.out.println("Leftwall now " + height[i]);
            System.out.println("Total water now " + water);
        } else if (i < height.length - 1 && height[i] < leftwall && height[i] > height[i - 1] && height[i] > height[i + 1]){
            water += currentwater - ((leftwall - height[i]) * (i - (leftwallindex + 1)));
            oldwall = leftwall;
            oldwallindex = leftwallindex;
            leftwall = height[i];
            leftwallindex = i;
            currentwater = 0;
            System.out.println("Short wall found, new water is + " + water);
            System.out.println("Oldwall is " + oldwall);
            System.out.println("Leftwall is " + leftwall);
           
         } else
         if (height[i] < leftwall && height[i] > height[i - 1] && i == height.length - 1){
            water += Math.abs(currentwater - ((leftwall - height[i]) * (i - (leftwallindex + 1))));
            oldwall = leftwall;
            oldwallindex = leftwallindex;
            leftwall = height[i];
            leftwallindex = i;

            System.out.println("Short wall found, new water is + " + water);
            System.out.println("Oldwall is " + oldwall);
        
        }  else if (height[i] < leftwall){
            filler += height[i];
            currentwater += leftwall - filler; 
            System.out.println("Filler added + " + filler);
            filler = 0;
            System.out.println("Current water added + " + currentwater);
        }   
    }
}
    System.out.println("Ending water = " + water);
    return water;
}


// Find the index of the target in the array, or the index it would be if it does not exist. 
public static int searchInsert(int[] nums, int target) {
    int ans = 0;
    if(target > nums[nums.length - 1]){
        return nums.length;
    }
    if(target < nums[0]){
        return 0;
    }
    for(int i = 0; i < nums.length; i++){
        System.out.println("Index is " + i);
        if(target == nums[i]){
            return i;
        } else
        if (i < nums.length - 1 && target > nums[i] && target < nums[i + 1]){
            ans = i + 1;
            System.out.println("Ans is " + ans);
        } 
        }
        return ans;
    }

// Given a string of words separated by spaces, find the length of the last word
    public static int lengthOfLastWord(String s) {
        int leng = 0;
        if(s.length() == 1 && s != " "){
            System.out.println("Returning 1");
            return 1;
        }
        for(int i = s.length() - 1; i >= 0; i--){
            System.out.println(s.charAt(i));
            if(s.charAt(i) != ' '){
                leng++;
                System.out.println("Length increased by 1 to " + leng);
            } else if (leng > 0 ){
                break;
            }
        }
        System.out.println("Nothing is working");
        return leng;
    }
// Given an array of prices, return the maximum profit you can make (highest integer subtracted by lowest integer preceding it)
    public static int maxProfit(int[] prices) {
        int lowest = prices[0];
        int lowestInd = 0;
        int highest = 0;
        int highestInd = 0;
        int ans = 0;
        for(int i = 1; i < prices.length; i++){
            System.out.println("Index " + i);
            if(prices[i] < lowest){
                System.out.println("Changing lowest");
                if(i > highestInd && highestInd > 0 && highest - lowest > ans){
                    ans = highest - lowest;
                    System.out.println("New ans is " + ans);
                }
                lowest = prices[i];
                highest = 0;
                lowestInd = i;
                System.out.println("New lowest is " + lowest);
            } else if(prices[i] >= highest){
                highest = prices[i];
                highestInd = i;
                System.out.println("Changing highest to " + highest);

            }
        }
        if(highestInd > lowestInd && highest > lowest && highest - lowest > ans){
            ans = highest - lowest;
        }
        if(ans > 0){
            return ans;
        } else {
            return 0;
        }
    }


// Merge two lists and sort them
//  public class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
 
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode working = new ListNode[list1.length + list2.length];
//         System.arraycopy(list1, 0, working, 0, list1.length);
//         System.arraycopy(list2, 0, working, list1, list2);
//         return working;
//     }
// }

/* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
*/

// public static boolean isValid(String s) {
//     StringBuilder open = new StringBuilder();
//     StringBuilder close = new StringBuilder();
//     boolean ans = false;
// for(int i = 0; i < s.length(); i++){
//     System.out.println(i);
//     if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
//         open.append(s.charAt(i));
//         System.out.println(open);
//     } else if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'){
//         close.append(s.charAt(i));
//         System.out.println(close);
//         if(open.length() < close.length()){
//             break;
//         }
//         else if(close.charAt(0) == ')' && open.charAt(open.length() - 1) == '('){
//             open.deleteCharAt(open.length() - 1);
//             close.deleteCharAt(0);
//         } else if(close.charAt(0) == ']' && open.charAt(open.length() - 1) == '['){
//             open.deleteCharAt(open.length() - 1);
//             close.deleteCharAt(0);
//         } else if(close.charAt(0) == '}' && open.charAt(open.length() - 1) == '{'){
//             open.deleteCharAt(open.length() - 1);
//             close.deleteCharAt(0);
//         } else {
//             close.deleteCharAt(0);
//             break;
//         }
//     }
// }
// System.out.println("Open length = " + open.length() + " - Close Length = " + close.length());
// if(open.length() == close.length()){
//     ans = true;
// }
// System.out.println(ans);
//     return ans;
// }



// Function to see if an int is a palindrome. Complete
public boolean isPalindrome(int x) {
    String str = Integer.toString(x);
    boolean ans = true;
    for(int i = 0; i < str.length() / 2; i++){
        if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
            ans = false;
            break;
        }
    }
    return ans;
}
        
}
