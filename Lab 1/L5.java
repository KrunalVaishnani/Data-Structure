import java.util.Scanner;

public class L5{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number : ");	
		int n = s.nextInt();
		Factorial f = new Factorial();
		//int result=f.fact(n);
		System.out.println(f.fact(n));
	}
}

class Factorial{
	public int fact(int n){
		int ans=1;
		if(n==0){
			return 1;
		}
		else{
			return n*fact(n-1);
		}
	}
}