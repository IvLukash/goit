package examples;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MinMaxPrices minMaxPrices = new MinMaxPrices();

        //Should be [50, 1500]
        int[] prices = new int[] {50, 50, 50};
        int[] minMax = minMaxPrices.findMinMaxPrices(prices);
        System.out.println(Arrays.toString(minMax));
    }
}