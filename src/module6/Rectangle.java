package module6;

public class Rectangle {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public boolean canPlaceInto(Rectangle anotherRect) {
        return (anotherRect.a >= this.a && anotherRect.b >= this.b) ||
                (anotherRect.a >= this.b && anotherRect.b >= this.a);
    }
}
