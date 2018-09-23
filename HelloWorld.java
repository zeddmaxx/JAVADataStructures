import java.util.Scanner;
import java.lang.Math;

public class HelloWorld {
	public static void main(String args[]) {

		// prime or not?!

		/*
		 * Scanner s = new Scanner(System.in);
		 * 
		 * int n = s.nextInt(); int f=1; for(int i=2; i<=Math.sqrt(n) && f==1; i++) {
		 * if(n%i==0) { System.out.println("Not Prime!"); f=0; } } if(f==1) {
		 * System.out.println("Prime!"); }
		 */

		// All Primes

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int f=1;
		if (n >= 2) {
			System.out.print(2 + " ");
		}
		for (int i = 3; i <= n; i++) {
			
			for(int j=2;j<=Math.sqrt(i);j++) {
				
				if(i%j==0) {
					f=0;
				}
			}
			if(f==1)
				System.out.print(i +" ");
			f=1;
		}
	}
}
