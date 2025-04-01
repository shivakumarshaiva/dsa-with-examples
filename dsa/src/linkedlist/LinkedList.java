package linkedlist;

/**
 * Represents a singly linked list data structure.
 */
public class LinkedList {
    /**
     * Represents a node in the linked list. Each node contains an integer value
     * and a reference to the next node in the sequence.
     */
    static class Node {
        int value;
        Node next;

        /**
         * Constructs a new Node with the specified value.
         *
         * @param value The integer value to be stored in the node.
         */
        public Node(int value) {
            this.value = value;
        }
    }

    /**
     * The first node in the linked list. If the list is empty, head is null.
     */
    Node head;

    /**
     * The last node in the linked list. If the list is empty, tail is null.
     */
    Node tail;

    /**
     * The number of nodes currently in the linked list.
     */
    int length;

    /**
     * Inserts a new node with the given value at the beginning of the linked list.
     *
     * @param value The integer value to be inserted.
     */
    public void insertValueAtFirst(int value) {
        System.out.print("Inserting Element("+value+") at the first position: ");
        // Create a new node with the given value.
        Node newNode = new Node(value);
        // If the list is empty, the new node becomes both the head and the tail.
        if (head == null) {
            head = tail = newNode;
        } else {
            // Otherwise, set the next of the new node to the current head,
            newNode.next = head;
            // and update the head to be the new node.
            head = newNode;
        }
        // Increment the length of the list.
        length++;
    }

    /**
     * Inserts a new node with the given value at the end of the linked list.
     *
     * @param value The integer value to be inserted.
     */
    public void insertValueAtLast(int value) {
        System.out.print("Inserting Element("+value+") at the last position: ");
        // Create a new node with the given value.
        Node newNode = new Node(value);
        // If the list is empty, the new node becomes the head.
        if (head == null) {
            head = newNode;
        } else {
            // Otherwise, set the next of the current tail to the new node.
            tail.next = newNode;
        }
        // Update the tail to be the new node.
        tail = newNode;
        // Increment the length of the list.
        length++;
    }

    /**
     * Inserts a new node with the given value at the specified position in the
     * linked list (0-based index).
     *
     * @param value    The integer value to be inserted.
     * @param position The index at which the new node should be inserted.
     * If position is 0 or the list is empty, the node is inserted at the beginning.
     * If position is greater than or equal to the list length, the node is inserted at the end.
     */
    public void insertValueAtMiddle(int value, int position) {
        System.out.print("Inserting Element("+value+") at the " +position+ " position: ");
        // Create a new node with the given value.
        Node newNode = new Node(value);
        // If the list is empty or the position is 0, insert at the beginning.
        if (head == null || position == 0) {
            newNode.next = head;
            head = tail = newNode;
        } else {
            // Traverse the list to find the node at the position before the insertion point.
            Node temp = head;
            int count = 0;
            while (count < position - 1) {
                // If the end of the list is reached before the desired position, break the loop.
                if (temp.next == null) {
                    break;
                }
                temp = temp.next;
                count++;
            }
            // Insert the new node by updating the 'next' pointers.
            newNode.next = temp.next;
            temp.next = newNode;
        }
        // Increment the length of the list.
        length++;
    }

    /**
     * Removes the first element from the linked list.
     * Prints a message indicating the removal operation.
     */
    public void removeElementFromFirst() {
        System.out.print("Removing at the first element: ");
        // If the list is not empty, update the head to the next node.
        if (length != 0) {
            head = head.next;
            // Decrement the length of the list.
            length--;
            // If the list becomes empty after removal, set tail to null as well.
            if (length == 0) {
                tail = null;
            }
        }
    }

    /**
     * Removes the last element from the linked list.
     * Prints a message indicating the removal operation.
     */
    public void removeElementFromLast() {
        System.out.print("Removing at the last element: ");
        // If the list has only one element, set both head and tail to null.
        if (length == 1) {
            head = tail = null;
            length--;
            return;
        }
        // Traverse the list to find the second-to-last node.
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        // Set the 'next' of the second-to-last node to null, effectively removing the last node.
        temp.next = null;
        // Update the tail to be the second-to-last node.
        tail = temp;
        // Decrement the length of the list.
        length--;
    }

    /**
     * Prints the elements of the linked list to the console, separated by "->".
     */
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.printf(""+temp.value);
            temp = temp.next;
            if(temp != null){
                System.out.printf("->");
            }
        }
        System.out.println(); // Add a newline after printing the list.
    }

    /**
     * Prints the current size (number of elements) of the linked list to the console.
     */
    public void printSize() {
        System.out.printf("List size is : " + length + "\n");
    }
}