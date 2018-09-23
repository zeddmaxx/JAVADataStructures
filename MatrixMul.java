
public class MatrixMul {
	public static void main(String args[]) {

		int[][] mat1 = { { 10, 0, 20, 0 }, { 0, 0, 5, 10 }, { 1, 1, 1, 1 } };

		int[][] mat2 = { { 10, 0, 20, 0 }, { 0, 0, 5, 10 }, { 1, 1, 1, 1 }, {1,2,3,4} };
		matrixmul(mat1, mat2);
		//display(mat1);

	}

	private static void matrixmul(int[][] mat1, int[][] mat2) {

		int r1 = 0;
		int c1 = 0;
		int c2 = 0;
		int r2 = 0;

		r1 = mat1.length;
		r2 = mat2.length;
		c1 = mat1[0].length;
		c2 = mat2[0].length;
		// int d =0;
		int[][] mat3 = new int[r1][c2];

		if (c1 != r2)
			System.out.println("Matrices cannot be multiplied!! ");
		else {

			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c2; j++) {
					for (int k = 0; k < c1; k++) {
						mat3[i][j] += mat1[i][k] * mat2[k][j];
					}

				}

			}

		}
		display(mat3);
	}

	private static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
