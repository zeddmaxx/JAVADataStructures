package CodeChef;

import java.util.Scanner;

public class colorGrid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			t--;
			String[] str = s.nextLine().split(" ");
			int n = str[0].charAt(0)-'0';
			int m = str[1].charAt(0)-'0';
			char[][] board = new char[n][m];
			boolean[][] asf = new boolean[n][m];
			for (int i = 0; i < 10; i++) {
				board[i] = s.nextLine().toCharArray();
			}
			if(solve(board, 1, asf))
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}
	
	public static boolean solve(char[][] board, boolean[][] asf) {
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				if(!check(board, i,j, asf))
					return false;
			}
		}
		return true;
	}
	
	public static boolean check(char[][] board, int r, int c, boolean[][] asf) {
		for(int i=0;i<2&&r+i<board.length;i++) {
			for(int j=0;j<2&&c+j<board[0].length;j++) {
				if(asf[i][j]==true)
					return 
				if(board[r+i][c+j]=='.')
			}
		}
	}
	
	
	public static boolean solve(char[][] board, int bn, boolean[][] asf) {
		if(bn==board.length*board[0].length+1) {
			if(isBoardColor(asf, board))
				return true;
			else
				return false;
		}
		int r = (bn - 1) / board.length;
		int c = (bn - 1) % board.length;
		
		return true;
	}
	
	public static boolean isBoardColor(boolean[][] asf, char[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0; j<board[0].length;j++) {
				if(board[i][j] == '.' && asf[i][j]!=true)
					return false;
				else if(board[i][j] == '#' && asf[i][j]!=false)
					return false;
			}
		}
		return true;
	}

}
