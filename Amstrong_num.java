package ds;

import java.util.*;
public class Amstrong_num {
	public static void main(String[] args) {
		int number,mod,sum=0;
		Scanner sc =new Scanner(System.in);
		number=sc.nextInt();
		int len=String.valueOf(number).length();
		int temp=number;
		while(number>0) {
			
			mod=number%10;
			sum+=Math.pow(mod, len);
			number/=10;
		}
		if(sum==temp) {
			System.out.println("Amstrong");
		}
		else {
			System.out.println("Not amstrong");
		}
	}
}
