package module7;

import java.util.Arrays;

public class UniqueCharCounter {
    public int count(String phrase) {
        char[] symbols = phrase.toCharArray();
        Arrays.sort(symbols);
        char uniqueChar = symbols[0];
        int count = 1;
        for (int i = 1; i < symbols.length; i++) {
            if (symbols[i] != uniqueChar) {
                uniqueChar = symbols[i];
                count++;
            }
        }
        return count;
    }
}
