package shapes;

public class Rectangle {
    private static double length;
    protected static double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
     double getArea(){
        double area = length * width;
        return area;
    }
    double getPerimeter(){
        double perimeter = 2 * (length + width);
        return perimeter;
    }
}
