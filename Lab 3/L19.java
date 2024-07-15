import java.util.*;
public class L19 {
    public static void main(String[] args) {
        int[] array1 = {5, 2, 8, 1};
        int[] array2 = {7, 3, 6, 4};

        System.out.print("Array 1: ");
        printArray(array1);
        System.out.print("Array 2: ");
        printArray(array2);

        int[] result = mergeArrays(array1, array2);

        System.out.print("Merged Array: ");
        printArray(result);
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];

        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[index] = arr1[i];
            index++;
        }

        for (int i = 0; i < arr2.length; i++) {
            mergedArray[index] = arr2[i];
            index++;
        }

        return mergedArray;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
