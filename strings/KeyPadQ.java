package strings;

import java.util.*;
public class KeyPadQ {

	static String[] arr = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>();
		str = KeyPadCombinations("321");
		System.out.println(str);
	}

	public static ArrayList<String> KeyPadCombinations(String s) {

		if (s.length() == 0) {
			ArrayList<String> b = new ArrayList<>();
			b.add("");
			return b;
		}
		char ch = s.charAt(0);
		String str = s.substring(1);

		ArrayList<String> res = KeyPadCombinations(str);
		ArrayList<String> m = new ArrayList<>();

		for (String var : res) {
			String x = arr[ch - '0'];

			for (int i = 0; i < x.length(); i++) {
				char c = x.charAt(i);
				
				m.add(var + c);
			}
		}
		return m;
 
	}

}
