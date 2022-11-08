package module7;

public class ShortWordCounter {
    public int count(String phrase, int minLength) {
        String[] results = phrase.split(" ");
        int count = 0;
        for (String result : results) {
            if (result.length() <= minLength) {
                count++;
            }
        }
        return count;
    }
}
