/**
 * Node class for linked list implementation.
 * 
 * Time Complexity:
 * - Node(Object data): O(1)
 * - getData(): O(1)
 * - getNext(): O(1)
 * - setNext(Node next): O(1)
 */
public class Node {
    Object data;
    Node next;

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }
    public Object getData() {
        return data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}