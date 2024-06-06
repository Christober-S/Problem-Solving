package LearnDSA;


import java.awt.desktop.QuitResponse;
import java.util.Collection;
import java.util.Collections;
import java.util.Queue;
import java.util.PriorityQueue;
public class PriorityQueueDSA {
    public static void main(String[] args) {

        //To decleare the prorityQueue
//        Queue<Double> queue = new PriorityQueue<>();

        //To decleare the priorityQueue and in the reverse order
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        //while printing the value will be in the order: 1.5, 2.0, 2.5, 3.0, 4.0

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
