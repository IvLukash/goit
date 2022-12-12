package module9.stack;

import module9.MyStacks;

import java.util.Arrays;

public class MyStack<T> implements MyStacks<T> {

    private T[] stack;

    public T[] getStack() {
        return stack;
    }

    public  void setStack(T[] stack) {
        this.stack = stack;
    }

    public void push(T value) {
        stack = Arrays.copyOf(stack, stack.length + 1);
        stack[stack.length - 1] = value;
    }

    public void remove(int index) {
        if (!(index < 0 || index >= stack.length)) {
            while (index < stack.length - 1) {
                T temp = stack[index];
                stack[index] = stack[index + 1];
                stack[index + 1] = temp;
                index++;
            }
            stack = Arrays.copyOf(stack, stack.length - 1);
        }
    }

    public void clear() {
        stack = Arrays.copyOf(stack, 0);
    }

    public int size() {
        return stack.length;
    }

    public T peek() {
        return stack[0];
    }

    public T pop() {
        T removedElement = stack[0];
        stack = Arrays.copyOfRange(stack, 1, stack.length);
        return removedElement;
    }
}