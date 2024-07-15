import java.util.Scanner;

public class L8{
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("Enter Number : ");
		int n = s.nextInt();
		

	}
}

class PrimeOrNot{
	public void fec(int n){
		for(int i=1;i<=n;i++){
			if(n%i==0){
				System.out.println("Fector of given number:"+i);
			}
		}

	}
}