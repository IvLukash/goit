package module6;

public class Distance {
    private int startX;
    private int startY;
    private int endX;
    private int endY;

    public Distance(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getDistance() {
        return (int) (Math.round(Math.sqrt(Math.pow((endX - startX), 2) + Math.pow((endY - startY), 2))));
    }
}
