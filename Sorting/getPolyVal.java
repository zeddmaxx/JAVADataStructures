package Sorting;

public class getPolyVal {

	public static void main(String[] args) {
		int[] arr = {8,2,-1,0,4,5,9,2};
		getPolyVal(2,3);
	}
	
	public static void getPolyVal(int x, int n) {
		
		int count = n;
		int sum=0;
		int c = x;
		
		for(int i=1; i <= n; i++) {
			
			sum = sum + (count)*c;
			count = count-1;
			
			c =  c*x;
			
		}
		System.out.println(sum);
	}

}
