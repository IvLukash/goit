package module7;

public class NameCounter {

    public int count(String text) {
        int count = 0;
        String[] words = text.split(" ");
        for (String word : words) {
            if (word.length() >= 2 && (word.charAt(0) >= 65 && word.charAt(0) <= 90)) {
                int iter = 0;
                int i = 1;
                while (i < word.length()) {
                    if (word.charAt(i) >= 97 && word.charAt(i) <= 122) {
                        iter++;
                    }
                    i++;
                }
                if (iter == word.length() - 1) {
                    count++;
                }
            }
        }
        return count;
    }
}
