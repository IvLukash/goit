package module7;

public class AvgWordLength {

    public double count(String phrase) {
        String[] words = phrase.split(" ");
        double allLength = 0;
        for (String word : words) {
            allLength += word.length();
        }
        return allLength / words.length;
    }
}