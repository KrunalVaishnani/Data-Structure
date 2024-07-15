
public class Circular_List {
    
static class Node {
    int data;
    Node next;
    Node tail;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

static class CircularLinkedList {
    Node head;

    public void insertAtFront(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }

        head = newNode;
    }

    // public void addFront(int data){
    //      Node newNode = new Node(data);

    //      if(tail==null){
    //         tail=newNode;
    //         tail.next=tail;
    //         return tail;
    //      }
    //      newNode.next=tail.next;
    //      tail.next=newNode;
    //      return tail;
    // }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head, prev = null;
        int count = 1;
        while (count < position && current.next != head) {
            prev = current;
            current = current.next;
            count++;
        }

        if (count < position) {
            System.out.println("Position out of bounds");
            return;
        }

        if (prev == null) {
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            head = head.next;
            last.next = head;
        } else {
            prev.next = current.next;
        }
    }


    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("Head");
    }
}
    public static void main(String[] args) {
        CircularLinkedList cl = new CircularLinkedList();
       
        // cl.addFront(1);
        // cl.addFront(1);
        //cl.addFront(1);
        cl.insertAtFront(242);
        cl.insertAtEnd(1);
        cl.insertAtEnd(2);
        cl.insertAtEnd(3);
        cl.insertAtEnd(4);
        cl.insertAtEnd(5);
        cl.insertAtEnd(6);
        cl.insertAtEnd(7);

        // cl.insertAtEnd(4);
        // cl.insertAtEnd(5);
        // cl.insertAtEnd(6);
        // cl.insertAtEnd(7);
        cl.deleteAtPosition(2);
        cl.deleteAtPosition(4);
        cl.deleteAtPosition(6);
        cl.display();
    }
}
