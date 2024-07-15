import java.util.Scanner;
import java.util.Stack;
public class P36 
{ 
    public static int evaluatePostfix(String postfixExpression) 
    {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < postfixExpression.length(); i++) 
        {
            char c = postfixExpression.charAt(i);
            if (Character.isDigit(c)) 
            {
                stack.push(Character.getNumericValue(c));
            }   
            else 
            {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
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
        System.out.println("~~~Enter Expression which ans is not 0~~~ \n~~~Enter Expression Without ',' and space~~~ \n~~~Enter only Singal Digit Number~~~");
        System.out.print("Enter The Postfix Expression : ");
        String postfixExpression = jt.next();
        int result = evaluatePostfix(postfixExpression);
        if(result==0)
        {
            System.out.println("Bola tha na Ans 0 aaye esa mat kar le aa gya");
        }
        else
        {
            System.out.println("Postfix Expression: " + postfixExpression);    
        }
        
        System.out.println("Result: " + result);
    }
}
