import java.util.*;

public class EnQueue_DeQueue{
    
    public static void main(String[] args){
        Queue q=new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        
        while(!q.isEmpty()){
            System.out.println(q.peep());
            q.dequeue();
        }
    }

    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        Queue(int n){
            arr=new int[n];
            this.size=n;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        //enqueue

        public static void enqueue(int data){
            if(rear==size-1){
                System.out.println("Queue Overflow");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        //dequeue

        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue Underflow");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        //peep

        public static int peep(){
            if(isEmpty()){
                System.out.println("Queue Underflow");
                return -1;
            }
            return arr[0];
        }
    }
}