
public class AllSubsetsofArray {

	public static void main(String args[]) {
		//All possible subsets
		int[] arr = {1,2,3,4};
		
		for(int i=0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
			 for(int j=i+1; j < arr.length; j++) {
				 System.out.println(arr[i]);
			 }
			
		}
	}
	
	private static void print(int arr[]) {
		for(int i=0;i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}
