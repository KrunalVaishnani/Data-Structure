import java.util.*;
public class L18 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        int deleteNumber = 5;

        System.out.print("Original Array: ");
        printArray(array);

        int[] result = deleteNumber(array, deleteNumber);

        System.out.print("Updated Array: ");
        printArray(result);
    }

    public static int[] deleteNumber(int[] arr, int number) {
        int[] updatedArray = new int[arr.length - 1];
        int i = 0;
        int j = 0;

        while (i < arr.length) {
            if (arr[i] == number) {
                i++;
                continue;
            }

            updatedArray[j] = arr[i];
            i++;
            j++;
        }

        return updatedArray;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
