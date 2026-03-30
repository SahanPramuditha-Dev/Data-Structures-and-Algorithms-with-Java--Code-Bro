import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        // Create a Stack object that stores String values
        Stack<String> stack = new Stack<>();

        // Check if the stack is empty (optional)
        // System.out.println("Is the stack empty? " + stack.isEmpty());

        // Adding elements to the stack using push()
        // push() inserts elements at the TOP of the stack (LIFO structure)

        stack.push("Call Of Duty : Modern Warfare"); // First item added (bottom of stack)
        stack.push("Fortnite");       // Added on top of previous
        stack.push("League of Legends");   // Added on top
        stack.push("Spiderman");   // Added on top
        stack.push("Valorant");       // Last added → becomes TOP of the stack

        /*
            Stack as a book pile (bottom → top):

                Index          Position           Data / Book
             (Bottom-Up)      (Top-Down)
           ┌──────────────┬──────────────┬─────────────────────────┐
           │      4       │      1       │        Valorant         │ <- Top (TOS)
           ├──────────────┼──────────────┼─────────────────────────┤
           │      3       │      2       │        Spiderman        │
           ├──────────────┼──────────────┼─────────────────────────┤
           │      2       │      3       │    League of Legends    │
           ├──────────────┼──────────────┼─────────────────────────┤
           │      1       │      4       │        Fortnite         │
           ├──────────────┼──────────────┼─────────────────────────┤
           │      0       │      5       │    Call Of Duty: MW     │ <- Bottom
           └──────────────┴──────────────┴─────────────────────────┘
        */


        /* 
        1st option: Display the stack after adding elements and removing the top element using pop()

        // Display current stack (top is the rightmost element)
        System.out.println(stack);

        // Remove the top element using pop()
        stack.pop(); // Removes "Valorant" (LIFO: Last In, First Out)

        // Display stack after removal
        System.out.println(stack); 
        // Should print: [Call Of Duty : Modern Warfare, Fortnite, League of Legends, Spiderman]
        */

        /* 
        2nd option: Remove all elements from the stack using pop() in a loop

        // remove all elements from the stack using pop() in a loop
        while (!stack.isEmpty()) {
            System.out.println("Stack before pop: " + stack); // Optional: show stack before popping
            System.out.println("Removing: " + stack.peek()); // Optional: show the top element before removing
            stack.pop();
            System.out.println("Stack after pop: " + stack); // Optional: show stack after popping
        }

        // check if the stack is empty after removing all elements
        System.out.println("Is the stack empty? " + stack.isEmpty()); // Should print true

        // Display stack after removing all elements
        System.out.println(stack); // Should print an empty stack: []
        */

        /*

        // 3rd option : Storing popped elements

        String myFavGame = stack.pop(); 
        // Removes "Valorant" and stores it in myFavGame

        System.out.println("My favorite game is: " + myFavGame); 
        // Output: My favorite game is: Valorant

        // Viewing the top element without removing it using peek()
        System.out.println("Current top element (peek): " + stack.peek()); 
        // Output: Current top element (peek): Spiderman

        */

        /* 
        // Searching for an element in the stack using search() and Gives the place of the element from the top of the stack
        System.out.println("Search for 'Fortnite' in the stack: " + stack.search("Fortnite"));
        // Output: Search for 'Fortnite' in the stack: 3

        */

        for(int i =0; i < 1000000000; i++) {
            stack.push("Skyrim");
        }
        // This will cause a StackOverflowError because the stack will exceed its maximum capacity

        //Uses of Stack:
        // 1. Undo functionality in applications (e.g., text editors, graphic design software)
        // 2. Backtracking algorithms (e.g., maze solving, puzzle solving)
        // 3. Expression evaluation (e.g., infix to postfix conversion, evaluating postfix expressions)
        // 4. Moving back and forth in web browsers (back and forward buttons)
        // 5. Function call management in programming languages (call stack)
        

    }
}