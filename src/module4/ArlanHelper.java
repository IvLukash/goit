package module4;

public class ArlanHelper {

    public String drawQuad(int n) {
        String str = "";
        String quad = "";
        int lines = 1;
        while (lines <= n) {
            str += "*";
            lines++;
        }
        int columns = 1;
        while (columns <= n) {
            quad += str + "\n";
            columns++;
        }
        return quad.strip();
    }

    public String drawRect(int width, int height, char c) {
        String result = "";
        String line = "";
        int lines = width;
        while (lines > 0) {
            line += c;
            lines--;
        }
        int columns = height;
        while (columns > 0) {
            result += line + "\n";
            columns--;
        }
        return result;
    }

    public String drawLine(int length) {
        String result = "";
        int line = 1;
        while (line <= length) {
            result += (line % 2 != 0 ? "*" : "#");
            line++;
        }
        return result;
    }

    public String drawPattern(char[] pattern, int repeatCount) {
        String result = "";
        String strArr = String.copyValueOf(pattern);
        int count = 1;
        while (count <= repeatCount) {
            result += strArr;
            count++;
        }
        return result;
    }

    public String drawTriangle(int side) {
        String result = "";
        while (side > 0) {
            result += "*".repeat(side) + "\n";
            side--;
        }
        return result.strip();
    }

    public int countSumOfDigits (int number) {
        int sum = 0;
        int lastDigit;
        while (number > 0) {
            lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        return sum;
    }

    public int countBanknotesWithFor(int sum) {
        int count = 0;
        int[] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        for (int banknote : banknotes) {
            if (sum >= banknote) {
                count = count + sum / banknote;
                sum = sum % banknote;
            }
        }
        return count;
    }

    public int countBanknotesWithWhile(int sum) {
        int count = 0;
        int[] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int i = 0;
        while (i < banknotes.length) {
            if (sum >= banknotes[i]) {
                count = count + sum / banknotes[i];
                sum = sum % banknotes[i];
            }
            i++;
        }
        return count;
    }
}
