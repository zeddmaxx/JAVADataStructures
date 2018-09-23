
public class Rotate90 {
	public static void main(String args[]) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		display(arr);

		int m = arr.length;
		int n = arr[0].length;
		// Transpose
		int t = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j<i; j++) {
				t = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = t;
			}
		}

		 //display(arr);

		// Reverse each row
		for (int i = 0; i < m; i++) {
			rev(arr[i]);
		}
		System.out.println("After 90 degree rotation : ");

		display(arr);

	}

	private static void rev(int[] a) {
		int n = a.length - 1;
		for (int i = 0; i <= a.length / 2; i++) {
			int t = a[i];
			a[i] = a[n - i];
			a[n - i] = t;
		}
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
