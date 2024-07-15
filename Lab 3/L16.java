import java.util.*;

public class L16 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int deleteIndex = 2;

        System.out.print("Original Array: ");
        printArray(array);

        int[] result = deleteNumber(array, deleteIndex);

        System.out.print("Updated Array: ");
        printArray(result);
    }

    public static int[] deleteNumber(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
            return arr;
        }

        int[] updatedArray = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }

            updatedArray[j] = arr[i];
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
