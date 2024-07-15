import java.util.*;

public class SelectionSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array:");
        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        //selection sort
        for(int i=0;i<a.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<a.length;j++){
                if(a[smallest] > a[j]){
                    smallest = j;
                }
            }
            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;
        }
        //print
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}