public class Quad extends Shape implements ShapeActions {
    @Override
    public String getName() {
        return "Quad";
    }

    @Override
    public void print() {
        System.out.println("This figure is " + getName());
    }
}
