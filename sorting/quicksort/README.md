# QuickSort

Implementation of the QuickSort algorithm in multiple languages.

## Implementations

- [Java](./java/)
- [Python](./python/)
- [C++](./cpp/)
- [C](./c/)

## Algorithm Description

QuickSort is a divide-and-conquer sorting algorithm that works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays according to whether they are less than or greater than the pivot.

## Complexity

| Time (Best) | Time (Average) | Time (Worst) | Space |
|-------------|----------------|--------------|-------|
| O(n log n)  | O(n log n)     | O(n²)        | O(log n) |

## How It Works

1. Pick an element as pivot
2. Partition: Rearrange array so elements < pivot are on left, elements > pivot are on right
3. Recursively sort the sub-arrays

