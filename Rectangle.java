public class Rectangle extends Shape implements Perimeter {
    private double sideA = 5;
    private double sideB = 10;

    @Override
    public String getShapeName() {
        return "Rectangle";
    }

    @Override
    public double getPerimeter() {
        return 2 * (sideA + sideB);
    }
}
