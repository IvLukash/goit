package examples;

public class CaptainDisputAgain {
    public int findMin(int[] triple) {
        return Math.min(Math.min(triple[0], triple[1]), triple[2]);
    }
}