package examples;

public class HangarGood {
    public boolean isHangarOk(int side1, int side2, int price) {
        int square = side1 * side2;
        if(square < 1500 || price > square * 1000) {
            return false;
        }
        return side1 > side2 ? side1 <= 2 * side2 : side2 <= 2 * side1;
    }
}
