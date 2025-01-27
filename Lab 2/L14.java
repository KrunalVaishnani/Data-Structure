import java.util.Scanner;

public class L14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (numbers[i] == firstNumber) {
                numbers[i] = secondNumber;
                index = i;
                break;
            }
        }

        System.out.println("Index: " + index);
        System.out.println("Final Array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        sc.close();
    }
}
