package module4;

public class LeavePriceNine {

    public int[] leavePrice9(int[] prices) {
        int count = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                result[index] = price;
                index++;
            }
        }
        return result;
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        String[] stocks = new String[showcaseStocks.length + warehouseStocks.length];
        int index = 0;
        for (String stock : showcaseStocks) {
            stocks[index] = stock;
            index++;
        }
        for (String stock : warehouseStocks) {
            stocks[index] = stock;
            index++;
        }
        return stocks;
    }

    public int getPricesSum(int[] prices, int minPrice, int maxPrice) {
        int sum = 0;
        for (int price : prices) {
            if (price >= minPrice && price <= maxPrice) {
                sum += price;
            }
        }
        return sum;
    }
}
