package examples;

public class MyPrizes {
    public String getMyPrizes(int ticket) {
        String result = "";
        if(ticket % 10 == 0) {
            result += "crystall";
        }
        if(ticket % 10 == 7) {
            result += " chip";
        }
        if(ticket > 200) {
            result += " coin";
        }
        return result.strip();
    }
}