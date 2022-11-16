package module7;

public class SensitiveDataSearcher {

    public boolean isSensitiveDataPresent(String phrase) {
        phrase = phrase.toLowerCase();
        return phrase.contains("pass") || phrase.contains("key") || phrase.contains("login") || phrase.contains("email");
    }
}
