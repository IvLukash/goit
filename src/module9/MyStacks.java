package module9;

public interface MyStacks<T> extends MyCollections<T> {
    void push(T value);
    void remove(int index);
    Object peek();
    Object pop();
}
