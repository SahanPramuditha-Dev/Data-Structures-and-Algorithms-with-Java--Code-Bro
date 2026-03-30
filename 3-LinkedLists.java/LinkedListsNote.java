// *ArrayLists are a dynamic data structure that uses an internal array to store elements. They provide fast access to elements using indices (O(1) time complexity) but can be inefficient for insertions and deletions in the middle of the list, as these operations require shifting elements to maintain contiguous storage. In contrast, Linked Lists consist of nodes that contain data and a reference to the next node, allowing for efficient insertions and deletions at any position without the need for shifting, but they have slower access times (O(n)) compared to ArrayLists due to the need for traversal from the head node to access specific elements.
/**
 
 *
 * An ArrayList uses an internal array to store elements.
 * The diagram below illustrates the relationship between:
 * 1. Indices (0-8)
 * 2. Elements ("A"-"H")
 * 3. Memory Addresses (Simulated by 'Fake St.')
 *
 * Index:       0       1       2       3       4       5       6       7       8
 * +-------+-------+-------+-------+-------+-------+-------+-------+-------+
 * Data:   |  "A"  |  "B"  |  "C"  |  "D"  |  "E"  |  "F"  |  "G"  |  "H"  |       |
 * +-------+-------+-------+-------+-------+-------+-------+-------+-------+
 * Address:   123     125     127     129     131     133     135     137     139
 * Fake St. Fake St. Fake St. Fake St. Fake St. Fake St. Fake St. Fake St. Fake St.
 *
 * - Current Size: 8 (Indices 0 through 7 are occupied)
 * - Capacity: 9+ (Index 8 is currently empty/null)
 *
 * ---------------------------------------------------------------------------
 * ! INSERTION DIFFICULTY (Adding at index 2)
 * ---------------------------------------------------------------------------
 *
 // ? Goal: Insert "X" at index 2
 *
 * BEFORE:
 * Index:   0    1    2    3    4    5    6    7
 * Data:   [A]  [B]  [C]  [D]  [E]  [F]  [G]  [H]
 *
 * STEP 1: Shift elements to the RIGHT →
 *                 C → D → E → F → G → H
 *
 * AFTER SHIFT:
 * Index:   0    1    2    3    4    5    6    7    8
 * Data:   [A]  [B]  [ ]  [C]  [D]  [E]  [F]  [G]  [H]
 *
 * STEP 2: Insert "X"
 *
 * FINAL:
 * Index:   0    1    2    3    4    5    6    7    8
 * Data:   [A]  [B]  [X]  [C]  [D]  [E]  [F]  [G]  [H]
 *
 * ⚠ Cost: O(n) → All elements after index must be shifted
 *
 * ---------------------------------------------------------------------------
 * ! DELETION DIFFICULTY (Removing at index 3)
 * ---------------------------------------------------------------------------
 *
 * ? Goal: Remove element at index 3 ("D")
 *
 * BEFORE:
 * Index:   0    1    2    3    4    5    6    7
 * Data:   [A]  [B]  [C]  [D]  [E]  [F]  [G]  [H]
 *
 * STEP 1: Remove "D"
 *
 * Index:   0    1    2    3    4    5    6    7
 * Data:   [A]  [B]  [C]  [ ]  [E]  [F]  [G]  [H]
 *
 * STEP 2: Shift elements to the LEFT ←
 *                 E ← F ← G ← H
 *
 * FINAL:
 * Index:   0    1    2    3    4    5    6
 * Data:   [A]  [B]  [C]  [E]  [F]  [G]  [H]
 *
 * ⚠ Cost: O(n) → All elements after index must be shifted
 *
 * ---------------------------------------------------------------------------
 * KEY TAKEAWAY
 * ---------------------------------------------------------------------------
 * - Fast access (O(1)) using index
 * - Slow insert/delete in middle (O(n)) due to shifting
 * - Efficient at end (amortized O(1))
 */

// * Linked Lists are a collection of nodes where each node contains data and a reference (or link) to the next node in the sequence. Unlike arrays, linked lists do not require contiguous memory allocation, allowing for efficient insertions and deletions at any position in the list without the need to shift elements. However, linked lists have slower access times (O(n)) compared to arrays (O(1)) because they require traversal from the head node to access a specific element. 
/*
                     LinkedLists
                       (singly)

        Node<E> head = 123 Fake St.
                   |
                   v

        +---------+------------------+
        |  Data   |     Address      |
        |  "A"    | 101 Maple Blvd   |
        +---------+------------------+
                   |
                   | Next
                   v
        +---------+------------------+
        |  Data   |     Address      |
        |  "B"    | 404 Nowhere Ln   |
        +---------+------------------+
                   \
                    \ Next
                     v
              +---------+------------------+
              |  Data   |     Address      |
              |  "C"    | 666 Crime Cir    |
              +---------+------------------+
                           |
                           | Next
                           v
              +---------+------------------+
              |  Data   |     Address      |
              |  "D"    |      null        |
              +---------+------------------+
                           |
                           | Next
                           v
                          NULL
*/

// ? Adding a New Node ("X") between "B" and "C" in a Singly Linked List

/*
                     LinkedLists
        (Insert "X" between B and C)

        Node<E> head = 123 Fake St.
                   |
                   v

        +---------+------------------+
        |  Data   |     Address      |
        |  "A"    | 101 Maple Blvd   |
        +---------+------------------+
                   |
                   | Next
                   v
        +---------+------------------+
        |  Data   |     Address      |
        |  "B"    | 404 Nowhere Ln   |
        +---------+------------------+
                   |
                   | Next (UPDATED)
                   v
     >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
     >>>// ? NEW NODE INSERTED ("X")     >>>
     >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        +=========+==================+
        |  Data   |     Address      |
        |  "X"    | 222 Insert Ln    |
        +=========+==================+
                   \
                    \ Next
                     v
              +---------+------------------+
              |  Data   |     Address      |
              |  "C"    | 666 Crime Cir    |
              +---------+------------------+
                           |
                           | Next
                           v
              +---------+------------------+
              |  Data   |     Address      |
              |  "D"    |      null        |
              +---------+------------------+
                           |
                           | Next
                           v
                          NULL
*/