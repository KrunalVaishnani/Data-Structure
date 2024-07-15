import java.util.Scanner;

public class L2{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Number : ");
		int a = s.nextInt();
		EvenOrOdd obj = new EvenOrOdd();
		obj.eo(a);
	}
}

class EvenOrOdd{
	public void eo(int a){
		if(a%2==0){
			System.out.println("Number is Even.");
		}
		else{
			System.out.println("Number is Odd.");
		}
	}
}