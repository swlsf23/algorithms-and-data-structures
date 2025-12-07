#ifndef NODE_H
#define NODE_H

#include <stdio.h>
#include <stdlib.h>

// Generic Node structure
typedef struct Node {
    int data;              // Could be void* for even more generic
    struct Node* next;
} Node;

// Generic node functions
Node* createNode(int data);
void freeNode(Node* node);

#endif