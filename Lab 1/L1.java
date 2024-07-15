import java.util.Scanner;

public class L1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter Redius :");
		double r = s.nextDouble();
		AreaOfCircle a = new AreaOfCircle();
		a.Area(r);
	}
}

 class AreaOfCircle{
	public void Area(double r){
		double area;
		area = 3.14*r*r;
		System.out.println("Area : "+area);
	}
}