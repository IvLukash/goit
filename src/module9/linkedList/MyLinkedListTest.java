package module9.linkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("Petro");
        list.add("Ivan");
        list.add("Olga");
        list.add("Halyna");
        list.add("Nazar");
        list.add("Sergiy");
        list.add("David");
        list.add("Roman");
        System.out.println(list);
        System.out.println(list.get(4));
    }
}
