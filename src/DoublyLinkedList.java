package src;

public class DoublyLinkedList {
    class Node {
        int data;
        Node next;
        Node previous;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            head.previous = null;
            tail.previous = null;
        }
        else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    void displayDoublyLinkedListFromHead() {
        Node current = head;

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    void displayDoublyLinkedListFromTail() {
        Node current = tail;

        if (tail == null) {
            System.out.println("List is Empty");
            return;
        }

        while (current != null) {
            System.out.println(current.data);
            current = current.previous;
        }
    }
    public static void main(String args[]) {

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.addNode(1);
        doublyLinkedList.addNode(2);
        doublyLinkedList.addNode(3);
        doublyLinkedList.addNode(4);
        doublyLinkedList.addNode(5);
        doublyLinkedList.addNode(6);

        System.out.println("List traversal from Head");
        doublyLinkedList.displayDoublyLinkedListFromHead();
        System.out.println("\nList traversal from Tail");
        doublyLinkedList.displayDoublyLinkedListFromTail();

    }
}
