package examples;

public class NameEncoderDecoder {
    public String encode(String name) {
        char[] nameSymbols = name.toCharArray();
        for (char nameSymbol : nameSymbols) {
            if (nameSymbol >= '0' && nameSymbol <= '9') {
                return "Це ім'я не підлягає шифруванню.";
            }
        }
        String encodeName = name
                .replace("e","1")
                .replace("u", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("a", "5");
        return "NOTFORYOU" + encodeName + "YESNOTFORYOU";
    }

    public String decode(String name) {
        String decodeName = name.substring(9, name.length() - 12);
        return decodeName
                .replace("1","e")
                .replace("2", "u")
                .replace("3", "i")
                .replace("4", "o")
                .replace("5", "a");
    }
}
