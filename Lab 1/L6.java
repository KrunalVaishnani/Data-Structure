import java.util.Scanner;

public class L6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int a = sc.nextInt();

        System.out.print("Enter the exponent: ");
        int b = sc.nextInt();

        int result = calculatePower(a, b);
        System.out.println("The result of " + a + " raised to the power of " + b + " is: " + result);
    }

    public static int calculatePower(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
