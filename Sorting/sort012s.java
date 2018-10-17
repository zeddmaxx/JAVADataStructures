package Sorting;

public class sort012s {

	public static void main(String[] args) {
		int[] arr = {0,0,1,2,1,0,2,1,2,1,0,0,1,1,2,1};
		sort012(arr);
		display(arr);

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

}
