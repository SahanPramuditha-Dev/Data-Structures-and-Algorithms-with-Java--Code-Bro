import java.util.*;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("F");

        // Display the linked list
        System.out.println("LinkedList: " + linkedList);

        //Remove using pop
        String removedElement = linkedList.pop();
        System.out.println("Removed element using pop(): " + removedElement);
        System.out.println("LinkedList after pop(): " + linkedList);

        // Insert "X" at index 2
        linkedList.add(2, "X");
        System.out.println("After inserting 'X': " + linkedList);

        // Remove element at index 3
        linkedList.remove(3);
        System.out.println("After removal: " + linkedList);

        // Peek at the first element (head of the list)
        String firstElement = linkedList.peek();
        System.out.println("First element (peek): " + firstElement);


        // Get the size of the linked list
        int size = linkedList.size();
        System.out.println("Size of the linked list: " + size);

        //Removw the first element using removeFirst()
        String removedFirst = linkedList.removeFirst();
        System.out.println("Removed first element using removeFirst(): " + removedFirst);
        System.out.println("LinkedList after removeFirst(): " + linkedList);


        //Remove the last element using removeLast()
        String removedLast = linkedList.removeLast();
        System.out.println("Removed last element using removeLast(): " + removedLast);
        System.out.println("LinkedList after removeLast(): " + linkedList);
    }
}