package AbstractLec;

public class CodeupTest {
    public static void main(String[] args) {

//        Created an array of information to pass to my constructor
        String[] student1 = {"Sophie", "k", "Olympic", "Macbook Pro"};

        CodeupStudent sophie = new CodeupStudent(student1, true);

        sophie.greeting();
        sophie.study();
        System.out.println(sophie.giveBusinessCards());
    }
}
