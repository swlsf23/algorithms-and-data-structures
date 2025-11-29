public class LinkedListDriver {
    public static void main(String[] args) {
        System.out.println("=== LinkedList Driver ===\n");
        
        // Node-based implementation
        System.out.println("LinkedListNode implementation:");
        LinkedListNode nodeList = new LinkedListNode();
        for (int i = 1; i <= 10; i++) {
            nodeList.add("Item" + i);
        }
        System.out.print("Contents: ");
        nodeList.print();
        
        // Array-based implementation
        System.out.println("\nLinkedListArray implementation:");
        LinkedListArray arrayList = new LinkedListArray();
        for (int i = 1; i <= 10; i++) {
            arrayList.add("Item" + i);
        }
        System.out.print("Contents: ");
        arrayList.print();
        
        System.out.println("\n=== Driver Complete ===");
    }
}

