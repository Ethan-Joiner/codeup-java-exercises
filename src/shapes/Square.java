package shapes;

public class Square extends Quadrilateral{

    public Square(double side){
        super(side,side);
    }

    @Override
    protected void setLength(double length) {
    this.length = length;
    }

    @Override
    public void setWidth(double width) {
    this.width = width;
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}

