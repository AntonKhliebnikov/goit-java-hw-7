public class Circle extends Shape implements ShapeActions{
    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public void print() {
        System.out.println("This figure is " + getName());
    }
}
