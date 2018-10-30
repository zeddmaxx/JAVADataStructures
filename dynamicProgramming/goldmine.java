package dynamicProgramming;

public class goldmine {

	public static void main(String[] args) {
		int [][] mine = {
				{2,0,9,7,3},
				{4,8,6,0,5},
				{3,3,3,3,0},
				{0,9,1,0,4},
				{6,8,2,0,0},
				{7,3,0,4,2}
				};
		System.out.println(solvegoldMine(mine));

	}
	
	public static int max(int...vals) {
		int m = vals[0];
		for(int i=0; i<vals.length;i++) {
			m = Math.max(m, vals[i]);
		}
		return m;
	}
	
	public static int solvegoldMine(int[][] arr) {
		int[][] strg = new int[arr.length][arr[0].length];
		//iterate over columns
		for(int col=strg[0].length-1; col>=0; col--) {
			for(int row = 0; row<strg.length; row++) {
				
				//divide into 4 areas!!
				if(col==strg[0].length-1) {
					strg[row][col] = arr[row][col];
				}
				else if(row==0) {
					strg[row][col] = max(strg[row][col+1], strg[row+1][col+1])+arr[row][col];
				}
				else if(row==strg.length-1) {
					strg[row][col] = max(strg[row][col+1], strg[row-1][col+1])+arr[row][col];
				}
				
				else {
					strg[row][col] = max(strg[row][col+1], strg[row-1][col+1], strg[row+1][col+1])+ arr[row][col];
				}
				
			}
		}
		
		//iterate over 1st column to get answer
		int m1 = strg[0][0];
		for(int i=0; i<strg.length; i++) {
			if(strg[i][0]>m1)
				m1 = strg[i][0];
		}
		return m1;
		
	}

}
