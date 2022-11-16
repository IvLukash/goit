package module8;

public class ShapeNameTest {
    public static void main(String[] args) {
        ShapeName shapeName = new ShapeName(new Circle());
        System.out.println(shapeName.printShapeName());
    }
}
