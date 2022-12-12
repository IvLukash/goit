package module9;

public interface MyQueues<T> extends MyCollections<T> {
    void add(T value);
    Object peek();
    Object pool();
}
