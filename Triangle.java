public class Triangle extends Shape implements Perimeter {
    private double sideA = 5;
    private double sideB = 8;
    private double sideC = 10;

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
