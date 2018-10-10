package strings;
import java.util.*;

public class StringCompression {

	public static void main(String[] args) {
		String s = "aaabbbccd";
		System.out.println(Compress(s));

	}
	
	public static String Compress(String s) {
		StringBuilder sb = new StringBuilder("");
		int n = s.length();
		
		int j;
		
		for(int i=0; i<n-1; i++) {
			char ch1 = s.charAt(i);
			char ch2 = s.charAt(i+1);
			
			if(ch1!=ch2) {
				System.out.print(ch1);
				
				
			}
			
		}
		
		
		System.out.print(s.charAt(s.length()-1));
		
		return sb.toString();
		
	}

}
