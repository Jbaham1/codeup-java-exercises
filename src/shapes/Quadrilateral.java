package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected static double length;
    protected static double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public static double getLength() {
        return length;
    }

    public static double getWidth() {
        return width;
    }

    abstract public void setLength(double length);

    abstract public void setWidth(double width);

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
