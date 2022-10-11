package module4;

class MinPriceCount {
    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int count = 1;
        for (int i = 1; i < prices.length; i++) {
            if (min == prices[i]) {
                count++;
            } else if (min > prices[i]) {
                min = prices[i];
                count = 1;
            }
        }
        return count;
    }
}
