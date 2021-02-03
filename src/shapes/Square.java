package shapes;

public class Square extends Rectangle {
    double side = 5;
    public Square(double side) {
        super(side, side);

    }
//    @Override
    public double getArea(double side){
        double area = Math.pow(side, 2);
        return  area;
    }
    public double getPerimeter(double side){
        double perimeter = 4 * side;
        return perimeter;
    }


}
