package module7;

public class SummaryCreator {

    public String create(String text) {
        if (text.length() > 15) {
            if (text.charAt(15) != ' ') {
                return new String(text.substring(0,15) + "...");
            } else {
                return new String(text.substring(0,15));
            }
        }
        return text;
    }
}
