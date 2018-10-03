package strings;
import java.util.*;

public class AllSubsetsOfString {
	public static void main(String args[]) {
		ArrayList<String> str = new ArrayList<>();
		str = AllSubsets("abc");
		
		System.out.print(str);
	}
	
	public static ArrayList<String> AllSubsets(String s){
		if(s.length() ==0) {
			ArrayList<String> b = new ArrayList<>();
			b.add(" ");
			return b;
		}
		char ch = s.charAt(0);
		String rem = s.substring(1);
		
		ArrayList<String> ret = AllSubsets(rem);
		ArrayList<String> result = new ArrayList<>();
		for(String var: ret) {
			result.add(var);
			result.add(ch+var);
		}
		
		return result;
		
	}
}
