package shapes;

public class Square extends Rectangle {
//    double side = 5;
    public Square(double side) {
        super(side, side);

    }
    @Override
    public double getArea(){
       return Math.pow(this.length, 2);

    }
    public double getPerimeter(){
     return  4 * this.length;

    }


}
