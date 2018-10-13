package typesOfPrint;

public class removeAdjdup {

	public static void main(String[] args) {
		//remDup2("aaaaaaaaaaaaaaa", "");
		remDup("peppep", 0);
	}
public static String remDup(String s, int vidx){
        
        if(vidx==s.length()){
            return "";
        }
        char ch = s.charAt(0);
        String str = remDup(s.substring(1), vidx+1);
        
        if(s.charAt(vidx)==s.charAt(vidx+1)){
            return str+ch;
        }
        return str;
    }
	

	public static void remDup2(String str, String asf) {

		if (str.length() == 0) {
			System.out.println(asf);
			return;
		}

		char ch = str.charAt(0);
		
		if (str.length() > 1) {
			if (ch != str.charAt(1)) {
				asf = asf+ch;
			}
		}
		else {
			asf = asf+ch;
		}
		remDup2(str.substring(1),  asf);

	}

}
