package module9;

public interface MyLists<T> extends MyCollections<T> {
    void add(T value);
    void remove(int index);
    Object get(int index);
}