/*
 * DYNAMIC ARRAY (ArrayList) VISUALIZATION
 *
 * Step 1: Initial state (empty)
 * +-----+-----+-----+-----+
 * |  0  |  1  |  2  |  3  |
 * +-----+-----+-----+-----+
 * |     |     |     |     |  ← all slots empty
 * +-----+-----+-----+-----+
 * Size = 0, Capacity = 4
 *
 * Step 2: Add elements A, B, C, D
 * +-----+-----+-----+-----+
 * |  0  |  1  |  2  |  3  |
 * +-----+-----+-----+-----+
 * |  A  |  B  |  C  |  D  |
 * +-----+-----+-----+-----+
 * Size = 4, Capacity = 4
 *
 * Step 3: Add element E → triggers resizing (capacity doubles)
 * +-----+-----+-----+-----+-----+-----+-----+-----+
 * |  0  |  1  |  2  |  3  |  4  |  5  |  6  |  7  |
 * +-----+-----+-----+-----+-----+-----+-----+-----+
 * |  A  |  B  |  C  |  D  |  E  |     |     |     |
 * +-----+-----+-----+-----+-----+-----+-----+-----+
 * Size = 5, Capacity = 8
 *
 * Step 4: Remove element C → elements shift left
 * +-----+-----+-----+-----+-----+-----+-----+-----+
 * |  0  |  1  |  2  |  3  |  4  |  5  |  6  |  7  |
 * +-----+-----+-----+-----+-----+-----+-----+-----+
 * |  A  |  B  |  D  |  E  |     |     |     |     |
 * +-----+-----+-----+-----+-----+-----+-----+-----+
 * Size = 4, Capacity = 8
 *
 * Step 5: Access element at index 2
 * list.get(2) → "D"
 * Access is O(1)
 *
 * NOTES:
 * - Dynamic array grows automatically; capacity doubles on overflow
 * - Size = number of elements in use; Capacity = total allocated slots
 * - Removing elements shifts remaining elements to the left
 * - Random access by index is very fast (O(1))
 */