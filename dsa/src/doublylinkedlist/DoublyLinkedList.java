package doublylinkedlist;

/**
 * Represents a doubly linked list. Each element in the list is a {@link Node}
 * which contains a value and references to the previous and next nodes.
 */
public class DoublyLinkedList {
    Node head;
    Node tail;
    int size;

    /**
     * Returns the current size of the doubly linked list.
     *
     * @return The number of nodes in the list.
     */
    public int getSize() {
        System.out.println("Size is: " + this.size);
        return this.size;
    }

    /**
     * Represents a node in the doubly linked list. Each node holds an integer
     * value and references to the previous and next nodes in the sequence.
     */
    public static class Node {
        int value;
        Node prevNode;
        Node nextNode;

        /**
         * Constructs a new node with the specified value. The previous and next
         * node references are initially set to null.
         *
         * @param value The integer value to be stored in this node.
         */
        public Node(int value) {
            this.value = value;
        }
    }

    /**
     * Inserts a new node with the given value at the beginning of the doubly
     * linked list.
     *
     * @param value The integer value to be inserted at the beginning.
     */
    public void insertAtFirst(int value) {
        Node newNode = new Node(value);
        size++;
        if (head == null) {
            head = tail = newNode;
            head.prevNode = null;
            tail.nextNode = null;
            return;
        }
        newNode.nextNode = head;
        head.prevNode = newNode;
        head = newNode;
    }

    /**
     * Prints the elements of the doubly linked list starting from the head
     * to the tail, with each element separated by " -> ".
     */
    public void printListFromFirst() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value);
            current = current.nextNode;
            if (current != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    /**
     * Prints the elements of the doubly linked list starting from the tail
     * to the head, with each element separated by " -> ".
     */
    public void printListFromLast() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.value);
            current = current.prevNode;
            if (current != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    /**
     * Inserts a new node with the given value at the end of the doubly linked
     * list.
     *
     * @param value The integer value to be inserted at the end.
     */
    public void insertLast(int value) {
        Node newNode = new Node(value);
        size++;
        if (tail == null) {
            head = tail = newNode;
            head.prevNode = null;
            tail.nextNode = null;
            return;
        }
        newNode.prevNode = tail;
        tail.nextNode = newNode;
        tail = newNode;
    }

    /**
     * Inserts a new node with the given value at the specified position in the
     * doubly linked list. The position index starts from 0.
     *
     * @param position The index at which the new node should be inserted.
     * If the position is 0, the node is inserted at the beginning.
     * If the position is equal to the current size, the node is
     * inserted at the end.
     * @param value    The integer value to be inserted.
     * @throws IndexOutOfBoundsException if the position is negative or greater
     * than the current size of the list.
     */
    public void insertMiddle(int position, int value) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position: " + position);
            return;
        }

        Node newNode = new Node(value);
        size++;

        if (position == 0) {
            newNode.nextNode = head;
            if (head != null) {
                head.prevNode = newNode;
            }
            head = newNode;
            if (tail == null) {
                tail = head;
            }
            return;
        }

        if (position == size) {
            newNode.prevNode = tail;
            if (tail != null) {
                tail.nextNode = newNode;
            }
            tail = newNode;
            if (head == null) {
                head = tail;
            }
            return;
        }

        Node current = head;
        int count = 0;
        while (current != null && count < position - 1) {
            current = current.nextNode;
            count++;
        }

        if (current != null) {
            newNode.nextNode = current.nextNode;
            newNode.prevNode = current;
            if (current.nextNode != null) {
                current.nextNode.prevNode = newNode;
            }
            current.nextNode = newNode;
        }
    }

    /**
     * Deletes the first node from the doubly linked list. If the list is empty,
     * this method does nothing.
     */
    public void deleteFirst() {
        if (head == null) {
            return;
        }
        size--;
        head = head.nextNode;
        if (head != null) {
            head.prevNode = null;
        } else {
            tail = null; // List is now empty
        }
    }

    /**
     * Deletes the last node from the doubly linked list. If the list is empty,
     * this method does nothing.
     */
    public void deleteLast() {
        if (tail == null) {
            return;
        }
        size--;
        tail = tail.prevNode;
        if (tail != null) {
            tail.nextNode = null;
        } else {
            head = null; // List is now empty
        }
    }
}