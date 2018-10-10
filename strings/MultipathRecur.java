package strings;

public class MultipathRecur {

	public static void main(String[] args) {
		
		multimoveBP(0,0,3,3,"");
		
	}
	
	static int cntr=0;
	public static void multimoveBP(int sr, int sc, int dr, int dc, String asf) {
		
		if(sr==dr&&dc==sc) {
			cntr++;
			System.out.println(cntr+" . "+asf);
		}
		
		for(int i=1; i<=dc-sc;i++) {
			multimoveBP(sr, sc+i, dr, dc, asf + "h" + i);
		}
		
		for(int i=1; i<=dr-sr;i++) {
			multimoveBP(sr+i, sc, dr, dc, asf + "v" + i);
		}
		
		//diagonal
		for(int i=1; i<=dc-sc&&i<=dr-sr;i++) {
			multimoveBP(sr+i, sc+i, dr, dc, asf + "d" + i);
		}
		
	}

}
