import java.util.Scanner;

public class L10{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter m : ");
		int m = s.nextInt();

		System.out.print("Enter n : ");
		int n = s.nextInt();
		
		Array ar = new Array();
		ar.result(m,n);
	}
}

class Array{
	
	public void result(int m, int n){
		int sum=0;
		for(int i=m;i<=n;i++){
			sum = sum+i;
		}

		System.out.println("Sum = "+sum);

	}
}