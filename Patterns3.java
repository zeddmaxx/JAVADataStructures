
public class Patterns3 {
	public static void main(String args[]) {
		int n = 4;
		int c = 1;
		//int count = 1;
		int s = n / 2 + 1;
		int f = 1;
		for (int i = 0; i < n; i++) {
				c = i+1;
			for (int a = 0; a <s; a++) {
				System.out.print("  ");
			}

			for (int b = 1; b<=f; b++) {
				
				System.out.print(c + " ");
				if(b<=f/2) c++;
				else c--;
			}

			System.out.println();

			s--;
			
			f+=2;

		}
	}
}
