package shapes;

public class ShapeTest {
    public static void main(String args[]) {
//        Measurable myShape =
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("The Area is "+box1.getArea());
        System.out.println("The Perimeter is "+box1.getPerimeter());

        Square box2 = new Square(5);
        System.out.println("The Area is "+box2.getArea());
        System.out.println("The Perimeter is "+box2.getPerimeter());
    }
}

