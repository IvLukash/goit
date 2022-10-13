package examples;

public class Main {
    public static void main(String[] args) {
        NameEncoderDecoder nick = new NameEncoderDecoder();
        System.out.println("Зашифрована назва - " + nick.encode("Johnatan"));
        System.out.println("Дешифрована назва - " + nick.decode("NOTFORYOUCr5bYESNOTFORYOU"));
    }
}