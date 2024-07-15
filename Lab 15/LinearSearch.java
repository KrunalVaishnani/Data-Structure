import java.util.*;

public class LinearSearch {

    public static int linearSearch(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
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

        int index = linearSearch(a, key);
        if (index == -1) {
            System.out.println("Key Not Found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}
