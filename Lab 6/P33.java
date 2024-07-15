import java.util.Scanner;
import java.util.Stack;
public class P33 
{
   
    public static String infixToPostfix(String infixExpression) 
    {
        String postfix = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infixExpression.length(); i++) 
        {
            char c = infixExpression.charAt(i);    
            if (Character.isLetterOrDigit(c)) 
            {
                postfix += c;
            }
            else if (c == '(') 
            {
                stack.push(c);
            }
            else if (c == ')') 
            {
                while (!stack.isEmpty() && stack.peek() != '(') 
                {
                    postfix += stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() != '(') 
                {
                    return "Invalid Expression";
                }
                stack.pop(); 
            } 
            else 
            {
                while (!stack.isEmpty() && iprecedence(c) <= sprecedence(stack.peek())) 
                {
                    postfix += stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) 
        {
            if (stack.peek() == '(') 
            {
                return "Invalid Expression";
            }
            postfix += stack.pop();
        }

        return postfix;
    }

    public static int iprecedence(char operator) 
    {
        switch (operator) 
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 3;
            case '^':
                return 6;
            case '(':
                return 9;
            case ')':
                return 0;
            default:
                return 7;
        }
       // return -1;
    }

    public static int sprecedence(char operator) 
    {
        switch (operator) {
            case '+':
            case '-':
                return 2;
            case '*':
            case '/':
                return 4;
            case '^':
                return 5;
            case '(':
                return 0;
            default:
                return 8;
        }
        //return -1;
    }

    public static void main(String[] args) 
    {
        Scanner jt=new Scanner(System.in);
        System.out.print("Enter the Infix String : ");
        String infixExpression = jt.next();
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
    }
}
