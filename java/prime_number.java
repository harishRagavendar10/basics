package ds;
import java.util.*;
public class prime_number {

	public static void main(String[] args) {
		int prime,i,flag=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		prime=sc.nextInt();
		int number=prime/2;
		for(i=2;i<=number;i++) {
			if(prime%i==0) {
				flag=0;
			}
		}
		if(flag==1) {
			System.out.print("prime");
		}
		else {
			System.out.println("not prime");
		}
		

	}

}
