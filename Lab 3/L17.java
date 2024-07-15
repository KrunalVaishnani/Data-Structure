import java.util.*;

public class L17{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter elements:");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Print Element:");
        for (int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("insert element:");
        int number=sc.nextInt();

        int[] newArray = new int[arr.length + 1];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < number) {
                newArray[index] = arr[i];
                index++;
            } else {
                newArray[index] = number;
                index++;
                break;
            }
        }
        while (index < newArray.length) {
            newArray[index] = arr[index - 1];
            index++;
        }

        System.out.print("Updated Array :");
        for (int i = 0; i <= arr.length; i++) {
            System.out.print(newArray[i]+" ");
        }
    }
}