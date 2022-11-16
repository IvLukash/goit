package module7;

public class MathDetector {

    public boolean isMath(String text) {
        int count = 0;
        char[] results = text.toCharArray();
        int index = 0;
        while(index < results.length) {
            if (results[index] >= '0' && results[index] <= '9') {
                count++;
            }
            index++;
        }
        return count >= 2 && text.contains("=") && (text.contains("-") || text.contains("+")
                || text.contains("/") || text.contains("*"));
    }
}
