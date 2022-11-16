package module7;

public class WordDeleter {

    public String remove(String phrase, String[] words){
        String[] allWords = phrase.split(" ");
        for (int i = 0; i < allWords.length; i++) {
            for (String word : words) {
                if (word.equals(allWords[i])) {
                    allWords[i] = " ";
                    break;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (String allWord : allWords) {
            if (!allWord.equals(" ")) {
                result.append(allWord).append(" ");
            }
        }
        return result.toString().strip();
    }
}
