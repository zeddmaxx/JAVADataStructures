package CodeChef;
import java.util.*;

public class rotateArrSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		//check if true or false
		while(t>0) {
			t--;
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = s.nextInt();
			}
			if(checkSort(arr)) {
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		}
	}
	
	public static boolean checkSort(int[] arr) {
		//make circular array!!
		int n = arr.length;
		int s = Integer.MAX_VALUE;
		int ind=0;
		for(int j=0;j<n;j++) {
			if(arr[j]<s) {
				s = arr[j];
				ind = j;
			}
				
		}
		for(int i=ind;i<n+ind-1;i++) {
			if(arr[i%n] > arr[(i+1)%n]) {
				return false;
			}
		}
		return true;
	}

}
