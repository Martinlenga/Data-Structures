import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.*;

public class queues {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Chad");
        queue.offer("Jack");
        queue.offer("Harold");
        queue.offer("Anna");
        queue.poll();
        queue.poll();

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Chad"));

        Queue<Double> q2 = new PriorityQueue<>(Collections.reverseOrder());
        q2.offer(3.0);
        q2.offer(1.5);
        q2.offer(4.0);
        q2.offer(2.5);

        while(!q2.isEmpty()){
            System.out.println(q2.poll());
        }



    }
}
