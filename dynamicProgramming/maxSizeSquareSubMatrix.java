package dynamicProgramming;

public class maxSizeSquareSubMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void maxsm(int[][] mat) {
		int[][] strg = new int[mat.length][mat[0].length];
		int dr = strg.length - 1;
		int dc = strg[0].length - 1;

		for (int r = dr; r >= 0; r--) {
			for (int c = dc; c >= 0; c--) {
				int x = r + 1;
				int y = c + 1;

				if (r == dr && c == dc) {
					strg[r][c] = mat[r][c];
				} else if (r == dr) {
					strg[r][c] = mat[r][c];
				} else if (dc == c) {
					strg[r][c] = mat[r][c];
				} else {
					if(mat[r][c]==0)
							strg[r][c] = 0;
					strg[r][c] = 1 + Math.min(mat[x][y], Math.min(mat[r][c+1], mat[r+1][c]));
				}
			}
		}

	}

}
