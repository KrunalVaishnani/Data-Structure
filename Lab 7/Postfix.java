import java.util.*;

public class Postfix{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Stack<Integer> s=new Stack<>();

		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(Character.isDigit(c)){
				s.push(c-'0');
			}
			else{
				int a=s.pop();
				int b=s.pop();
				switch(c){
				case '+' : s.push(b+a);
							break;

				case '-' : s.push(b-a);
							break;

				case '*' : s.push(b*a);
							break;

				case '/' : s.push(b/a);
							break;
				}
			}
		}
		System.out.println(s.pop());
	}
}