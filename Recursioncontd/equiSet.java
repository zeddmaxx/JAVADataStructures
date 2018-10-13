package Recursioncontd;
import java.util.*;

import java.util.ArrayList;

public class equiSet {

	public static void main(String[] args) {
		
		int[] arr = { 10, 20, 30, 40, 50, 60, 70};
		//int tar = 50;
		
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		printEquiSet(arr, 0, a,0,b,0);
		
	}
	
	public static void printEquiSet(int[] arr, int vidx, ArrayList<Integer> set1, int sos1, ArrayList<Integer> set2, int sos2) {
		
		if(arr.length == vidx) {
			if(sos1==sos2) {
				System.out.print("Set1 :"+ set1);
				System.out.println(" Set2: "+ set2);
			}
			return;
		}
		
		set1.add(arr[vidx]);
		printEquiSet(arr, vidx+1, set1, sos1+arr[vidx], set2, sos2);
		set1.remove(set1.size()-1);
		set2.add(arr[vidx]);
		printEquiSet(arr, vidx+1, set1, sos1, set2, sos2+arr[vidx]);
		set2.remove(set2.size()-1);
	}

}
