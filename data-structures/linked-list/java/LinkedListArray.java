/**
 * Linked List implementation using an array.
 * 
 * Time Complexity:
 * - add(Object data): O(1) amortized, O(n) worst case
 * - addFirst(Object data): O(n)
 * - addLast(Object data): O(1) amortized, O(n) worst case
 * - resize(): O(n)
 * - print(): O(n)
 */
public class LinkedListArray {
    private Object[] array;
    private int size;

    public LinkedListArray() {
        this.array = new Object[10];
        this.size = 0;
    }
    
    public void add(Object data) {
        if (size == array.length) {
            resize();
        }
        array[size] = data;
        size++;
    }
    
    public void addFirst(Object data) {
        if (size == array.length) {
            resize();
        }
        // Shift all elements to the right
        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = data;
        size++;
    }
    
    public void addLast(Object data) {
        add(data);
    }
    
    public void resize() {
        Object[] newArray = new Object[array.length * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
    
    public void print() {
        if (size == 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
