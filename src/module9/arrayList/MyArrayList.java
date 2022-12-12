package module9.arrayList;

import module9.MyLists;

import java.util.Arrays;

public class MyArrayList<T> implements MyLists<T> {

    private T[] array;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void add(T value) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = value;
    }

    public void remove(int index) {
        if (!(index < 0 || index >= array.length)) {
            while (index < array.length - 1) {
                T temp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = temp;
                index++;
            }
            array = Arrays.copyOf(array, array.length - 1);
        }
    }

    public void clear() {
        array = Arrays.copyOf(array, 0);
    }

    public int size() {
        return array.length;
    }

    public T get(int index) {
       try {
           return array[index];
       } catch (Exception e) {
           return null;
       }
    }
}
