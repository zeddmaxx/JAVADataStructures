package strings;

public class isPalindrome {

	public static void main(String[] args) {
		String s = "Nitin";
		System.out.println(isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s) {
		int i = 0;
		int n = s.length();
		int j = n-1;
		while(i<n/2) {
			if(Character.toLowerCase(s.charAt(i))!= Character.toLowerCase(s.charAt(j))) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
