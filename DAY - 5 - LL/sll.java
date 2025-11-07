import java.util.*;
public class sll
{
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    class MyLinkedList
    {
        Node head = null; // Reference to the first node
        Node tail = null; // Reference to the last node

    public MyLinkedList() {
        this.head = null; // Empty list initially
        this.tail = null; // Empty list initially
    }

    // Method to add a new node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Method to display the linked list elements
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to insert a node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
    }

    // Method to delete a node with a specific data value
    public void delete(int data) {
        if (head == null) {
            return; // List is empty
        }

        if (head.data == data) {
            head = head.next; // Delete head node
            if (head == null) {
                tail = null;
            }
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            if (current.next == tail) {
                tail = current;
            }
            current.next = current.next.next; // Delete the node
        }
    }

    // Method to delete from head
    public void deleteFirst() {
        if (head == null) {
            return; // List is empty
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    // Method to delete from tail
    public void deleteLast() {
        if (head == null) {
            return; // List is empty
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }
        current.next = null;
        tail = current;
    }
}
    public static void main(String[] args)
    {
        MyLinkedList list = new sll().new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.display(); // Should print: 1 -> 2 -> 3 -> null

        list.addFirst(0);
        list.display(); // Should print: 0 -> 1 -> 2 -> 3 -> null

        list.add(4); // Add to tail
        list.display(); // Should print: 0 -> 1 -> 2 -> 3 -> 4 -> null

        list.deleteFirst(); // Delete from head
        list.display(); // Should print: 1 -> 2 -> 3 -> 4 -> null

        list.deleteLast(); // Delete from tail
        list.display(); // Should print: 1 -> 2 -> 3 -> null

        list.delete(2);
        list.display(); // Should print: 1 -> 3 -> null

        list.delete(0);
        list.display(); // Should print: 1 -> 3 -> null
    }
}

    