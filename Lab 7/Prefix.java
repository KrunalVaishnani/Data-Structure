import java.util.Scanner;
import java.util.Stack;

public class Prefix 
{
    public static int evaluatePrefix(String prefixExpression) 
    {
        Stack<Integer> stack = new Stack<>();

        for (int i = prefixExpression.length() - 1; i >= 0; i--) 
        {
            char c = prefixExpression.charAt(i);
            if (Character.isDigit(c)) 
            {
                stack.push(Character.getNumericValue(c));
            }
            else 
            {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                int result = performOperation(c, operand1, operand2);
                stack.push(result);
            }
        } 
        return stack.pop();
    }
    public static int performOperation(char operator, int operand1, int operand2) 
    {
        switch (operator) 
        {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            case '%':
                return operand1 % operand2;
            case '^':
            case '$':
                return (int) Math.pow(operand1, operand2);
        }
        return 0;
    }
    public static void main(String[] args) 
    {
        Scanner jt=new Scanner(System.in);
        System.out.print("Enter The Pretfix Expression : ");
        String prefixExpression = jt.next();
        int result = evaluatePrefix(prefixExpression);
        System.out.println("Prefix Expression: " + prefixExpression);
        System.out.println("Result: " + result);
    }
}
