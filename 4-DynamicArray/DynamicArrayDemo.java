public class DynamicArrayDemo {

    int size = 0;          // Tracks number of actual elements stored
    int capacity = 10;     // Current maximum capacity of the array
    Object[] array;        // Underlying storage (fixed-size array)

    // Default constructor → initializes array with default capacity (10)
    public DynamicArrayDemo() {
        this.array = new Object[capacity];
    }

    // Parameterized constructor → allows custom initial capacity
    public DynamicArrayDemo(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    // Add element at the end (like ArrayList.add)
    public void add(Object data) {

        // If array is full, expand its size
        if (size >= capacity) {
            grow();
        }

        // Place element at next available position
        array[size] = data;

        // Increase size after insertion
        size++;
    }

    // Insert element at specific index
    public void insert(int index, Object data) {

        // Validate index boundaries
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds");
            return;
        }

        // Ensure capacity before inserting
        if (size >= capacity) {
            grow();
        }

        /*
         * Shift elements to the right:
         * Example:
         * Before: [A, B, C, D]
         * Insert X at index 1
         * After shift: [A, B, B, C, D]
         */
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        // Insert new element
        array[index] = data;

        // Update size
        size++;
    }

    // Delete first occurrence of a value
    public void delete(Object data) {

        for (int i = 0; i < size; i++) {

            // Check if element matches
            if (array[i].equals(data)) {

                /*
                 * Shift elements left to fill the gap:
                 * Example:
                 * Before: [A, B, C, D]
                 * Delete B
                 * After shift: [A, C, D, null]
                 */
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }

                // Remove duplicate last element
                array[size - 1] = null;

                // Reduce size
                size--;

                // Optimize memory if needed
                shrink();

                return;
            }
        }

        // If element not found
        System.out.println("Element not found");
    }

    // Search for element and return index
    public int search(Object data) {

        for (int i = 0; i < size; i++) {

            if (array[i].equals(data)) {
                return i; // Return index if found
            }
        }

        return -1; // Not found
    }

    // Double the capacity when array is full
    public void grow() {

        capacity *= 2; // Scaling strategy (critical for performance)

        Object[] newArray = new Object[capacity];

        // Copy existing elements to new array
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }

        // Redirect reference
        array = newArray;
    }

    // Reduce capacity when array is under-utilized
    public void shrink() {

        /*
         * Shrink condition:
         * If array is only 25% utilized → reduce capacity by half
         * Prevents memory wastage
         */
        if (size <= capacity / 4) {

            capacity /= 2;

            Object[] newArray = new Object[capacity];

            // Copy elements
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }

            array = newArray;
        }
    }

    // Check if array has no elements
    public boolean isEmpty() {
        return size == 0;
    }

    // Convert array to readable format
    public String toString() {

        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < size; i++) {

            sb.append(array[i]);

            // Add comma except for last element
            if (i < size - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");

        return sb.toString();
    }
}