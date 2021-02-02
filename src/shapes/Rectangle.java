package shapes;

public class Rectangle {
    private static double length;
    protected static double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    static double getArea(){
        return length * width;
    }
    static double getPerimeter(){
        return 2 * (length + width);
    }
}
