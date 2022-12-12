package module9.queue;

import java.util.Arrays;

public class MyQueueTest {
    public static void main(String[] args) {
       MyQueue<Integer> myQueue = new MyQueue<>();
       myQueue.setQueue(new Integer[0]);
        myQueue.add(19);
        myQueue.add(99);
        myQueue.add(277);
       myQueue.add(7);
       myQueue.add(13);
       myQueue.add(5);
       myQueue.add(2);
       System.out.println(Arrays.toString(myQueue.getQueue()));
       System.out.println(myQueue.pool());
       System.out.println(Arrays.toString(myQueue.getQueue()));
        System.out.println(myQueue.peek());
    }
}
