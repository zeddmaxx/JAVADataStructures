
public class BubbleSort {

	public static void main(String[] args) {
		int [] arr = {2, 20, 3, 8, 0};
		print(arr);
		for(int i=0; i<=arr.length-1;i++ ) {
			for( int j=0; j < arr.length-i-1; j++)
			{
				if(arr[j]>arr[j+1]) {
					swap( arr, j, j+1);
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
