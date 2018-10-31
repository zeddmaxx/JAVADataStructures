package dynamicProgramming;

public class minCostPath {

	public static void main(String[] args) {
		int[][] costs = {
					{2,3,0,4},
					{0,6,5,2}, 
					{8,0,3,7}, 
					{2,0,4,2}
				};
		//System.out.print(mcp(0, 0, costs.length-1, costs[0].length-1, costs));
		int[][] dp = new int[costs.length][costs.length];
		System.out.print(mcpMem(0, 0, costs.length-1, costs[0].length-1, costs, dp));
	}
	
	public static int mcpMem(int sr, int sc, int dr, int dc, int[][] costs, int[][] dp) {
		if(sr==dr && sc==dc)
			return costs[sr][sc];
		
		if(dp[sr][sc]!=0)
			return dp[sr][sc];
		
		int mincoststod = 0;
		int minho = Integer.MAX_VALUE;
		int minvo = Integer.MAX_VALUE;

		if (sr < dr)
			minvo = mcp(sr + 1, sc, dr, dc, costs);
		if (sc < dc)
			minho = mcp(sr, sc + 1, dr, dc, costs);
		
		mincoststod = Math.min(minvo, minho) + costs[sr][sc];
		dp[sr][sc] = mincoststod;
		return mincoststod;
	}

	public static int mcp(int sr, int sc, int dr, int dc, int[][] costs) {
		if(sr==dr && sc==dc)
			return costs[sr][sc];
		
		int mincoststod = 0;
		int minho = Integer.MAX_VALUE;
		int minvo = Integer.MAX_VALUE;

		if (sr < dr)
			minvo = mcp(sr + 1, sc, dr, dc, costs);
		if (sc < dc)
			minho = mcp(sr, sc + 1, dr, dc, costs);
		
		mincoststod = Math.min(minvo, minho) + costs[sr][sc];
		
		return mincoststod;
	}

}
