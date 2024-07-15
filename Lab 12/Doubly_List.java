public class Doubly_List{
    
static class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

static class Doubly {
    Node head;
    Node last;

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;

        if (head != null) {
            head.prev = newNode;
        }
        head=newNode;         
    }
    
    public void display(){
        Node newNode = head;
        Node last = null;
        while(newNode != null){
            System.out.print(newNode.data + " -> ");
            last = newNode;
            newNode = newNode.next;
        }
        System.out.println("END");

        // System.out.println("print in reverse");
        // while(last != null){
        //     System.out.print(last.data + " -> ");
        //     last = last.prev;
        // }
        // System.out.println("START");
    }

    public void insertLast(int data){
        Node newNode = new Node(data);
        Node last = head;

        newNode.next = null;
        if(head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }
        while(last.next != null){
            last = last.next; 
        }
        last.next = newNode;
        newNode.prev = last;
    }
    
    public Node find(int data){
        Node newNode = head;
        while(newNode != null){
            if(newNode.data == data){
                return newNode;
            }
            newNode = newNode.next;
        }
        return null;
    }

    public void insertAtPosition(int after , int data){
        Node newNode = new Node(data);
        Node p = find(after);

        if(p==null){
            System.out.println("does not exist");
            return;
        }
        newNode.next = p.next;
        p.next = newNode;
        newNode.prev = p;
        if(newNode.next != null){
            newNode.next.prev = newNode;
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
}
    public static void main(String[] args){
        Doubly d = new Doubly();
        d.insertFirst(1);
        d.insertFirst(2);
        d.insertFirst(3);
        d.insertLast(4);
        d.insertAtPosition(2,4);
        d.deleteAtPosition(2);
        
        d.display();    
    }
}