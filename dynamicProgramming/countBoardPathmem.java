package dynamicProgramming;

public class countBoardPathmem {
	
	public static void main(String args[]) {
		int d = 10;
		int[] dp = new int[d+1];
		//System.out.println(countBpmem(0, d, dp));
		System.out.println(countBpTabulated(0,d));
	}
	
	public static int countBpTabulated(int s, int d) {
		int[] dp = new int[d+1];
		
		dp[d] = 1;
		
		for(int i=d-1; i>=s;i--) {
			
			for(int dice = 1; dice<=6;dice++) {
				if(dice+i<=d) {
					dp[i] += dp[i+dice];
				}
			}

		}
		
		return dp[s];
	}
	
	public static int countBpmem(int s, int d, int[] dp) {
		if(s>d) {
			return 0;
		}
		if(s==d) {
			return 1;
		}
		
		if(dp[s]!=0) {
			return dp[s];
		}
		int counts=0;
		for(int dice = 1; dice<=6; dice++) {
			int i = s+dice;
			int citod = countBpmem(i, d, dp);
			//dp[i] = citod;
			counts+=citod;
		}
		dp[s] = counts;
		return counts;
	}
}
