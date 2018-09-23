import java.util.*;
public class Rotate90anticlockwise {
	public static void main(String args[]) {
		//
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		display(arr);

		int m = arr.length;
		int n = arr[0].length;
		Scanner s = new Scanner(System.in);
		s.hasNextInt()
		
		
	}
	
	private static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	
}
