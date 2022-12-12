package module9.linkedList;

import module9.MyLists;

public class MyLinkedList<E> implements MyLists<E> {

    private static int indexValue = 0;
    private int size = 0;
    private Entry<E> firstElement;
    private Entry<E> lastElement;

    private static class Entry<E> {
        public E element;
        public Entry<E> next;
        public Entry<E> prev;
        public int elementIndex;

        Entry(E element) {
            elementIndex = MyLinkedList.getIndexValue();
            this.element = element;
        }

        @Override
        public String toString() {
            return String.valueOf(element);
        }
    }

    public static int getIndexValue() {
        return indexValue;
    }

    public Entry<E> getFirstElement() {
        return firstElement;
    }

    public Entry<E> getLastElement() {
        return lastElement;
    }

    public void add(E element) {
        MyLinkedList.Entry<E> entry = new Entry<>(element);
        if (firstElement == null) {
            entry.prev = null;
            entry.next = null;
            firstElement = entry;
        } else {
            lastElement.next = entry;
            entry.prev = lastElement;
        }
        lastElement = entry;
        indexValue++;
        size++;
    }

    public void  remove(int index) {
        try {
            Entry<E> removedElement = firstElement;
            while (removedElement.elementIndex < index) {
                removedElement = removedElement.next;
            }
            Entry<E> elementBeforeRemoved = removedElement.prev;
            Entry<E> elementAfterRemoved = removedElement.next;
            elementBeforeRemoved.next = elementAfterRemoved;
            elementAfterRemoved.prev = elementBeforeRemoved;
            indexValue--;
            size--;
        } catch (Exception ignored) {
        }
    }

    public void clear() {
        for (Entry<E> item = firstElement; item != null;) {
            Entry<E> nextElement = item.next;
            item.element = null;
            item.next = null;
            item.prev = null;
            item = nextElement;
        }
        firstElement = lastElement = null;
        size = 0;
        indexValue = 0;
    }

    public int size() {
        return size;
    }

    public Entry<E> get(int index) {

        try {
            Entry<E> getElement = firstElement;
            while (getElement.elementIndex < index) {
                getElement = getElement.next;
            }
            return getElement;
        } catch (Exception e) {
            return null;
        }
   }

    @Override
    public String toString() {
        try {
            Entry<E> temp = firstElement;
            StringBuilder list = new StringBuilder(temp.toString());
            for (int i = 1; i <= size; i++) {
                temp = temp.next;
                if (temp == null) {
                    continue;
                }
                list.append(" ").append(temp);
            }
            return list.toString();
        } catch (Exception e) {
            return "List is empty";
        }
    }
}
