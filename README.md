# Algorithms and Data Structures

A comprehensive collection of common algorithms and data structures implemented in multiple languages for comparison and learning purposes.

## Structure

This repository is organized by topic, with implementations in:
- **Java**
- **Python**
- **C++**
- **C**

## Topics

### Algorithms
- [Sorting](./sorting/) - Various sorting algorithms
  - [QuickSort](./sorting/quicksort/)
- [Searching](./searching/) - Search algorithms
  - [Binary Search](./searching/binary-search/)

### Data Structures
- [Linked List](./data-structures/linked-list/)
- [Binary Tree](./data-structures/binary-tree/)

## Structure Pattern

Each algorithm or data structure has its own directory containing language-specific implementations:
```
algorithm-name/
├── README.md        # Algorithm description and complexity
├── java/
├── python/
├── cpp/
└── c/
```

## Running Tests

Each implementation includes test files. Use the language-specific test runners:

```bash
# Run all Java tests
./tests/run-tests.sh java

# Run all Python tests
./tests/run-tests.sh python

# Run all C++ tests
./tests/run-tests.sh cpp

# Run all C tests
./tests/run-tests.sh c
```

## Comparing Implementations

Each topic folder contains a README with algorithm explanations and links to all language implementations for easy comparison.

## Contributing

When adding a new algorithm or data structure:
1. Create a new topic folder (if needed)
2. Create language subfolders: `java/`, `python/`, `cpp/`, `c/`
3. Implement the algorithm in each language
4. Include test files following the naming convention for each language
5. Update this README

## License

[Add your license here]

