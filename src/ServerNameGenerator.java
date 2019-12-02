import java.util.Random;
public class ServerNameGenerator {
    static String[] adjectives = {"gross", "disgusting", "beautiful", "repulsive", "forgettable", "abysmal", "horrifying", "corpulent", "lugubrious", "wretched"};
    static String[] nouns = {"protuberance", "funeral", "party", "reptile", "growth", "question", "condition", "mind", "disease", "puppy"};

    Random random = new Random();

    public static String returnRandom(String[] array) {
        int i = (int) (Math.random() * 9);
        return array[i];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name");
        System.out.println(returnRandom(adjectives) + "-" + returnRandom(nouns));
    }
}
