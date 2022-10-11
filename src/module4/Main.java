package module4;

public class Main {
    public static void main(String[] args) {
        CheapStocks cheapStocks = new CheapStocks();
        System.out.println(cheapStocks.getCheapStocks(new String[] {"gas 70", "plate 205", "fridge 2394", "spoon 25"}));
    }
}
