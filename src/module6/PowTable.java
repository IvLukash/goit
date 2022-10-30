package module6;

import java.util.Arrays;

public class PowTable {
    public static final int[] POWERS_2;
    static{
        POWERS_2 = new int[10];
        for (int i = 0; i < POWERS_2.length; i++) {
            POWERS_2[i] = (int) Math.pow(i + 1, 3);
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(PowTable.POWERS_2));
    }
}
