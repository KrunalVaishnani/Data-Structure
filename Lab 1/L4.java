import java.util.Scanner;

public class L4{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = s.nextInt();
		Factorial f = new Factorial();
		f.fact(n);
	}
}

class Factorial{
	public void fact(int n){
		int ans=1;
		for(int i=1;i<n;i++){
			ans = n*i;
		}
		System.out.println("Factorial is : "+ans);
	}
}