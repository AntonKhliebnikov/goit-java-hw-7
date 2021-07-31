public class Circle extends Shape implements Perimeter {
    private static final double Pi = 3.1415926536;
    private double radius = 15;

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getPerimeter() {
        return 2 * Pi * radius;
    }
}
