 import java.util.*;

 public class CQ_Insert_Delete{ 

        static class Queue{
            static int arr[];
            static int rear=-1;
            static int front=-1;
            static int size;

            Queue(int n){
                arr=new int[n];
                this.size=n;
            }

            public static boolean isEmpty(){
                return rear==-1 || front==-1;
            }

            public static boolean isFull(){
                return (rear+1) % size == front;
            }

            public void enqueue(int data){
                if(isFull()){
                    System.out.println("queue overflow");
                    return;
                }

                if(front==-1){
                    front=0;
                }

                rear = (rear+1) % size;
                arr[rear]=data;
            }

            public int dequeue(){
                if(isEmpty()){
                    System.out.println("Queue underflow");
                    rear = -1;
                    front=-1;
                    return -1;
                }
                int result=arr[front];
                if(rear==front){
                    rear=front=-1;
                }
                else{
                    front=(front+1)%size;
                }
                return result;
                // for(int i=front;i<rear;i++){
                //     System.out.println(q.dequeue());
                // }   
            }

            public static int peep(){
                if(isEmpty()){
                    System.out.println("Queue underflow");
                    return -1;
                }
                return arr[front];
            }
        }
         public static void main(String[] args){
            Queue q=new Queue(5);
            q.enqueue(1);
            q.enqueue(2);
            //int a=q.dequeue();
            q.enqueue(3);
            //System.out.println(a);
            // q.enqueue(4);
            // q.enqueue(5);
            int b;
             while(!q.isEmpty()){
                b= q.dequeue();
                System.out.println(b);
            }
        }
}