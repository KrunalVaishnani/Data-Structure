import java.util.Scanner;

public class L12{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Length of array : ");
		int len = s.nextInt();
		
		Array ar = new Array();
		int a[] = new int[len];
		ar.result(len,a);
	}
}

class Array{
	int i,index;
	public void result(int len, int a[]){
		Scanner s = new Scanner(System.in);
		
		for(i=0;i<len;i++){
			a[i]=s.nextInt();			
		}

		int small=a[0];

		for(i=0;i<len;i++){
			if(a[i]<small){
				small=a[i];
				index=i;
			}
		}

		System.out.println("Small Number : "+small);
		System.out.println("Small Number's index in array : "+index);
	}
}