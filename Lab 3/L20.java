import java.util.*;
public class L20 {
    public static void main(String[] args) {
        int matrix1[][] = new int[2][2];
        int matrix2[][] = new int[2][2];
        int resultMatrix[][] = new int[2][2];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter the element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter the element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("sum of two matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
       }
     }