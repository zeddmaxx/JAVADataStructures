package dynamicProgramming;

public class palindromicSubstrings {

	public static void main(String[] args) {
		String s = "abccbc";
		boolean[][] palin = countPalindromicSS(s);
		System.out.println(minpc(s, 0, s.length() - 1, palin, new int[s.length()][s.length()]));
	}
	
	public static int minpctab(String s, boolean[][]ispalin) {
		int[][] dp = new int[s.length()][s.length()];
		
		for(int i=0; i<s.length(); i++) {
			for(int )
		}
	}
	
	public static int minpc(String s, int i, int j, boolean[][]ispalin, int[][] dp ) {
		
		if(ispalin[i][j]==true)
			return 0;
		
		if(dp[i][j]!=0)
			return dp[i][j];
		int ans = Integer.MAX_VALUE;
		for(int cp = i; cp<j; cp++) {
			int c1 = minpc(s, i, cp, ispalin, dp);
			int c2 = minpc(s, cp+1, j, ispalin, dp);
			ans = Math.min(c1+c2+1, ans);
		}
		
		dp[i][j] = ans;
		return ans;
		
	}
	
	public static boolean[][] countPalindromicSS(String s) {
		boolean[][] dp = new boolean[s.length()][s.length()];
		int count=0;
		int max_gap=0;
		for(int gap = 0; gap< dp.length; gap++) {
			
			for(int i=0, j=i+gap; j<dp.length; i++,j++) {
				//length == 1
				if(gap==0)
					dp[i][j] = true;
				//length ==2
				else if(gap==1)
					dp[i][j] = s.charAt(i) == s.charAt(j);
				//length >= 3 check if extremes are same and if the middle portion is palindrome or not!!
				else {
					dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i+1][j-1];
				}
				if(dp[i][j])
					count++;
				//storing max_gap
			if(dp[i][j])
				max_gap = gap;
			}
		}
		return dp;
		//returning the longest palindromic subsequence!!!
		//when you're at the longest diagonal and encounter a True!!
		/*System.out.println(count);
		for(int gap = max_gap; gap<dp.length; gap++) {
			for(int i=0, j=i+gap; j<dp.length; i++,j++)  {
				if(dp[i][j]) {
					System.out.println(s.substring(i, j+1));
				}
			}
		}
		*/
		
	}

}
