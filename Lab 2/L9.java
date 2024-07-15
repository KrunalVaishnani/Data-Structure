import java.util.Scanner;

public class L9{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Length of array : ");
		int len = s.nextInt();
		
		Array ar = new Array();
		ar.result(len);
	}
}

class Array{
	int i;
	public void result(int len){
		Scanner s = new Scanner(System.in);
		int a[] = new int[len];

		for(i=0;i<len;i++){
			a[i]=s.nextInt();
			
		}
		for(i=0;i<len;i++){
			System.out.println(a[i]);
		}
	}
}