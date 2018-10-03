
public class AnyBase2AnyBase {
	public static void main(String args[]) {
		
		int num = 89;
		int dbase = 2;
		System.out.println(decimal2anybase(num, dbase));
	}
	
	public static int decimal2anybase(int num, int dbase) {
		
		int dn =0;
		int power = 1;
		while(num!=0) {
			int rem = num%dbase;
			num = num/dbase;
			dn += rem*power;
			power *= 10;
		}
		
		return dn;
	}
	
	public static int anybase2decimal(int num, int sbase ) {
		int dn= 0;
		int pow = 1;
		
		while(num!=0) {
		
			int rem = num%10;
			num = num/10;
			
			dn += rem*pow;
			pow = pow*sbase;
			
		}
		return dn;
	}
}
