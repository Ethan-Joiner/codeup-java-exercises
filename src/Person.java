public class Person {
    private String name;

    public static void main(String[] args) {
        Person p1 = new Person("Ron");
        System.out.println(p1.getName());
        System.out.println("p1.name = " + p1.name);
        p1.setName("Rolf");
        System.out.println(p1.name);
    }

    public String getName(){
        return name;
    };

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello " + name);
    }

    public Person(String name){
        this.name = name;
    }
}
