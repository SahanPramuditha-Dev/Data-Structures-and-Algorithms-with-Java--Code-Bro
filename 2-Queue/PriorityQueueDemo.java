import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        // this is a priority queue that stores Double values. The default behavior of PriorityQueue is to order elements in natural order (for numbers, this means ascending order). So when we poll elements from the queue, it will return the smallest element first.
        Queue<Double> queue = new PriorityQueue<Double>();
        //if you need to order in reverse (largest first), you can use a custom comparator like this:
        // Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.0);
        queue.offer(2.0);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }


        
    }


}