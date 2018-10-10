package strings;

import java.util.ArrayList;

public class AllPertmutations {

	public static void main(String[] args) {
		String s = "abc";
		
		ArrayList<String> n = new ArrayList<>();
		n = allPermutations(s);
		System.out.print(n);
	}
	
	public static ArrayList<String> allPermutations(String s, String asf){
		if(s.length()==0) {
			ArrayList<String> b = new ArrayList<>();
			b.add("");
			return b;
		}
		ArrayList<String> fin = new ArrayList<>();
		for(int i=0; i<s.length()-1;i++) {
			char ch = s.charAt(i);
			String n = s.substring(0,i)+ s.substring(i+1);
			ArrayList<String> res = allPermutations(n);
			
		
				for(String var: res) {
					fin.add((ch+var));
					//fin.()
				}
				
		}
		return fin;
		
	}

}
