package LearnDSA;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDSA {
    public static void main(String[] args) {

        //Queue declearation using LinkedList
        Queue<String> queue = new LinkedList<String>();

        //To check whether the queue is empty we will use the isEmpty method.
        System.out.println(queue.isEmpty());

        //Offer(), Poll() and peek() will not throw an exception
        //Enqueue (offer)
        queue.offer("Java");
        queue.offer("Python");
        queue.offer("C#");
        queue.offer("Rust");

        //To know the size of queue we will use size() method
        System.out.println(queue.size());

        //To check whether the element is present in the queue we make use of the contains() method.
        System.out.println(queue.contains("C#"));

        //To know the first value of queue we will use the enqueue method(offer)
        System.out.println(queue.peek());

        //To dequeue the value from the queue in the head(first).
        queue.poll();

        System.out.println(queue);
    }
}
