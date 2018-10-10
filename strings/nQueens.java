package strings;

public class nQueens {

	public static void main(String[] args) {
		nQueens(new boolean[10][10], 10, 0, 1, "");

	}

	static int counter = 0;

	public static void nQueens(boolean[][] boxes, int tq, int cq, int cb, String asf) {

		if (cq == tq) {
			if (IsBoardSafe(boxes))
				System.out.println(asf + " " + ++counter);

			return;

		}

		if (cb >= (boxes.length * boxes.length + 1)) {
			return;
		}

		// System.out.println(cb);
		nQueens(boxes, tq, cq, cb + 1, asf);

		int r = (cb - 1) / boxes.length;
		int c = (cb - 1) % boxes.length;

		if (boxes[r][c] != true) {

			boxes[r][c] = true;
			nQueens(boxes, tq, cq + 1, cb + 1, asf  + cb + "-");
			boxes[r][c] = false;
		}

	}

	public static boolean IsBoardSafe(boolean[][] mat) {

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j] == true)
					if (!IsQueenSafe(mat, i, j)) {
						return false;
					}
			}
		}
		return true;
	}

	public static boolean IsQueenSafe(boolean[][] mat, int r, int c) {

		int[][] dirs = { { 0, -1 }, { 1, 1 }, { 0, 1 }, { -1, 1 }, { 1, -1 }, { 1, 0 }, { -1, -1 }, { -1, 0 } };

		for (int rad = 1; rad < mat.length; rad++) {
			for (int[] dir : dirs) {
				int r1 = r + rad * dir[0];
				int c1 = c + rad * dir[1];

				if (r1 >= 0 && r1 < mat.length && c1 >= 0 && c1 < mat.length && mat[r1][c1] == true)
					return false;
			}
		}

		/*
		 * check column for (int i = 0; i < mat.length; i++) { if (mat[i][c] == true &&
		 * i != r) return false; } // check row for (int i = 0; i < mat[0].length; i++)
		 * { if (mat[r][i] == true && i != c) return false; } // diagonal1 for (int i =
		 * r; i >=0 && c < mat[0].length; i++) { if (mat[i--][c++] == true) return
		 * false; } // diagonal2 for (int i = r; i < mat.length && c >= 0; i++) { if
		 * (mat[i][c--] == true) return false; }
		 * 
		 * for (int i = c; i < mat[0].length && r < mat.length; i++) { if (mat[r++][i]
		 * == true) return false; } for (int i = c; i < mat[0].length && r >= 0; i++) {
		 * if (mat[r--][i] == true) return false; }
		 */
		return true;

	}

}
