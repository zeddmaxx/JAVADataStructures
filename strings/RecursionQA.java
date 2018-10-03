package strings;

import java.util.ArrayList;

public class RecursionQA {
	static String[] arr = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
	public static void main(String[] args) {
		//ArrayList<String> str = new ArrayList<>();
		
	//printSS("abc", "");
	//printKPC("321", "");
		
	 //printBP(0,10,"");
	 printMP(0,0,2,2,"");
	
	}
	
	public static void printSS(String ques, String asf) {
		
		if(ques.length()==0) {
			System.out.println(asf);
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		
		printSS(roq, asf + ch);
		printSS(roq, asf);
	}
	
	public static void printSSAscii(String ques, String asf) {
		if(ques.length()==0) {
			System.out.println(asf);
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		
		printSSAscii(roq, asf);
		printSSAscii(roq, ch+asf);
		printSSAscii(roq, (int)ch + asf);
		
	}
	
	public static void printKPC(String ques, String asf) {
		if(ques.length()==0) {
			System.out.println(asf);
			return;
		}
		
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		
		String x = arr[ch - '0'];
		for (int i = 0; i < x.length(); i++) {
				char c = x.charAt(i);
				printKPC(roq, c+asf);
			}
			
		}
		
	
	public static void printBP(int s, int d, String asf) {
		if(s==d) {
			System.out.println(asf);
			return;
		}
		
		for(int i=1; i<=6&&(s+i)<=d; i++) {
			int m = s+i;
			printBP(m, d, i+asf);
		}
		
		
	}
	
	public static void printMP(int sr, int sc, int dr, int dc, String asf) {
		if(sr==dr &&sc==dc) {
			System.out.println(asf);
			return;
		}
		
		if(sr<dr) {
			printMP(sr+1,sc,dr,dc,'V'+asf);
		}
		if(sc<dc) {
			printMP(sr,sc+1,dr, dc,'H'+asf);
		}
		
		
	}
	

}
