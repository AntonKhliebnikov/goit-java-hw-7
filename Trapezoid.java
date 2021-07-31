public class Trapezoid extends Shape implements Perimeter {
    private double sideA = 5;
    private double sideB = 8;
    private double sideC = 10;
    private double sideD = 7;

    @Override
    public String getShapeName() {
        return "Trapezoid";
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC + sideD;
    }
}
