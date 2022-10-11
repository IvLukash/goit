package module4;

public class RemoveMinPrice {
    public int[] removePrice(int[] prices, int toRemove) {
        int counter = 0;
        for (int price : prices) {
            if (price == toRemove) {
                counter++;
            }
        }
        int[] removedPrice = new int[prices.length - counter];
        int j = 0;
        for (int price : prices) {
            if (price != toRemove) {
                removedPrice[j] = price;
                j++;
            }
        }
        return removedPrice;
    }
}