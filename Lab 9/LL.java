public class LL {
    Node head;
    private int count;
    LL(){
        this.count=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            count++;
        }
    }

        //add-first
        public void addFirst(String data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
            
        }

        //add-last
        public void addLast(String data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node currNode=head;
            while(currNode.next!=null){
                currNode=currNode.next;
            }
            currNode.next=newNode;
            
        }

        //print
        public void PrintList(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            Node currNode=head;
             while(currNode!=null){
                System.out.print(currNode.data+ " -> ");
                currNode=currNode.next;
            }
            System.out.println("NULL");
        }

        //delete-first
        public void deleteFirst(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            count--;
            head=head.next;
        }

        //delete-last
        public void deleteLast(){
             if(head==null){
                System.out.println("List is empty");
                return;
            }
            count--;
            if(head.next==null){
                head=null;
                return;
            }
            Node secondLast=head;
            Node lastNode=head.next;
            while(lastNode.next!=null){
                lastNode=lastNode.next;
                secondLast=secondLast.next;
            }
            secondLast.next=null;
        }

        //count
        public int getCount(){
            if (count==0){
                System.out.println("Count is :"+count);
                return count;
            }
            else{
            return count;
            }
        }
    public static void main(String[] args){
        LL list=new LL();
        list.addFirst("A");
        list.addLast("B");
        list.addLast("C");
        list.addLast("D");
        list.addLast("E");
        list.addLast("F");
        list.addLast("G");
        list.deleteFirst();
        list.deleteLast();
        list.PrintList();
        System.out.println(list.getCount());
        
    }
}
    
    
