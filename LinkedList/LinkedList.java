package LinkedList;

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
    }
}

public class LinkedList {
    Node head;

    public String toString() {
        if (head == null)
            return null;
        Node current = head;
        StringBuffer sb = new StringBuffer();
        while (current != null) {
            sb.append(current.data + " -> ");
            current = current.next;
        }

        return sb.toString();
    }

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int value) {
        if (head == null)
            return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next;
            }
            current = current.next;
        }
    }

    public void insertAtIndex(int index, int data) {
        if (index == 0) {
            prepend(data);
            return;
        }
        int count = 1;
        Node current = head;
        while (current.next != null) {
            if (count == index)
                break;
            current = current.next;
            count++;
        }

        if (current == head || current.next == null) {
            append(data);
            return;
        }

        Node newNode = new Node(data);
        Node next = current.next;

        current.next = newNode;
        newNode.next = next;
    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            head = head.next;
            return;
        }

        int count = 1;
        Node current = head;
        while(current.next != null){
            if(count == index){
                break;
            }
            count++;
            current = current.next;
        }

        if(current.next != null){
            current.next = current.next.next;
        }
    }
}