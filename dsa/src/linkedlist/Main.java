package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertValueAtFirst(1);
        linkedList.printList();
        linkedList.printSize();
        linkedList.insertValueAtFirst(2);
        linkedList.printList();
        linkedList.printSize();
        linkedList.insertValueAtFirst(3);
        linkedList.printList();
        linkedList.printSize();
        linkedList.insertValueAtFirst(4);
        linkedList.printList();
        linkedList.printSize();

        linkedList.insertValueAtLast(6);
        linkedList.printList();
        linkedList.printSize();
        linkedList.insertValueAtLast(7);
        linkedList.printList();
        linkedList.printSize();
        linkedList.insertValueAtLast(8);
        linkedList.printList();
        linkedList.printSize();
        linkedList.insertValueAtLast(9);
        linkedList.printList();
        linkedList.printSize();

        linkedList.removeElementFromLast();
        linkedList.printList();
        linkedList.printSize();

        linkedList.removeElementFromLast();
        linkedList.printList();
        linkedList.printSize();

        linkedList.removeElementFromLast();
        linkedList.printList();
        linkedList.printSize();

        linkedList.insertValueAtMiddle(10, 3);
        linkedList.printList();
        linkedList.printSize();

        linkedList.removeElementFromFirst();
        linkedList.printList();
        linkedList.printSize();
    }
}