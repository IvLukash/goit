package module7;

public class DigitExtracter {

    public int[] extract(String text) {
        char[] symbols = text.toCharArray();
        int count = 0;
        for (char symbol : symbols) {
            if (symbol >= '0' && symbol <= '9') {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (char symbol : symbols) {
            if (index >= count) {
                break;
            }
            if (symbol >= '0' && symbol <= '9') {
                result[index] = Integer.parseInt(String.valueOf(symbol));
                index++;
            }
        }
        return result;
    }
}
