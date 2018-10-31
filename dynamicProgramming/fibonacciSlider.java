package dynamicProgramming;

public class fibonacciSlider {

	public static void main(String[] args) {
		//Sliding window to optimize memory!!
		System.out.println(fibSlider(10));
	}
	
	public static int fibSlider(int n) {
		int[] s = new int[2];
		s[0] = 0;
		s[1] = 1;
		int x;
		for(int i = 0; i<n; i++) {
			
			x = s[0]+s[1];
			
			s[0] = s[1];
			
			s[1] = x;
		}
		return s[0];
	}

}
