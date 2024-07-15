import java.util.Scanner;

public class L22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        System.out.println("Before swapping:");
        System.out.println("First number: " + number1);
        System.out.println("Second number: " + number2);

        swapNumbers(number1,number2);

     sc.close();
    }

    public static void swapNumbers(int number1, int number2) {
        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("After swapping:");
        System.out.println("First number: " + number1);
        System.out.println("Second number: " + number2);
    }
}
