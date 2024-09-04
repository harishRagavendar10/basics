package ds;
import java.util.*;
public class reverse_number {
	public static void main(String[] args) {
		int number;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		number=sc.nextInt();
		while(number>0) {
			System.out.print(number%10);
			number/=10;
			
		}
		sc.close();
				
	}
}
