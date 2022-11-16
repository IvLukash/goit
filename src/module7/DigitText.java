package module7;

public class DigitText {

    public boolean detect(String text) {
        char[] symbols = text.toCharArray();
        for (char symbol: symbols) {
            if (!((symbol >= '0' && symbol <= '9') || symbol == ' ')) {
                return false;
            }
        }
        return true;
    }
}