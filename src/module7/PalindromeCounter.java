package module7;

public class PalindromeCounter {
    public int count(String phrase) {
        String[] words = phrase.toLowerCase().split(" ");
        int count = 0;
        for (String word : words) {
            char[] symbols = word.toCharArray();
            int index = 0;
            while (index < symbols.length / 2) {
                if (symbols[index] != symbols[symbols.length - 1 - index]) {
                    break;
                }
                index++;
            }
            if (index == symbols.length / 2) {
                count++;
            }
        }
        return count;
    }
}
