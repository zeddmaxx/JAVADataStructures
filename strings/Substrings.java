package strings;

import java.util.Scanner;

public class Substrings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string ");
		
		String str = s.nextLine();
		
		allChars(str);
		allSubstr(str);

	}
	public static void allChars(String s) {
		for(int i=0; i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
	}
	
	public static void allSubstr(String s) {
		for(int i=0; i<s.length();i++) {
			for(int j=i+1; j<=s.length(); j++) {
				System.out.println(s.substring(i,j));
				
			}
			
		}
	}

}
