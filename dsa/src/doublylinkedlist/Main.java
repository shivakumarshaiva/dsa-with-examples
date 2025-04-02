package doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtFirst(3);
        list.printListFromFirst();
        list.printListFromLast();
        list.getSize();

        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.printListFromFirst();
        list.getSize();

        list.deleteFirst();
        list.printListFromFirst();
        list.printListFromLast();
        list.getSize();

        list.deleteLast();
        list.printListFromFirst();
        list.printListFromLast();
        list.getSize();

        list.insertMiddle(3, 8);
        list.printListFromFirst();
        list.printListFromLast();
        list.getSize();
    }
}
