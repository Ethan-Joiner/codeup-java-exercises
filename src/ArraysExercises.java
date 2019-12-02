import java.util.Arrays;
public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = { new Person("Charlie"), new Person("Dennis"), new Person("Mac")};
//        System.out.println(Arrays.toString(people));

        for (Person person: people) {
            System.out.println(person.getName());
        }
//        System.out.println(Arrays.toString(addPerson(people, new Person("Dee"))));

        Person test[] = addPerson(people, new Person("Dee"));

        System.out.println(Arrays.toString(test));

    }
    public static Person[] addPerson(Person[] peeps, Person peep) {
        Person[] copy = Arrays.copyOf(peeps, peeps.length + 1);
        copy[copy.length - 1] = peep;
        return copy;
    }



}
