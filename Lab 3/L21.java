import java.util.Scanner;

public class L21 {
    public static void main(String[] args) {
        int matrix1[][] = new int[3][2];
        int matrix2[][] = new int[2][3];
        int resultMatrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of the first matrix (3x2):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter the element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix (2x3):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter the element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        sc.close();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int sum = 0;
                for (int k = 0; k < 2; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                resultMatrix[i][j] = sum;
            }
        }

        System.out.println("Sum of two Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
