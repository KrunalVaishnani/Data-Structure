public class DoublyList{
    Node head;

    class Node{
        int data;
        Node next;
        Node previous;

        Node(int data){
            this.data=data;
        }
    }

    public void addFirst(int data){
        Node newNode=new Node(data);

        newNode.next=head;
        newNode.previous=null;
        if(head!=null){
            newNode.previous=newNode;
        }
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        Node last=head;
        newNode.next=null; 
        if(head==null){
            newNode.previous=null;
            head=newNode;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }

        last.next=newNode;
        newNode.previous=last;
    }

    public void deleteFirst(){
        
    }

    public void display(){
        Node newNode=head;
        while(newNode!=null){
            System.out.print(newNode.data+" - ");
            newNode=newNode.next;
        }
        System.out.println("END");
    }



    public static void main(String[] args){
        DoublyList dl=new DoublyList();
        dl.addFirst(1);
        dl.addLast(2);
        dl.display();
    }
}