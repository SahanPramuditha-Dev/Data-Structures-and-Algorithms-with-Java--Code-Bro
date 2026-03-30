public class main {

    public static void main(String[] args) {

        // Create a new Dynamic Array object
        DynamicArrayDemo dynamicArray = new DynamicArrayDemo();

        /*
         * ADD OPERATIONS
         * Adding elements sequentially (like ArrayList)
         * Internally:
         * [A, B, C]
         */
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        // Print current array
        System.out.println("After adding elements: " + dynamicArray);

        /*
         * INSERT OPERATION
         * Insert element at index 1
         * Before: [A, B, C]
         * After : [A, X, B, C]
         */
        dynamicArray.insert(1, "X");
        System.out.println("After inserting at index 1: " + dynamicArray);

        /*
         * DELETE OPERATION
         * Remove element "B"
         * Before: [A, X, B, C]
         * After : [A, X, C]
         */
        dynamicArray.delete("B");
        System.out.println("After deleting B: " + dynamicArray);

        /*
         * SEARCH OPERATION
         * Find index of element "C"
         */
        int index = dynamicArray.search("C");
        System.out.println("Index of C: " + index);

        /*
         * EMPTY CHECK
         */
        System.out.println("Is array empty? " + dynamicArray.isEmpty());
    }
}