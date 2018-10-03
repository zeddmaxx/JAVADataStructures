package strings;
import java.util.*;

public class SpecialSubsets {

	public static void main(String[] args) {
		String s = "ab";
		ArrayList<String> str =  new ArrayList<>();
		str = SpecialSub(s);
		System.out.println(str);
	}
	
	public static ArrayList<String> SpecialSub(String s){
		if(s.length()==0) {
			ArrayList<String> b = new ArrayList<>();
			b.add(" ");
			return b;
		}
		
		char ch = s.charAt(0);
		String n = s.substring(1);
		ArrayList<String> res = SpecialSub(n);
		ArrayList<String> fin = new ArrayList<>();
		
		for(String var: res) {
			fin.add(var);
			//fin.add((""+(int)ch));
			fin.add((var+""+ch));
			fin.add((var+""+(int)ch));
			
		}
		return fin;
	}
	

}
