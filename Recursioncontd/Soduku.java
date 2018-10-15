package Recursioncontd;

public class Soduku {

	public static void main(String[] args) {

		int[][] arr = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

		solveSoduku(arr, 1);
		//display(arr);
		System.out.println();
		int[] rb = {0,0,0,0,0,0,0,0,0};
		int[] cb = {0,0,0,0,0,0,0,0,0};
		int[] sb = {0,0,0,0,0,0,0,0,0};
		
		//solveSoduku2(arr, 1, rb, cb, sb);

	}

	public static void solveSoduku(int[][] arr, int co) {
		// base case
		if (co == 82) {
			display(arr);
			return;
		}

		int r = (co - 1) / arr.length;
		int c = (co - 1) % arr.length;
		if (arr[r][c] == 0) {
			for (int i = 1; i <= 9; i++) {
				if (isValid(arr, r, c, i)) {
					arr[r][c] = i;
					solveSoduku(arr, co + 1);
					arr[r][c] = 0;
				}
			}
		} else {
			solveSoduku(arr, co + 1);
		}
	}

	public static boolean isValid(int[][] arr, int r, int c, int num) {
		// check row
		for (int i = 0; i < 9; i++) {
			if (arr[r][i] == num) {
				return false;
			}
		}
		// check columns
		for (int i = 0; i < 9; i++) {
			if (arr[i][c] == num) {
				return false;
			}
		}
		// check sub matrix
		int x = r - r % 3;
		int y = c - c % 3;
		for (int i = x; i < x + 3; i++) {
			for (int j = y; j < y + 3; j++) {
				if (arr[i][j] == num)
					return false;
			}
		}

		return true;

	}

	public static void solveSoduku2(int[][] arr, int co, int[] rb, int[] cb, int[] sb) {
		// base case
		if (co == 82) {
			display(arr);
			return;
		}

		int r = (co - 1) / arr.length;
		int c = (co - 1) % arr.length;
		if (arr[r][c] == 0) {
			for (int i = 1; i <= 9; i++) {
				if (isValid(arr, r, c, i)) {
					arr[r][c] = i;
					solveSoduku2(arr, co + 1, rb, cb, sb);
					arr[r][c] = 0;
				}
			}
		} else {
			solveSoduku2(arr, co + 1, rb, cb, sb);
		}
	}

	public static void display(int[][] arr) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
