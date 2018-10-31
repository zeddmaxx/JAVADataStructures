package dynamicProgramming;

public class matricChainMul {

	public static void main(String[] args) {
		int[] dims = {10,20,30,40,50,60};
		System.out.println(mcm(dims, 0, dims.length-1));
	}
	
	public static int mcm(int[] dims, int i, int j) {
		//return 0;
		if(j-i==1)
			return 0;
		
		int minc = Integer.MAX_VALUE;
		
		for(int x=i; x<j-1; x++) {
			int c1 = mcm(dims, i, x+1);
			int c2 = mcm(dims, x+1, j);
			int mulc = dims[i]*dims[j]*dims[x+1];
			minc = Math.min(mulc+c1+c2, minc);
		}
		
		return minc;
	}

}
