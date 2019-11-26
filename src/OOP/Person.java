package OOP;

public class Person {

    public String firstName;
    public String lastName;
    public static boolean liveOnEarth = true;

    public String sayHello() {
        return String.format("Hello from %s %s!", this.firstName, this.lastName);
    }

    public static String breathe(String oxygen){
        return "CO2";
    }

}
