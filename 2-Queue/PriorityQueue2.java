import java.util.*;

public class PriorityQueue2 {
    public static void main(String[] args) {

        // this is a priority queue that stores Double values. The default behavior of PriorityQueue is to order elements in natural order (for numbers, this means ascending order). So when we poll elements from the queue, it will return the smallest element first.
        Queue<String> queue = new PriorityQueue<String>();
        //if you need to order in reverse (largest first), you can use a custom comparator like this:
        // Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("A");
        queue.offer("C");
        queue.offer("D");
        queue.offer("E");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }


        
    }


}