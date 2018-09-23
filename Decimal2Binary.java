
public class Decimal2Binary {
	public static void main(String args[]) {
		int n = 500;
		int d=0;
		int c=0;
		int pow =1;
		while(n>=1){
			d = n%2;
			
			c = c+ d*pow;
			n/=2;
			pow=pow*10;;
		}
		
		System.out.println(c);
	}
}
