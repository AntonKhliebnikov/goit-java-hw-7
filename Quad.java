public class Quad extends Shape implements Perimeter {
    private double side = 5;

    @Override
    public String getShapeName() {
        return "Quad";
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
