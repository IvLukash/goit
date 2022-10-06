package examples;

public class NumberTranslator {
    public int translate(String romanNumber) {
        String symbol = romanNumber.strip().toUpperCase();
        int number;
        switch (symbol) {
            case "I":
                number = 1;
                break;
            case "II":
                number =2;
                break;
            case "III":
                number = 3;
                break;
            case "IV":
                number = 4;
                break;
            case "V":
                number = 5;
                break;
            case "VI":
                number = 6;
                break;
            case "VII":
                number = 7;
                break;
            case "VIII":
                number = 8;
                break;
            case "IX":
                number = 9;
                break;
            case "X":
                number = 10;
                break;
            case "XI":
                number = 11;
                break;
            case "XII":
                number = 12;
                break;
            default:
                number = -1;
        }
        return number;
    }
}
