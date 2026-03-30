//Queue : FIFO (First In First Out) data structure
// Elements are added at the rear and removed from the front
// Example: A line of customers at a diner
// enqueue() - adds an element to the rear of the queue -offers()
// dequeue() - removes an element from the front of the queue -poll()




import java.util.LinkedList;
import java.util.Queue;

public class DinerQueue {
    public static void main(String[] args) {

        // Create a queue for customers
        Queue<String> customerQueue = new LinkedList<>();

        // Customers arrive at the diner
        customerQueue.offer("Alice");
        customerQueue.offer("Bob");
        customerQueue.offer("Charlie");
        customerQueue.offer("Diana");

        /*

        // Display the current queue

        System.out.println("Current queue: " + customerQueue);

        // Serving customers (FIFO)
        while (!customerQueue.isEmpty()) {
            String currentCustomer = customerQueue.poll(); // Remove from front
            System.out.println(currentCustomer + " is being served.");
            System.out.println("Queue now: " + customerQueue);
        }

        System.out.println("All customers have been served.");

         */

        /*
        System.out.println("Peek at the front of the queue: " + customerQueue.peek());
        // Output: Peek at the front of the queue: Alice
        */

         // Searching for an element in the queue using contains()
        System.out.println("Is Bob in the queue? " + customerQueue.contains("Bob"));
        // Output: Is Bob in the queue? true

        //Get the size of the queue
        System.out.println("Number of customers in the queue: " + customerQueue.size());
        // Output: Number of customers in the queue: 4


        // Clear the queue
        customerQueue.clear();
        System.out.println("Queue cleared. Is the queue empty? " + customerQueue.isEmpty());
        // Output: Queue cleared. Is the queue empty? true

        // Uses of Queue:
        // 1. Customer service lines (banks, restaurants)
        // 2. Print job management
        // 3. Task scheduling (CPU scheduling)
        // 4. Breadth-First Search (BFS) in graph algorithms
        // 5. Call center systems

        









    }


}
    