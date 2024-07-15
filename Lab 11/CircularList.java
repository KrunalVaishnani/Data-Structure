public class CircularList{

    Node head;
    Node last;

    CircularList(){
        this.head=null;
        this.last=null;
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    
    public void insert(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            last=newNode;
            return;
        }
        last.next=newNode;
        newNode.next=head;
        last=newNode;
    }

    public void display(){
    Node newNode=head;
    if(head!=null){
        do{
            System.out.print(newNode.data+" - ");
            newNode=newNode.next;
        }while(newNode!=head);
    }
    System.out.println("head");         
    }

    public void delete(int data){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node newNode=head;
        if(newNode==null){
            return;
        }
        if(newNode.data==data){
            head=head.next;
            last.next=head;
            return;
        }
        do{
            Node n=newNode.next;
            if(n.data==data){
                newNode.next=n.next;
                break;
            }
            newNode=newNode.next;
        }while(newNode!=head);
    }

    public void delete1(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node currNode = head;
        Node preNode = null;

        while (currNode.data != data) {
            if (currNode.next == head) {
                System.out.println("Node with key " + data + " not found.");
                return;
            }
            preNode = currNode;
            currNode = currNode.next;
        }
        if (currNode.next == head && preNode == null) {
            head = null;
            return;
        }
        if (currNode == head) {
            Node savNode = head;
            while (savNode.next != head) {
                savNode = savNode.next;
            }
            head = head.next;
            savNode.next = head;
        } else {
            preNode.next = currNode.next;
        }
    }

    public static void main(String[] args){
        CircularList cl=new CircularList();
        cl.insert(1);
        cl.insert(2);
        cl.insert(3);
        cl.delete(3);
        cl.delete1(2);
        cl.display();
    }
} 