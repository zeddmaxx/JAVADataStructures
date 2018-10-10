package strings;

public class PrintSubSewuenceBinaryLogic {

	public static void main(String[] args) {
		String s = "abc";
		printSSBL(s);

	}
	
	public static void printSSBL(String s) {
		
		for(int i=0 ;i< (1<<s.length()); i++) {
			for(int j=s.length()-1;j>=0; j--) {
				int mask = 1<<j;
				if((mask & i)!= 0) {//jth bit is set!
					System.out.print(s.charAt(s.length()-1-j));
				}
			}
			
			System.out.println();
			
		}
		
	}

}
