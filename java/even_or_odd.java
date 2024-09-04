package ds;
import java.util.Scanner;
public class even_or_odd {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();
		if(n%2==0) {
			System.out.print("even");
		}
		else {
			System.out.print("odd");
		}
		sc.close();
		
	}
		
}
