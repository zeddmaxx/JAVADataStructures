package Recursioncontd;

public class Crossword {

	public static void main(String[] args) {
		char[][] arr = {{},{},{},{},{},{},{},{},{},{}};
		String[] words = {"AGRA","NORWAY", "ENGLAND", "GWALIOR"};
		crossword(arr, words, 1);
	}
	
	static boolean[] done = new boolean[4];
	
	public static void crossword(char[][] board, String[] words,int bno) {
		if(bno==101) {
			display(board);
			return;
		}
		int r = (bno - 1) / board.length;
		int c = (bno - 1) % board.length;
		
		
		for(int i=0; i<words.length; i++) {
			if(CanWePlaceVert(board, r,c, words[i])&&done[i]==false) {
				boolean[][] arr = Place(board, r, c, words[i]);
				done[i] = true;
				crossword(board, words, bno+1);
				Unplace(board, r, c, words[i], arr);
				done[i] = false;
			}
			else if(CanWePlaceHorizon(board, r,c, words[i])&&done[i]==false) {
				boolean[][] arr = Place(board, r, c, words[i]);
				done[i] = true;
				crossword(board, words, bno+1);
				Unplace(board, r, c, words[i],arr );
				done[i] = false;
			}
		}
			crossword(board, words, bno+1);
	}
	
	public static boolean CanWePlaceVert(char[][] board, int r, int c, String word) {
		int count = 0;
		int n = word.length();
		for(int i=c;i<10;i++) {
			if(board[i][c]!='+') {
				count++;
			}
		}
		if(count==n)
			return true;
		else
			return false;
			
		
	}
    public static boolean CanWePlaceHorizon(char[][] board, int r, int c, String word) {
    	int count = 0;
		int n = word.length();
		for(int i=r;i<10;i++) {
			if(board[r][i]!='+') {
				count++;
			}
		}
		if(count==n)
			return true;
		else
			return false;
		
	}
    
    public static boolean[][] Place(char[][] board, int r, int c, String word){
    	boolean[][] arr = new boolean[10][10];
		return null;
    	
    }
    public static boolean[][] Unplace(char[][] board, int r, int c, String word, boolean[][] arr){
		return null;
    	
    }
    
	public static void display(char[][] arr) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
