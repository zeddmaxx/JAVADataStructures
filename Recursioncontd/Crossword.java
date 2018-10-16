package Recursioncontd;

import java.util.Scanner;

public class Crossword {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char[][] board = new char[10][10];
		for(int i = 0; i < 10; i++){
			board[i] = scn.nextLine().toCharArray();
		}
		String[] words = scn.nextLine().split(";");
		crossword2(board, words, 0);
		//display(board);
		//crossword(arr, words, 1);
		
	}
	
	/* static boolean[] done = new boolean[4];
	
	public static void crossword(char[][] board, String[] words,int bno) {
		if(bno==101) {
			display(board);
			return;
		}
		int r = (bno - 1) / board.length;
		int c = (bno - 1) % board.length;
		
		for(int i=0; i<words.length; i++) {
			if(CanWePlaceVert(board, r,c, words[i])&&done[i]==false) {
				boolean[][] arr = Place(board, r, c, words[i], 1);
				done[i] = true;
				crossword(board, words, bno+1);
				Unplace(board, r, c, words[i], arr);
				done[i] = false;
			}
			else if(CanWePlaceHorizon(board, r,c, words[i])&&done[i]==false) {
				boolean[][] arr = Place(board, r, c, words[i], 2);
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
		for(int i=0;i<n&&(r+i)<10;i++) {
			if(board[r+i][c]!='+') {
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
		for(int i=0;i<n&&(c+i)<10;i++) {
			if(board[r][c+i]!='+') {
				count++;
			}
		}
		if(count==n)
			return true;
		else
			return false;
		
	}
    
    public static boolean[] Place(char[][] board, int r, int c, String word, int x){
    	boolean[] arr = new boolean[10];
    	
    	if(x==1)//vertically placement 
    	{
    		for(int i=0; i<word.length();i++) {
    			board[r+i][c] = word.charAt(i);
    			arr[r+i][c] = true;
    		}
    	}
    	else { //horizontal placement
    		for(int i=0; i<word.length();i++) {
    			board[r][c+i] = word.charAt(i);
    			arr[r][c+i] = true;
    		}
    	}
		return arr;
    	
    }
    
    /*public static void Unplace(char[][] board, int r, int c, String word, boolean[][] arr){
		
    	
    }*/
	
	
	public static void crossword2(char[][] board, String[] words,int wsf) {
		
		if(wsf==words.length) {
			display(board);
			return;
		}
		//who will be the sp of words[wsf]
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				
				if(board[i][j] == '-'||board[i][j] == words[wsf].charAt(0)) {
					
					if(canPlaceWordVertical(board, i, j, words[wsf])) {
						boolean[] reset = placewordVert(board, i, j, words[wsf]);
						crossword2(board, words, wsf+1);
						unplaceVert(board, i, j, reset);
					}
					
					else if(canPlaceWordHorizont(board, i, j, words[wsf])) {
						boolean[] reset = placewordHorizont(board, i, j, words[wsf]);
						crossword2(board, words, wsf+1);
						unplaceHorizon(board, i, j, reset);
					}
					
					
				}
			}
		}
		
	}
	

	private static void unplaceVert(char[][] board, int i, int j, boolean[] reset) {
		for(int r=0; r<reset.length; r++) {
			if(reset[r]) {
				board[i+r][j] = '-';
			}
		}
	}
	
	private static void unplaceHorizon(char[][] board, int i, int j, boolean[] reset) {
		for(int c=0; c<reset.length; c++) {
			if(reset[c]) {
				board[i][j+c] = '-';
			}
		}
	}

	private static boolean[] placewordVert(char[][] board, int i, int j, String word) {
		
		boolean[] ret = new boolean[word.length()];
		
		
		for(int r = 0; r<word.length(); r++) {
			ret[r] = board[i+r][j] =='-';
			board[i+r][j] = word.charAt(r);
		}
		return ret;
	}
    private static boolean[] placewordHorizont(char[][] board, int i, int j, String word) {
		
		boolean[] ret = new boolean[word.length()];
		
		for(int c = 0; c<word.length(); c++) {
			ret[c] = board[i][c+j] =='-';
			board[i][j+c] = word.charAt(c);
		}
		return ret;
	}

	private static boolean canPlaceWordVertical(char[][] board, int i, int j, String word) {
		
		//exact fit check!
		if((i>0 && board[i-1][j]!='+')||i+word.length()< board.length && board[i+word.length()][j]!='+') {
			return false;
		}
		
		for(int r = 0; r<word.length(); r++) {
			
			if((board[i+r][j] != word.charAt(r)&& board[i+r][j]!='-')||i+r==board.length) {
				return false;
			}
		}
		
		return true;
	}
	private static boolean canPlaceWordHorizont(char[][] board, int i, int j, String word) {
		
		//exact fit check!
		if((j>0 && board[i][j-1]!='+')||j+word.length() < board[0].length && board[i][j+word.length()]!='+') {
			return false;
		}
		for(int c = 0; c < word.length(); c++) {
			if((board[i][j+c] != word.charAt(c)&& board[i][j+c]!='-')||(j+c == board[0].length)) {
				return false;
			}
		}
		return true;
	}
	
	public static void display(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
/*
 * INPUT : --->
+-++++++++
+-------++
+-++-+++++
+-------++
+-++-+++++
+-++-+++++
+-++------
++++++++++
+++++----+
++++++++++
ANDAMAN;MANIPUR;ICELAND;ALLEPY;YANGON;PUNE
 */
	
	

}
