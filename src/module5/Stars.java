package module5;

public class Stars {
    private int count;

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        String result = "";
        int count = this.count;
        char[] symbols = new char[] {'X', 'Y', 'Z', '*'};
        int[] vars = new int[] {1000, 100, 10, 1};
        for (int i = 0; i < vars.length; i++) {
            if (count >= vars[i]) {
                int temp = count / vars[i];
                for (int j = 0; j < temp; j++) {
                    result = result + symbols[i];
                }
                count = count % vars[i];
            }
        }
        return result;
    }
}
