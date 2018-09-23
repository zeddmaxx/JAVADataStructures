
public class Patterns {
	public static void main(String args[]) {
		
		// Diamond Pattern!
		
		int row = 5;
		int s = row-1, t=1;
		
		for(int i=0; i<row; i++) {
			
			for(int a=0;a<s;a++) {
				System.out.print(" ");
			}
			
			for(int b=0;b<t;b++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			if(i<row/2) {
				s--;
				t += 2;
			}
			else {
				s++;
				t -= 2;
			}
			
		}
		
		
	}
}
