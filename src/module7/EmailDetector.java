package module7;

public class EmailDetector {

    public boolean isPresent(String text) {
        boolean isPresent = true;
        if (!text.contains("@")) {
            isPresent = false;
        } else {
            int index = text.indexOf("@");
            String result = text.substring(index - 2, index + 3);
            if (result.contains(" ")) {
                isPresent = false;
            }
        }
        return isPresent;
    }
}
