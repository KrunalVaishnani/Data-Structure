import java.util.*;

public class L13{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];

		System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

		boolean isDuplicate=false;

		for(int j=0; j<arr.length; j++){
			for(int k=j+1; k<arr.length; k++){

					if(arr[j]==arr[k]){
						isDuplicate=true;
						break;
					}
			}
			if(isDuplicate==true){
				break;
			}
		}
		if(isDuplicate){
			System.out.println("Contains Duplicate");
		}
		else{
			System.out.println("No Duplicate Contains");	
		}
	}
}