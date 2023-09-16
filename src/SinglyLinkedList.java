package src;

public class SinglyLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void displaySingleLinkedList() {
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

    public static void main(String args[]) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.addNode(1);
        singlyLinkedList.addNode(2);
        singlyLinkedList.addNode(3);
        singlyLinkedList.addNode(4);
        singlyLinkedList.addNode(5);
        singlyLinkedList.addNode(6);

        singlyLinkedList.displaySingleLinkedList();

    }
}
