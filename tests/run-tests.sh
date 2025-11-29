#!/bin/bash

# Script to run all tests for a specific language
# Usage: ./run-tests.sh [java|python|cpp|c]

LANGUAGE=$1

if [ -z "$LANGUAGE" ]; then
    echo "Usage: ./run-tests.sh [java|python|cpp|c]"
    exit 1
fi

case $LANGUAGE in
    java)
        echo "Running Java tests..."
        find . -name "*Test.java" -path "*/java/*" -exec echo "Testing {}" \;
        find . -name "*Test.java" -path "*/java/*" -exec javac {} \;
        find . -name "*Test.class" -path "*/java/*" -exec java -cp "$(dirname {})" "$(basename {} .class)" \;
        ;;
    python)
        echo "Running Python tests..."
        find . -name "test_*.py" -path "*/python/*" -exec echo "Testing {}" \;
        find . -name "test_*.py" -path "*/python/*" -exec python3 {} \;
        ;;
    cpp)
        echo "Running C++ tests..."
        find . -name "test_*.cpp" -path "*/cpp/*" | while read testfile; do
            dir=$(dirname "$testfile")
            name=$(basename "$testfile" .cpp)
            echo "Compiling and testing $testfile"
            (cd "$dir" && g++ -o "$name" "$name.cpp" && ./"$name")
        done
        ;;
    c)
        echo "Running C tests..."
        find . -name "test_*.c" -path "*/c/*" | while read testfile; do
            dir=$(dirname "$testfile")
            name=$(basename "$testfile" .c)
            echo "Compiling and testing $testfile"
            (cd "$dir" && gcc -o "$name" "$name.c" && ./"$name")
        done
        ;;
    *)
        echo "Unknown language: $LANGUAGE"
        echo "Usage: ./run-tests.sh [java|python|cpp|c]"
        exit 1
        ;;
esac
