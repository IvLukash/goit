package module9.hashMap;

import java.util.Objects;

public class Key<K> {

    private K keyValue;

    public Key(K key) {
        this.keyValue = key;
    }

    public K getKeyValue() {
        return keyValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key<K> item = (Key<K>) o;
        return this.keyValue.equals(item.keyValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyValue);
    }

    @Override
    public String toString() {
        return String.valueOf(keyValue);
    }
}
