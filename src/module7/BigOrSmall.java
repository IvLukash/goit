package module7;

public class BigOrSmall {

    public String calculate(String text) {
        char[] symbols = text.toCharArray();
        int smallCount = 0;
        int bigCount = 0;
        for (char symbol : symbols) {
            if (symbol >= 65 && symbol <=90) {
                bigCount++;
            }
            if (symbol >= 97 && symbol <= 122) {
                smallCount++;
            }
        }
        if (smallCount > bigCount) {
            return "Small";
        } else if (smallCount == bigCount) {
            return "Same";
        } else {
            return "Big";
        }
    }
}
