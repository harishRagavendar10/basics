package ds;
import java.util.*;
public class one_to_n_even {
	public static void main(String[] args) {
		int num,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		for(i=2;i<=num;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}
	
}
