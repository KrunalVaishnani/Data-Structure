import java.util.Scanner;

public class L8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i=1,count=0;
        while(i<=n){
        	if(n%i==0){
        		count++;
        	}
        	i++;
        }
        if(count==2){
        	System.out.println("number is prime");
        }
        else{
        	System.out.println("number is not prime");
        }
    }
}
