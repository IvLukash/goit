package module9.hashMap;

import module9.MyMaps;

public class MyHashMap<K,V> implements MyMaps<K,V> {

    private int size;
    private Entry<K,V> head;

    private static class Entry<K,V> {
        private final int hash;
        private final Key<K> key;
        private final V value;
        private Entry<K,V> next;

        public Entry(int hash, Key<K> key, V value, Entry<K,V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public Key<K> getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public int getHash() {
            return hash;
        }

        public boolean hasNext() {
            return next != null;
        }

        @Override
        public String toString() {
            return String.valueOf(key + "=" + value);
        }
    }

    public void put(K key, V value) {
        Key<K> keyElement = new Key<>(key);

        Entry<K,V> element = new Entry<>(keyElement.hashCode(), keyElement, value, null);

        if (head == null) {
            head = element;
            size++;
        } else {
            if (head.key.equals(keyElement)) {
                element.next = head.next;
                head = element;
            } else {
                Entry<K,V> itemElement = head;
                Entry<K,V> prevElement;
                while (itemElement.hasNext()) {
                    prevElement = itemElement;
                    itemElement = itemElement.next;
                    if (itemElement.key.equals(keyElement)) {
                        element.next = itemElement.next;
                        prevElement.next = element;
                        return;
                    }
                }
                itemElement.next = element;
                size++;
            }
        }
    }

    public void remove(K key) {
        Entry<K,V> removedElement = head;
        Entry<K,V> prevElement = removedElement;
        if (head.key.getKeyValue().equals(key)) {
            head = head.next;
            removedElement = null;
            size--;
        } else {
            while (!(removedElement.key.getKeyValue().equals(key))) {
                prevElement = removedElement;
                removedElement = removedElement.next;
            }
            prevElement.next = removedElement.next;
            removedElement = null;
            size--;
        }
    }

    public void clear() {
        for (int i = size; i > 0; i--) {
            Entry<K,V> removedElement = head.next;
            if (removedElement.hasNext()) {
                removedElement.next = removedElement;
                removedElement = null;
            }
            size--;
        }
        head = null;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        Entry<K,V> searchElement = head;
        while (!(searchElement.key.getKeyValue().equals(key))) {
            searchElement = searchElement.next;
        }
        return searchElement.value;
    }

    @Override
    public String toString() {
        try {
            StringBuilder map = new StringBuilder(head.toString());
            Entry<K,V> temp = head;
            while (temp.hasNext()) {
                temp = temp.next;
                map.append(" ").append(temp.toString());
            }
            return map.toString();
        } catch (Exception e) {
            return "Map is empty";
        }
    }
}
