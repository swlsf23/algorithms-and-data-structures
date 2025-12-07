#include <stdio.h>
#include <stdlib.h>
#include "linked_list.h"

LinkedList* createLinkedList() {
    LinkedList* list = (LinkedList*)malloc(sizeof(LinkedList));
    if (list == NULL) {
        printf("Memory allocation failed!\n");
        exit(1);
    }
    list->head = NULL;
    list->size = 0;
    return list;
}

void freeLinkedList(LinkedList* list) {
    if (list == NULL) {
        return;
    }
    
    Node* current = list->head;
    while (current != NULL) {
        Node* next = current->next;
        freeNode(current);
        current = next;
    }
    
    free(list);
}

void addFirst(LinkedList* list, int data) {
    Node* newNode = createNode(data);
    newNode->next = list->head;
    list->head = newNode;
    list->size++;
}

void addLast(LinkedList* list, int data) {

    Node* newNode = createNode(data);
    Node* current = list->head;
    while (current->next != NULL) {
        current = current->next;
    }
    current->next = newNode;
    list->size++;
}

void addAtIndex(LinkedList* list, int index, int data) {
    Node* newNode = createNode(data);
    Node* current = list->head;
    for (int i = 0; i < index - 1; i++) {
        current = current->next;
    }
    newNode->next = current->next;
    current->next = newNode;
    list->size++;
}

void removeFirst(LinkedList* list) {

    Node* current = list->head;
    list->head = current->next;
    freeNode(current);
    list->size--;
}

void removeLast(LinkedList* list) {

    Node* current = list->head;
    while (current->next->next != NULL) {
        current = current->next;
    }
    freeNode(current->next);
    current->next = NULL;
    list->size--;
}

void removeAtIndex(LinkedList* list, int index) {

    Node* current = list->head;
    for (int i = 0; i < index - 1; i++) {
        current = current->next;
    }
    Node* temp = current->next;
    current->next = current->next->next;
    freeNode(temp);
    list->size--;
}

int search(LinkedList* list, int data) {

    Node* current = list->head;
    for (int i = 0; i < list->size; i++) {
        if (current->data == data) {
            return i;
        }
    }
    return -1;
}
int main() {
    // Test createLinkedList
    LinkedList* list = createLinkedList();
    printf("Created linked list. Size: %d\n", list->size);
    printf("Head is NULL: %s\n", list->head == NULL ? "yes" : "no");
    
    freeLinkedList(list);
    return 0;
}