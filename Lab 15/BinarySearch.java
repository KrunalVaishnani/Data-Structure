import java.util.*;

public class BinarySearch {

    public static int binarySearch(int a[], int key) {
        int start = 0, end = a.length-1;

        while(start<=end){
            int mid = (start + end)/2;

            if(a[mid]==key){
                return mid;
            }
            else if(a[mid]<key){
                start = mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array:");
        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter Key:");
        int key = sc.nextInt();

        int index = binarySearch(a, key);
        if (index == -1) {
            System.out.println("Key Not Found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}
