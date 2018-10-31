package dynamicProgramming;

public class countMazePath {

	public static void main(String[] args) {
		int n=10;
		
		int[][] dp= new int[n+1][n+1];
		//System.out.println(countMazePath(0,0, 2,2));
		//System.out.println(countMazePathMem(0,0, 2,2, dp));
		System.out.println(countMazePathTab(2,2));
	}
	
	public static int countMazePathTab(int dr, int dc) {
		int[][] dp = new int[dr+1][dc+1];
		
		for(int r=dr; r>=0;r--) {
			for(int c = dc; c>=0; c--) {
				if(r==dr && c== dc)
					dp[r][c] = 1;
				else if(r==dr)
					dp[r][c] = dp[r][c+1];
				else if(c==dc)
					dp[r][c] = dp[r+1][c];
				else
					dp[r][c] = dp[r+1][c ]+ dp[r][c+1];
				
			}
		}
		return dp[0][0];
	}
	
	public static int countMazePathMem(int sr, int sc, int dr, int dc, int[][] dp) {
		if(sr==dr&&sc == dc) {
			return 1;
		}
		if(sr>dr||sc>dc) {
			return 0;
		}
		if(dp[sr][sc]!=0) {
			return dp[sr][sc];
		}
		
		int counts = 0;
		int ch = countMazePathMem(sr, sc+1, dr, dc, dp );
		int cv = countMazePathMem(sr+1, sc, dr, dc, dp);
		counts = ch+cv;
		dp[sr][sc] = counts;
		return counts;
	}
	
	
	public static int countMazePath(int sr, int sc, int dr, int dc) {
		if(sr==dr&&sc == dc) {
			return 1;
		}
		if(sr>dr||sc>dc) {
			return 0;
		}
		
		int counts = 0;
		int ch = countMazePath(sr, sc+1, dr, dc );
		int cv = countMazePath(sr+1, sc, dr, dc);
		counts = ch+cv;
		return counts;
	}

}
