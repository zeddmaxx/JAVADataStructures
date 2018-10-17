package Sorting;

public class quickSort {

	public static void main(String[] args) {
		
		int[] arr = {8,2,-1,0,4,5,9,2};
		
		//int p = partition(arr, 1);
		//System.out.println(p);
		//sort012(arr);
		quickSort(arr, 0, arr.length-1);
		display(arr);
	}
	
	public static void quickSort(int[] arr, int lo, int hi) {
		if(lo>=hi)
			return;
		
		int p = partitionQS(arr, lo, hi);
		
		quickSort(arr, lo, p-1);
		quickSort(arr, p+1, hi);
	}
	public static int partitionQS(int[] arr, int lo, int hi) {
		int pivot = arr[hi];
		int i=lo,p=lo;
		while(i<=hi) {
			if(arr[i]>pivot)
				i++;
			else
			{
				swap(arr, i, p);
				i++;
				p++;
			}
		}
		return p-1;
		
	}
	
	public static int partition(int[] arr, int pivot) {
		
		int i=0,p=0;
		while(i<arr.length) {
			if(arr[i]>=pivot)
				i++;
			else
			{
				swap(arr, i, p);
				i++;
				p++;
			}
		}
		return p-1;
		
	}
	public static void sort012(int[] arr) {
		
		int i=0,p=0;
		int j=0;
		while(i<arr.length) {
			if(arr[i]>=2)
				i++;
			else if(arr[i]==1) {
				swap(arr, i, j);
				i++;
				j++;
			}
			else
			{	
				swap(arr, i,j);
				i++;
				swap(arr, j,p);
				j++;
				p++;
				
			}
		}
		
		
	}
	
	public static void swap(int[] arr, int i, int j) {
		int s = arr[i];
		arr[i] = arr[j];
		arr[j] = s;
	}
	
	public static void display(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}
	
	public static void display(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length;j++)
			System.out.print(arr[i][j] +" ");
		}
	}

}
