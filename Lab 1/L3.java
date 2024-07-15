import java.util.Scanner;

public class L3{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Char. :");
		char b = s.next().charAt(0);
		VowelOrNot vn = new VowelOrNot();
		vn.vowel(b);

	}
}

class VowelOrNot{
	public void vowel(char b){
		if(b=='a' || b=='e' || b=='i' || b=='o' || b=='u'){
			System.out.println("Character is vowel.");
		}
		else{
			System.out.println("Character is not vowel");
		}
	}
}