package module7;

public class PunctuationMarkCounter {

    public int count(String phrase) {
        char[] symbols = phrase.toCharArray();
        int count = 0;
        for (char symbol : symbols) {
            if(symbol == '.' || symbol == ',' || symbol == '!' || symbol == ':' || symbol == ';') {
                count++;
            }
        }
        return count;
    }
}
