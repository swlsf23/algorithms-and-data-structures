# Algorithms and Data Structures

A collection of algorithms and data structures that I developed while studying data science in Python and Java, and subsequently ported to other languages (C++ and C) for comparison and learning purposes.

## ⚠️ Educational Purpose Disclaimer

These are reference implementations for educational purposes. They are not optimized for efficiency and are not considered best practices, especially in production environments. These implementations are intended to help understand algorithm concepts and compare implementations across different programming languages.

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

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.

