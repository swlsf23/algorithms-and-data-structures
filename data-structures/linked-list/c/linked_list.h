#ifndef LINKED_LIST_H
#define LINKED_LIST_H

#include "node.h"

// LinkedList structure
typedef struct LinkedList {
    Node* head;
    int size;
} LinkedList;

// Insert operations
void addFirst(LinkedList* list, int data);
void addLast(LinkedList* list, int data);
void addAtIndex(LinkedList* list, int index, int data);

// Delete operations
void removeFirst(LinkedList* list);
void removeLast(LinkedList* list);
void removeAtIndex(LinkedList* list, int index);

// Search operations
int search(LinkedList* list, int data);  // Returns index, or -1 if not found
int get(LinkedList* list, int index);     // Returns data at index

// Utility operations
void printList(LinkedList* list);
int isEmpty(LinkedList* list);
int getSize(LinkedList* list);
void freeLinkedList(LinkedList* list);

#endif