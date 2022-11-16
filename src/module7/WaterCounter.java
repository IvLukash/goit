package module7;

public class WaterCounter {

    public double count(String text) {
        char[] symbols = text.toCharArray();
        double count = 0;
        for (char symbol: symbols) {
            if (symbol == ' ') {
                count++;
            }
        }
        return count / symbols.length;
    }
}
