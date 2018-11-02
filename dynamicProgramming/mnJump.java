package dynamicProgramming;

public class mnJump {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 0, 1, 2, 0, 3, 1, 0, 2, 1 };
		System.out.println(minj(arr));

	}
	public static int minj(int[] arr) {
		int[] dp = new int[arr.length];
		dp[arr.length - 1] = 0;
		for (int i = arr.length - 2; i >= 0; i--) {
			int j = arr[i];
			if (arr[i] == 0)
				dp[i] = -1;

			else {
				int min1 = Integer.MAX_VALUE;
				while (j > 0) {
					if ((i + j) < arr.length) {
						if (dp[j + i] != -1) {
							if (dp[j + i] < min1)
								min1 = dp[j + i];
						}
					}

					j--;
				}
				if (min1 == Integer.MAX_VALUE)
					dp[i] = -1;
				else
					dp[i] = min1 + 1;
			}
		}
		return dp[0];
	}

}
