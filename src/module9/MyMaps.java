package module9;

public interface MyMaps<K,V> {
    void put(K key, V value);
    void remove(K key);
    Object get(K key);
    void clear();
    int size();
}
