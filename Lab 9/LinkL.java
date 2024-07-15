public class LinkL{
    Node head;
    //Node curreNode=head;

    class Node{
        String data;
        Node next;
        
     
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }

    
    public void addLast(String data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        
        Node curreNode=head;
        while(curreNode.next!=null){
            curreNode=curreNode.next;
        }
        curreNode.next=newNode;
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }

    public void deleteLast(){
        Node preNode=head;
        Node lastNode=head.next;
         if(head==null){
            System.out.println("List is empty");
            return;
         }
         while(lastNode.next!=null){
            lastNode=lastNode.next;
            preNode=preNode.next;
         }
         preNode.next=null;    
    }

    public void insertAtPosition(String data, int position) {
        Node newNode = new Node(data);
        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Invalid position.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void print(){
        Node curreNode=head;

        if(head==null){
            System.out.println("List is empty");
            return;
        }
        while(curreNode!=null){
                System.out.print(curreNode.data+" - ");
                curreNode=curreNode.next;   
            }
        System.out.println("Null");
    }

    public static void main(String[] args){
        LinkL list=new LinkL();
        list.addFirst("A");
        list.addLast("B");
        //list.deleteFirst();
        //list.deleteLast();
        list.insertAtPosition("C",2);
        list.print();

    }
}