package strings;

import java.util.ArrayList;

public class BoardPath2 {

	public static void main(String args[]) {

		ArrayList<String> s = new ArrayList<>();
		s = allPathsonBoard(0, 0, 2, 2);
		System.out.println(s);
	}

	public static ArrayList<String> allPathsonBoard(int sr, int sc, int dr, int dc) {

		if (sr == dr && sc == dc) {
			ArrayList<String> b = new ArrayList<>();
			b.add("\n");
			return b;
		}

		ArrayList<String> res = new ArrayList<>();

		if (sc < dc) {
			ArrayList<String> intresult1 = allPathsonBoard(sr, sc + 1, dr, dc);
			for (String var : intresult1) {
				String x = 'H' + var;
				res.add(x);

			}
		}

		if (sr < dr) {
			ArrayList<String> intresult2 = allPathsonBoard(sr + 1, sc, dr, dc);
			for (String var : intresult2) {
				String x = 'V' + var;
				res.add(x);

			}

		}
		return res;

	}

}
