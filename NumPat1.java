
public class NumPat1 {
	public static void main(String args[]) {
		int i, j;
		int row = 4;
		int c = 0;
		int s = 2 * row - 3;

		for (j = 0; j < row; j++) {

			for (int a = 0; a <= j; a++) {
				c++;
				if(a==row-1)
					continue;
				System.out.print(c + " ");

			}

			c++;
			// spaces
			for (int b = 0; b < s; b++) {
				System.out.print("  ");
			}

			for (int k = 0; k <= j; k++) {

				//if (k == row - 1)
				//	continue;
				c--;
				System.out.print(c + " ");

			}
			c--;

			System.out.println();
			s -= 2;

		}
	}

}
