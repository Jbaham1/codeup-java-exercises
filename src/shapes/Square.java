package shapes;

public class Square extends Quadrilateral implements Measurable {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double side) {

    }

    @Override
    public void setWidth(double side) {

    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
}


//////    double side = 5;
////    public Square(double side) {
////        super(side, side);
////
////    }
////    @Override
////    public double getArea(){
////       return Math.pow(this.length, 2);
////
////    }
////    public double getPerimeter(){
////     return  4 * this.length;
////
////    }