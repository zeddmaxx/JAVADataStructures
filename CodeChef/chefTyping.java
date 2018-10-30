package CodeChef;

import java.util.Scanner;
import java.util.HashMap;

public class chefTyping {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		int n = s.nextInt();
		
		while(n>0) {
			n--;
			int x = s.nextInt();
			String m = s.nextLine();
			while(x>0) {
				x--;
				//
				String str = s.nextLine();
				//System.out.println(x);
				if(hm.containsKey(str)) {
					Integer j = hm.get(str);
					hm.replace(str, j+1);
				}
				else
					hm.put(str, 1);
			}
			
			System.out.println((int)((typing(hm))*10));
			
		}
	}

	public static double val(String str) {
		double sum = 0.2;
		int c;
		// System.out.println(str.length());
		if (str.charAt(0) == 'd' || str.charAt(0) == 'f') {
			c = 0;
		} else
			c = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == 'd' || str.charAt(i) == 'f') {
				if (c == 0)
					sum += 0.4;
				else {
					sum += 0.2;
					c = 0;
				}
			} else if (str.charAt(i) == 'j' || str.charAt(i) == 'k') {
				if (c == 0) {
					sum += 0.2;
					c = 1;
				} else
					sum += 0.4;
			}
		}

		return sum;
	}

	public static double typing(HashMap<String, Integer> hm) {
		
		double count = 0;
		for (HashMap.Entry<String, Integer> entry : hm.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			// System.out.println(key.length());
			
				double mid = val(key);
				int i = 1;
				while (value != 0) {
					count += mid / i;
					value--;
					i = i * 2;
				}
		}

		return (count);
	}

}
