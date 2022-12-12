package module9.queue;

import module9.MyQueues;

import java.util.Arrays;

public class MyQueue<T> implements MyQueues<T> {
    private T[] queue;

    public T[] getQueue() {
        return queue;
    }

    public  void setQueue(T[] queue) {
        this.queue = queue;
    }

    public void add(T value) {
        queue = Arrays.copyOf(queue, queue.length + 1);
        queue[queue.length - 1] = value;
    }

    public void clear() {
        queue = Arrays.copyOf(queue, 0);
    }

    public int size() {
        return queue.length;
    }

    public T peek() {
        return queue[0];
    }

    public T pool() {
        T removedElement = queue[0];
        queue = Arrays.copyOfRange(queue, 1, queue.length);
        return removedElement;
    }
}
