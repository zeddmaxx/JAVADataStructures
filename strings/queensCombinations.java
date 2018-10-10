package strings;

public class queensCombinations {

	public static void main(String[] args) {
		//Combinations(new boolean[4], 2, 0,-1, "");
		Combinations2(new boolean[4], 2, 0,0, "");
	}
	
	static int cntr = 0;
	public static void Combinations(boolean[] boxes,int tq, int qpsf, int pqb, String asf) {
		
		if(tq == qpsf) {
			cntr++;
			System.out.println(cntr+". "+asf); return;
		}
		
		for(int i=pqb+1; i<boxes.length; i++) {
			
			if(boxes[i]==false) {
				boxes[i] = true;
				Combinations(boxes, tq, qpsf+1,i ,asf +"q"+(qpsf+1) +"b" +i);
				boxes[i] = false;
			}
			
		}
		
	}
	//Boxes choosing the Queens here!!
	
public static void Combinations2(boolean[] boxes,int tq, int cq, int cb, String asf) {
	
	if(cq==tq) {
		System.out.println(asf);
		return;
	}
	
	if(cb == boxes.length) {
		return;
	}
	
	Combinations2(boxes, tq, cq, cb+1, asf);
	if(boxes[cb]!=true) {
		boxes[cb] = true;
		Combinations2(boxes, tq, cq+1, cb+1, asf+"q"+cq+"b"+cb+" ");
		boxes[cb]=false;
	}
	
	
		
	}

}
