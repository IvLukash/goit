package module7;

public class WordFreqCounter {
    public float countFreq(String phrase, String word) {
        String[] results = phrase.split(" ");
        float count = 0;
        for (String result: results) {
            if (result.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count / results.length;
    }
}
