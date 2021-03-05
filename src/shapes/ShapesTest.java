package shapes;

public class ShapesTest {
    public static void main(String args[]) {
       Measurable myShape;
       myShape = new Square(5);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

        myShape = new Rectangle(5, 4);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());


//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("The Area is "+box1.getArea());
//        System.out.println("The Perimeter is "+box1.getPerimeter());
//
//        Square box2 = new Square(5);
//        System.out.println("The Area is "+box2.getArea());
//        System.out.println("The Perimeter is "+box2.getPerimeter());
    }
}

