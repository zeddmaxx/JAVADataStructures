package CodeChef;

import java.util.Scanner;

public class avgDist {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] k = s.nextLine().toCharArray();
		int t = k[0]-'0';
;		while(t>0) {
			t--;
			char[] a = new char[2];
			a = s.nextLine().toCharArray();
			int n = a[0]-'0';
			int m = a[1]-'0';
			System.out.println(m);
			char[][] board = new char[n][m];
			for (int i = 0; i < n; i++) {
				board[i] = s.nextLine().toCharArray();
				System.out.println(board[i]);
			}
		
		}

	}
	
	public static void display(char[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}

}
