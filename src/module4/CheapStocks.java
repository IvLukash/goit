package module4;

public class CheapStocks {
    public String getCheapStocks(String[] stocks) {
        String cheapPrice = "";
        for (int i = 0; i < stocks.length; i++) {
            String[] nameAndPrice = stocks[i].split(" ");
            if (Integer.parseInt(nameAndPrice[1]) < 200) {
                cheapPrice = cheapPrice + " " + nameAndPrice[0];
            }
        }
        return cheapPrice.strip();
    }
}
