public class GraphicsEditor {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape trapezoid = new Trapezoid();
        printShapeName(circle);
        printShapeName(quad);
        printShapeName(triangle);
        printShapeName(rectangle);
        printShapeName(trapezoid);
    }

    public static void printShapeName(Shape shape) {
        shape.getShapeName();
    }
}
