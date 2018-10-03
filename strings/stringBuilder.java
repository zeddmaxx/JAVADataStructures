package strings;
import java.util.*;

public class stringBuilder {
	public static void main(String args[]) {
		
		//Scanner s = new Scanner(System.in);
		
		//String str = s.nextLine();
		String str = "HiZoya";
		//System.out.println(ToggleCase(str));
		System.out.println(ModifyString(str));

		}
	
	public static String ToggleCase(String s) {
		StringBuilder sb = new StringBuilder(s);
		
		for(int i=0; i<s.length();i++) {
			char c = s.charAt(i);
			
			if(c>='a' && c<='z') 
				c = (char)(c + 'A' - 'a');
			
			else
				c = (char)(c - 'A'+'a');
			sb.setCharAt(i, c);
		}
		return sb.toString();
	}
	
	public static String ModifyString(String s) {
		StringBuilder sb = new StringBuilder(s);
		
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(i%2==0) 
				sb.setCharAt(i, (char)(ch-1));
			
			else
				sb.setCharAt(i, (char)(ch+1));
		}
		
		return sb.toString();
	}
}
