/*
---

## 1. 📌 Overview

`DynamicArrayDemo` is a custom implementation of a dynamic array in Java, designed to mimic the behavior of **Java ArrayList**.

Unlike standard arrays, this structure:

* Automatically resizes when capacity is exceeded
* Supports insertion, deletion, and search operations
* Optimizes memory through controlled shrinking

---

## 2. 🧱 Class Structure

```java
public class DynamicArrayDemo
```

### Internal State Variables

| Variable   | Type       | Description                         |
| ---------- | ---------- | ----------------------------------- |
| `size`     | `int`      | Number of elements currently stored |
| `capacity` | `int`      | Maximum elements the array can hold |
| `array`    | `Object[]` | Underlying storage structure        |

---

## 3. ⚙️ Constructors

### 3.1 Default Constructor

```java
public DynamicArrayDemo()
```

* Initializes array with default capacity of **10**
* Suitable for general use cases

---

### 3.2 Parameterized Constructor

```java
public DynamicArrayDemo(int capacity)
```

* Allows custom initial capacity
* Reduces resizing overhead in predictable workloads

---

## 4. 🔄 Core Operations

---

### 4.1 Add Operation

```java
public void add(Object data)
```

#### Description:

Appends an element to the end of the array.

#### Process:

1. Check if `size >= capacity`
2. Call `grow()` if needed
3. Insert element at index `size`
4. Increment `size`

#### Complexity:

* **O(1)** (amortized)
* **O(n)** (during resize)

---

### 4.2 Insert Operation

```java
public void insert(int index, Object data)
```

#### Description:

Inserts an element at a specified index.

#### Process:

1. Validate index bounds
2. Grow array if full
3. Shift elements right
4. Insert new element
5. Increment size

#### Example:

```
Before: [A, B, C]
Insert X at index 1
After : [A, X, B, C]
```

#### Complexity:

* **O(n)**

---

### 4.3 Delete Operation

```java
public void delete(Object data)
```

#### Description:

Removes the first occurrence of a given element.

#### Process:

1. Search for element
2. Shift elements left to fill gap
3. Set last element to `null`
4. Decrement size
5. Call `shrink()` if necessary

#### Example:

```
Before: [A, B, C, D]
Delete B
After : [A, C, D]
```

#### Complexity:

* **O(n)**

---

### 4.4 Search Operation

```java
public int search(Object data)
```

#### Description:

Finds the index of an element.

#### Returns:

* Index if found
* `-1` if not found

#### Complexity:

* **O(n)**

---

## 5. 📈 Resizing Mechanisms

---

### 5.1 Grow Method

```java
public void grow()
```

#### Strategy:

* Doubles capacity when full

#### Steps:

1. Create new array with `capacity * 2`
2. Copy elements
3. Reassign reference

#### Benefit:

* Minimizes resizing frequency
* Ensures amortized efficiency

---

### 5.2 Shrink Method

```java
public void shrink()
```

#### Strategy:

* Reduce capacity by half when usage ≤ 25%

#### Condition:

```java
if (size <= capacity / 4)
```

#### Benefit:

* Prevents memory wastage
* Maintains efficient memory footprint

---

## 6. 🔍 Utility Methods

---

### 6.1 isEmpty

```java
public boolean isEmpty()
```

#### Returns:

* `true` if array is empty
* `false` otherwise

---

### 6.2 toString

```java
public String toString()
```

#### Description:

Returns a readable representation of the array.

#### Example Output:

```
[A, B, C]
```

#### Implementation Detail:

* Uses `StringBuilder` for performance optimization

---

## 7. ⚡ Performance Summary

| Operation | Time Complexity |
| --------- | --------------- |
| Add       | O(1) amortized  |
| Insert    | O(n)            |
| Delete    | O(n)            |
| Search    | O(n)            |
| Grow      | O(n)            |
| Shrink    | O(n)            |

---

## 8. ⚠️ Limitations

* Uses `Object` type (no type safety)
* Linear search (no indexing optimization)
* Not thread-safe
* Potential `NullPointerException` if not handled carefully

---

## 9. 🚀 Recommended Enhancements

### 9.1 Generics Support

```java
class DynamicArray<T>
```

Improves type safety and usability

---

### 9.2 Additional Methods

* `get(int index)`
* `set(int index, T value)`
* `clear()`

---

### 9.3 Null Safety Improvements

Avoid runtime exceptions during comparisons

---

### 9.4 Minimum Capacity Constraint

Prevent excessive shrinking

---

## 10. 🧠 Conceptual Significance

This implementation demonstrates:

* Dynamic memory allocation
* Amortized time complexity
* Data shifting algorithms
* Memory optimization strategies

These concepts are foundational in:

* System design
* Database engines
* High-performance applications

---

## ✅ Conclusion

`DynamicArrayDemo` is a well-structured, educational implementation of a dynamic array that balances:

* Performance
* Memory efficiency
* Simplicity

It serves as a strong foundation for understanding how modern data structures like `ArrayList` operate internally.

---
 {
    
}

*/