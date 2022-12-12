package module9.stack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.setStack(new String[0]);
        myStack.push("Gary");
        myStack.push("Alfred");
        System.out.println(myStack.pop());
    }
}
