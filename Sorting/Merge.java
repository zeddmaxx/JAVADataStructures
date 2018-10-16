package Sorting;

public class Merge {

	public static void main(String[] args) {
		int[] arr1 = { 9,0,8, 1, 2, 3 };
		int[] arr2 = { -1, 4, 6, 8, 10 };
		int[] arr = merge(arr1, arr2);
		int[] res = mergeSort(arr2, 0, arr2.length-1);
		
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		
	}
	public static int[] mergeSort(int[] arr, int lo, int hi) {
		if(lo==hi) {
			int[] base = new int[1];
			base[0] = arr[lo];
			return base;
		}
		
		int mid = (lo+hi)/2;
		
		int[] f = mergeSort(arr, lo, mid);
		int[] s = mergeSort(arr, mid+1, hi);
		
		int[] r = merge(f,s);
		return r;
		
	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;

		int[] arr3 = new int[m + n];

		int i = 0, j = 0, k = 0;

		while (i < n && j < m) {
			
			if (arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];
				
			} 
			else  {
				arr3[k++] = arr2[j++];
			}
		}

		while (i < n) {
			arr3[k++] = arr1[i++];
		}
		while (j < m) {
			arr3[k++] = arr2[j++];
		}

		return arr3;

	}

}
