public class Trapezoid extends Shape implements ShapeActions {
    @Override
    public String getName() {
        return "Trapezoid";
    }

    @Override
    public void print() {
        System.out.println("This figure is " + getName());
    }
}
