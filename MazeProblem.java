
public class MazeProblem {

	public static void main(String args[]) {
		int[][] arr = { { 0, 0, 1, 0 }, 
						{ 1, 0, 0, 0 }, 
						{ 0, 0, 0, 0 }, 
						{ 1, 0, 1, 0 } 
					};
		
		// Find exit!!

		int d = 0;

		int m = arr.length;
		int n = arr[0].length;

		int i = 0, j = 0;
		while (i >= 0 && j >= 0 && i < m && j < n) {

			d = (d + arr[i][j]) % 4;

			if (d == 0)
				j++;
			else if (d == 1)
				i++;
			else if (d == 2)
				j--;
			else
				i--;

		}

		// To output positions :
		if (j == n)
			j--;
		else if (j < 0)
			j++;
		else if (i == m)
			i--;
		else if (i < 0)
			i++;

		System.out.println("Exit pos: " + i + ", " + j);

	}

	private static void display(int[][] a1) {
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1[0].length; j++) {
				System.out.print(a1[i][j] + " ");
			}
			System.out.println();
		}
	}

}
