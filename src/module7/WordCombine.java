package module7;

public class WordCombine {

    public boolean canCombine(String sourceWord, String targetWord) {
        char[] symbolsSource = sourceWord.toLowerCase().toCharArray();
        char[] symbolsTarget = targetWord.toLowerCase().toCharArray();
        int count = 0;
        for (char value : symbolsTarget) {
            for (char c : symbolsSource) {
                if (c == value) {
                    count++;
                    break;
                }
            }
        }
        return count >= symbolsTarget.length;
    }
}