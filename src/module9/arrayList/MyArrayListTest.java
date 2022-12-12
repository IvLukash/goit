package module9.arrayList;

import java.util.Arrays;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.setArray(new String[0]);
        list.add("Ivan");
        list.add("Petro");
        list.add("Kaban");
        list.add("Ork");
        list.add("Stepan");
        System.out.println(Arrays.toString(list.getArray()));
        System.out.println("**********");
        list.remove(4);
        System.out.println(Arrays.toString(list.getArray()));
        System.out.println("***********");
        System.out.println(list.size());
        System.out.println("********");
        System.out.println(list.get(8));
        System.out.println("**********");
        list.clear();
        System.out.println(Arrays.toString(list.getArray()));

    }
}
