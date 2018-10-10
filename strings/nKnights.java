package strings;

public class nKnights {

	public static void main(String[] args) {
		nKnights(new boolean[3][3], 3, 0, 1, "");

	}

	static int counter = 0;

	public static void nKnights(boolean[][] boxes, int tk, int ck, int cb, String asf) {
		if (ck == tk) {
			if (IsBoardSafe(boxes))
				counter++;
			System.out.println(counter + ". " + asf);
			return;
		}

		if (cb >= (boxes.length * boxes.length + 1)) {
			return;
		}
		nKnights(boxes, tk, ck, cb + 1, asf);

		int r = (cb - 1) / boxes.length;
		int c = (cb - 1) % boxes.length;

		if (boxes[r][c] != true) {

			boxes[r][c] = true;
			nKnights(boxes, tk, ck + 1, cb + 1, asf + cb + "-");
			boxes[r][c] = false;
		}
	}

	public static boolean IsBoardSafe(boolean[][] mat) {

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j] == true)
					if (!IsKSafe(mat, i, j)) {
						return false;
					}
			}
		}
		return true;
	}

	public static boolean IsKSafe(boolean[][] mat, int r, int c) {

		int[][] dirs = { { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -1, -2 }, { -2, -1 } };

		for (int rad = 1; rad < mat.length; rad++) {
			for (int[] dir : dirs) {
				int r1 = r + rad * dir[0];
				int c1 = c + rad * dir[1];

				if (r1 >= 0 && r1 < mat.length && c1 >= 0 && c1 < mat.length && mat[r1][c1] == true)
					return false;
			}
		}
		return true;

	}

}
