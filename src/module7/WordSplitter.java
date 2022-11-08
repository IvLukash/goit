package module7;

public class WordSplitter {
    public String[] split(String phrase) {
        String[] results = phrase.toLowerCase().split(" ");
        int count = 0;
        for (String result : results) {
            if (!result.isBlank()) {
                count++;
            }
        }
        String[] ends = new String[count];
        int index = 0;
        for (String result : results) {
            if (!result.isBlank()) {
                ends[index] = result;
                index++;
            }
        }
        return ends;
    }
}