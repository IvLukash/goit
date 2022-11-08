package module7;

public class DoubleSpaceCleaner {
    public String clean(String phrase) {
        String[] results = phrase.strip().split(" ");
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
        StringBuilder solution = new StringBuilder();
        for (String end : ends) {
            solution.append(end).append(" ");
        }
        return solution.toString().strip();
    }
}
