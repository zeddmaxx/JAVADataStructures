package strings;

public class PalindromicSubStrings {
	public static void main(String args[]) {
		String s = "NitiN";
		AllPalindromicSubStrings("abcbcad");
	}
	
	public static boolean isPalindrome(String s) {
		int i=0;
		int j = s.length()-1;
		
		while(i<=s.length()/2) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;j--;
		}
		return true;
	}
	
	public static void AllPalindromicSubStrings(String s) {
		
		for(int i=0; i<s.length();i++) {
			for(int j=i+1; j<=s.length(); j++) {
				
				if(isPalindrome(s.substring(i,j)))
					System.out.println(s.substring(i,j));
			}
			
		}
	}
	
}
