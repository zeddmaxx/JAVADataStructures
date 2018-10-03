package strings;
import java.util.*;

public class BoardPath {

	public static void main(String[] args) {
		
		ArrayList<String> s = new ArrayList<>();
		s = AllPathsProactive(0,10);
		System.out.println(s);

	}
	public static ArrayList<String> AllPathsReactive(int s, int d){
		
		if(s==d) {
			ArrayList<String> b = new ArrayList<>();
			b.add("\n");
			return b;
		}
		if(s>d) {
			ArrayList<String> b = new ArrayList<>();
			return b;
		}
		ArrayList<String> res = new ArrayList<>();
		
		for(int i=1; i<=6;i++) {
			int m = s + i;
			ArrayList <String> intresult = AllPathsReactive(m, d);
			
			for(String var:intresult) {
				String x = i+var;
				res.add(x);
			}
			
		}
		
		return res;
		
		
	}
	
public static ArrayList<String> AllPathsProactive(int s, int d){
		if(s==d) {
			ArrayList<String> b = new ArrayList<>();
			b.add("\n");
			return b;
		}
		ArrayList<String> res = new ArrayList<>();
		for(int i=1; i<=6&&(s+i)<=d;i++) {
			int m = s + i;
			ArrayList <String> intresult = AllPathsProactive(m, d);
			for(String var:intresult) {
				String x = i+var ;
				res.add(x);
			}	
		}
		return res;
	}

}
