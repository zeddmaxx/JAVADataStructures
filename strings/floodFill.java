package strings;

public class floodFill {

	public static void main(String[] args) {

		int[][] arr = { { 0, 1, 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 1, 1, 1, 1, 0 }, { 0, 0, 0, 1, 1, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 1, 1 }, { 0, 1, 0, 1, 1, 0, 1, 1 }, { 0, 1, 0, 0, 0, 0, 0, 0 } };

		boolean[][] visited = new boolean[6][8];
		floodFill(arr, visited, 0, 0, "");
	}

	public static void floodFill(int[][] arr, boolean[][] visited, int sr, int sc, String asf) {

		if (sr == arr.length - 1 && sc == arr[0].length - 1) {
			System.out.println(asf);
			return;
		}

		if (isNotOkay(arr, visited, sr, sc)) {
			return;

		}
		visited[sr][sc] = true;

		floodFill(arr, visited, sr - 1, sc, asf + 't');
		floodFill(arr, visited, sr, sc + 1, asf + 'r');
		floodFill(arr, visited, sr + 1, sc, asf + 'd');
		floodFill(arr, visited, sr, sc - 1, asf + 'l');
		visited[sr][sc] = false;

	}

	public static boolean isNotOkay(int[][] arr, boolean[][] visited, int sr, int sc) {
		if (sc < 0 || sr < 0 || sc >= arr[0].length || sr >= arr.length)
			return true;
		else if (arr[sr][sc] == 1)
			return true;
		else if (visited[sr][sc] == true)
			return true;

		return false;
	}

}
