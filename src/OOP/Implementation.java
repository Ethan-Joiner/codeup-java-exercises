package OOP;
//import default
public class Implementation {

    public static void main(String[] args) {
        Person rick = new Person();
        System.out.println("rick.sayHello() = " + rick.sayHello());
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        System.out.println(rick.sayHello());
        System.out.println(Person.breathe("air"));
        System.out.println(rick.breathe("air"));
        Person ethan = new Person();
        ethan.firstName = "Ethan";
        System.out.println(ethan.firstName);
//        guessGame(getInteger(1,100), winningNumber);

//        Person.liveOnEarth;

        // prints "Hello from Rick Sanchez!"
    }


}
