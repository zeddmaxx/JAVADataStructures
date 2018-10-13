package Recursioncontd;

import java.util.*;

public class printTargetSS {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int tar = 50;
		printTargetSS1(arr, tar, 0, 0, "");

		ArrayList<Integer> a = new ArrayList<>();
		printTargetSS2(arr, 50, 0, a);
	}

	public static void printTargetSS1(int[] arr, int tar, int vidx, int sosf, String ssf) {

		if (arr.length == vidx) {
			if (sosf == tar)
				System.out.println(ssf);
			return;
		}

		printTargetSS1(arr, tar, vidx + 1, sosf + arr[vidx], ssf + " " + arr[vidx]);

		printTargetSS1(arr, tar, vidx + 1, sosf, ssf);
	}

	static int sosf = 0;

	public static void printTargetSS2(int[] arr, int tar, int vidx, ArrayList<Integer> ssf) {

		if (arr.length == vidx) {
			if (sosf == tar) {
				System.out.println(ssf);
			}
			return;
		}

		ssf.add(arr[vidx]);
		sosf += arr[vidx];
		printTargetSS2(arr, tar, vidx + 1, ssf);

		sosf -= arr[vidx];
		ssf.remove(ssf.size() - 1);
		printTargetSS2(arr, tar, vidx + 1, ssf);
	}

}
