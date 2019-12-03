package shapes;

public class Rectangle {
    protected double length;
    protected double width;
    public Rectangle(double lengthP, double widthP){
        this.length = lengthP;
        this.width = widthP;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return (length + width) * 2;
    }
}
