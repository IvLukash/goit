package module8;

public class ShapeName {
    private final Shape shape;

    public ShapeName(Shape shape) {
        this.shape = shape;
    }

    public String printShapeName() {
        return shape.getName();
    }
}
