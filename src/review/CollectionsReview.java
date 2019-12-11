package review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class CollectionsReview {

    static ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(17,22,34,88,19));

    static HashMap<Character, String> answers = new HashMap<>();


    public static void main(String[] args) {
        for(int num: nums){
            System.out.println(num);
        }

        answers.put('B', "Jim");
        answers.put('C', "Jimothy");
        answers.put('D', "Jimmmer");
        answers.put('V', "Jimbo");
        answers.put('A', "Jimmy");

//        Enter key to get value
        System.out.println(answers.get('B'));

//        Iterate through to get key and value
        Set<Character> keys =  answers.keySet();

        for (char key : keys) {
            if(answers.get(key).equals("Jimothy")){
                System.out.println(key);
            }
        }
    }
}
