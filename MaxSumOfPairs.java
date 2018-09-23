
public class MaxSumOfPairs {
	public static void main(String args[]) {
		
		int [] arr = {2, 18, 9, 16, 3, 7, 11};
		
	}
	
	private static void swap(int arr[], int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
	
	private static void print(int arr[]) {
		for(int i=0;i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
