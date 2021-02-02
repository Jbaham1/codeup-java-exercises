package shapes;
import util.Input;
import java.util.Scanner;

public class CircleApp {
    public static void main(String args[]) {
        Input input = new Input();
        double radius = input.getDouble();
        Circle circle = new Circle(radius);
        System.out.println("The area of your double is "+circle.getArea());
        System.out.println("The circumference of your double is "+circle.getCircumference());

    }
}
