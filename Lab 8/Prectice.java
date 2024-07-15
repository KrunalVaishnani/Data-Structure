import java.util.*;
public class Prectice{

	static class Queue{
		static int n;
		static int arr[];
		static int r=-1;
		static int f;
		Queue(int n){
            arr=new int[n];
            this.n=n;
        }

        public static boolean isEmpty(){
            return r==-1;
        }

        public static void enqueue(int a){
        	if(r>=n){
        		System.out.println("Queue Overflow");
        		return;
        	}
        	r++;
        	arr[r]=a;
        }

        public static int dequeue(){
            if(f==0){
                System.out.println("Queue Underflow");
                return -1;
            }
            int f=arr[0];
            for(int i=0;i<r;i++){
                arr[i]=arr[i+1];
            }
            r--;
            f=f+1;
            return f;

		}

		// public static int peep(){
        //     if(f==0){
        //         System.out.println("Queue Underflow");
        //         return -1;
        //     }
        //     return arr[0];
        // }
}
	public static void main(String[] args){
		Queue q=new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
	}
}