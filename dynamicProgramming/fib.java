package dynamicProgramming;

public class fib {
	public static void main(String[] args) {
		int n = 43;
		//System.out.println(fib(n));
		int[] qb = new int[n+1];
		System.out.println(fibTabulated(n));
	}
	
	public static int fib(int n) {
		if(n<=1)
			return n;
		return fib(n-1) + fib(n-2);
	}
	
	public static int fibMemoised(int n, int[] qb) {
		if(qb[n]!=0)
			return qb[n];
		else
		{
			if(n<=1)
				return n;
			else {
				int fib = fibMemoised(n-1, qb) + fibMemoised(n-2, qb);
				qb[n] = fib;
				return qb[n];
			}
		}
	}
	
	public static int fibTabulated(int n) {
		int[] f = new int[n+1];
		f[0] = 0;
		f[1] = 1;
		for(int i=2; i<=n; i++) {
			f[i] = f[i-1] + f[i-2];
		}
		return f[n];
	}
}
