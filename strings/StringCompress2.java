package strings;

public class StringCompress2 {

	public static void main(String[] args) {
		String s = "aaaaddde";
		System.out.println(Compress(s));

	}
	
	public static String Compress(String s) {
		StringBuilder sb = new StringBuilder("");
		int n = s.length();
		int c=1;
		int j;
		
		for(int i=0; i<n-1; i++) {
			char ch1 = s.charAt(i);
			char ch2 = s.charAt(i+1);
			
			if(ch1!=ch2) {
				System.out.print(ch1);
				if(c>1) {
					System.out.print(c);
					
				}
				c=1;
			}
			else
				c++;
		}
		
		
		System.out.print(s.charAt(s.length()-1));
		if(c>1) {
			System.out.print(c);
		}
		return sb.toString();
		
	}

}
