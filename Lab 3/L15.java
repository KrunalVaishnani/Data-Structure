import java.util.*;

public class L15{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n+1];

        int i=0;

        System.out.println("Enter elements:");
        for (i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

         System.out.print("Enter Location: ");
         int x=sc.nextInt();
         System.out.print("Enter a new element: ");
         int y=sc.nextInt();
         
         for(i=arr.length-1;i>x;i--){
                arr[i]=arr[i-1];
            }
     
         for (i=0;i<arr.length-1;i++) {
            if(i==x){
                arr[i]=y;
            }
        }   
        for (i = 0; i <=n; i++){
            System.out.println(arr[i]+", ");
        }
      
    }
}