package dynamicProgramming;

public class targetSum {

	public static void main(String[] args) {
		int[] arr = {5,2,4,6,3};
		int targ = 10;
		
		ifTargetSum(arr, targ);
	}
	
	public static void ifTargetSum(int[] arr, int t) {
		
		boolean[][] strg = new boolean[arr.length+1][t+1];
		
		for( int row = 0; row <= arr.length; row++) {
			for( int col = 0; col < strg[0].length; col++) {
				if(col==0) {
					strg[row][col] = true;
				}
				else if(row==0) {
					strg[row][col] = false;
				}
				else {
					 if((strg[row-1][col])==true ||( (col-arr[row-1]>=0) && strg[row-1][col-arr[row-1]]==true))
							strg[row][col] = true;
					else
						strg[row][col] = false;	
				}
			}
		}
		
		System.out.println(strg[arr.length][t]);
		
	}
	
	public static void display(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
