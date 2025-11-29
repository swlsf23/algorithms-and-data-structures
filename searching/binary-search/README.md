# Binary Search

Implementation of the Binary Search algorithm in multiple languages.

## Implementations

- [Java](./java/)
- [Python](./python/)
- [C++](./cpp/)
- [C](./c/)

## Algorithm Description

Binary Search is a search algorithm that finds the position of a target value within a **sorted** array. It works by repeatedly dividing in half the portion of the list that could contain the target.

## Complexity

| Time (Best) | Time (Average) | Time (Worst) | Space |
|-------------|----------------|--------------|-------|
| O(1)        | O(log n)       | O(log n)     | O(1)  |

## Requirements

- The array must be sorted
- Works on sorted arrays or sorted data structures

## How It Works

1. Compare target with middle element
2. If target matches, return index
3. If target < middle, search left half
4. If target > middle, search right half
5. Repeat until found or search space is empty

