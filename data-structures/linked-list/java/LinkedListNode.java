/**
 * Linked List implementation using nodes.
 * 
 * Time Complexity:
 * - add(int index, Object data): O(1) if index is 0, O(n) otherwise
 * - add(Object data): O(n)
 * - addFirst(Object data): O(1)
 * - addLast(Object data): O(n)
 * - print(): O(n)
 */
public class LinkedListNode {
    private Node head;
    private int size;

    public LinkedListNode() {
        this.head = null;
        this.size = 0;
    }
    
    public void add(int index, Object data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node newNode = new Node(data);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } 
        else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        size++;
    }
    public void add(Object data) {
        add(size, data);
    }
    public void addFirst(Object data) {
        add(0, data);
    }
    public void addLast(Object data) {
        add(size, data);
    }
    
    public void print() {
        if (head == null) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        Node current = head;
        while (current != null) {
            System.out.print(current.getData());
            if (current.getNext() != null) {
                System.out.print(", ");
            }
            current = current.getNext();
        }
        System.out.println("]");
    }
}
