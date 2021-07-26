public class Triangle extends Shape implements ShapeActions {
    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public void print() {
        System.out.println("This figure is " + getName());
    }
}
