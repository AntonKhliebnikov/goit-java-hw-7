public class Rectangle extends Shape implements ShapeActions {
    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public void print() {
        System.out.println("This figure is " + getName());
    }
}
