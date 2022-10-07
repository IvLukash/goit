package examples;

public class MinMaxPrices {
    public int[] findMinMaxPrices(int[] prices) {

        if(prices.length == 0) {
            return new int[] {};
        }
        int min = prices[0];
        int max = min;

        for (int price : prices) {
            if (min > price) {
                min = price;
            }
            if (max < price) {
                max = price;
            }
        }
        if(min == max) {
            return new int[] {min};
        } else {
            return new int[] {min, max};
        }
    }
}
