
public class NumberPattern {
	public static void main(String args[]) {
		// Star Pattern

		int row = 4;
		int s = 2 * row - 3, t = 1;

		for (int i = 0; i < row; i++) {

			for (int c = 0; c < t; c++) {
				System.out.print("*");
			}

			for (int d = 0; d < s; d++) {
				System.out.print(" ");
			}

			for (int c = 0; c < t; c++) {
				if (c == row - 1)
					break;
				System.out.print("*");
			}
			System.out.println();
			t++;
			s -= 2;
		}

	}
}
