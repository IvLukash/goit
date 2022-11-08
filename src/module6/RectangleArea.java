package module6;

public class RectangleArea {
    private int[] coords = new int[4];

    public RectangleArea(int[] coords) {
        this.coords = coords;
    }

    public int getArea() {
        return Math.abs((coords[2] - coords[0]) * (coords[3] - coords[1]));
    }
}
