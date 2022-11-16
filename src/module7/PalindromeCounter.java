package module7;

public class PalindromeCounter {

    public int count(String phrase) {
        String[] words = phrase.split(" ");
        int count = 0;
        for (String word : words) {
            StringBuilder builder = new StringBuilder(word);
            if (word.equalsIgnoreCase(String.valueOf(builder.reverse()))) {
                count++;
            }
        }
        return count;
    }
}
