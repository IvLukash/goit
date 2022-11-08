package module6;

import java.util.Arrays;
import java.util.Objects;

public class QuarkeTrack {
    private int[] lines;

    public QuarkeTrack(int[] lines) {
        this.lines = lines;
    }

    public int sum() {
        int sum = 0;
        for (int line : lines) {
            sum +=line;
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        QuarkeTrack quarkeTrack = (QuarkeTrack) o;
        if (quarkeTrack.sum() == this.sum()) {
            return true;
        }
        return Arrays.equals(this.lines, quarkeTrack.lines);
    }

    @Override
    public int hashCode() {
        return 13 * sum();
    }
}
