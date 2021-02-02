package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double getArea(){
        return length * width;
    }
    double getPerimeter(){
        return 2 * (length + width);
    }
}
