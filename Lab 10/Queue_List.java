public class Queue_List{
public Node head;
     static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static class Queue{
       static Node head=null;
        static Node last=null;
    
    public static boolean isEmpty(){
        return head==null && last==null;
    }

    public static void add(int data){
        Node newNode=new Node(data);
        if(last==null){
            last=head=newNode;
            return;
        }
        last.next = newNode; 
        last=newNode;
    }

    public static int remove(){
        if(isEmpty()){
            System.out.println("empty Queue");
            return -1;
        }
        int front = head.data;
        if(head==last){
            last=null;
        }
        head=head.next;
        return front;
    }

    public static int peep(){
        if(isEmpty()){
            System.out.println("empty Queue");
            return -1;
        }
        return head.data;
    }
}
    public static void main(String[] args){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peep());
            q.remove();
        }
    }
}
