
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {20, 6, 3, 5,9, 11, 2};
		
		print(arr);
		
		for( int i=0; i<arr.length;i++) {
			for(int j=i; j<arr.length; j++) {
				if(arr[j] < arr[i]) {
					swap(arr, i, j);
				}
			}
		}
		
		print(arr);
		
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
