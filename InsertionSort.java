
public class InsertionSort {

	public static void main(String[] args) {
		//InsertionSort
		
		int[] arr = {20, 6, 3, 5,9, 11, 2};
		print(arr);
		for(int i=1; i< arr.length; i++) {
			for(int j=i; j>0 && arr[j-1]>arr[j]; j--) {
				swap(arr, j, j-1);
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
