package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        Rectangle box2 = new Square(5);
        System.out.println("Rectangle's area is " + box1.getArea());
        System.out.println("Rectangle's perimeter is " + box1.getPerimeter());
        System.out.println("Square's area is " + box2.getArea());
        System.out.println("Square's perimeter is " + box2.getPerimeter());


    }
}
