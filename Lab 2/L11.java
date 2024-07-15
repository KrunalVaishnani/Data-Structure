import java.util.Scanner;

public class L11{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter n : ");
		int n = s.nextInt();
		
		Array ar = new Array();
		ar.result(n);
	}
}

class Array{
	
	public void result(int n){
		int sum=0,avg;
		for(int i=0;i<=n;i++){
			sum = sum+i;
		}
		avg = sum/n;
		System.out.println("Avg = "+avg);

	}
}