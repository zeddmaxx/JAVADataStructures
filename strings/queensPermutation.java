package strings;

public class queensPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//permutations(new boolean[4], 2, 0, "");
		permutationsOptimized(0,4,2,0,"");
	}
	static int cntr=0;
	public static void permutations(boolean[] boxes, int tq, int qpsf, String asf ) {
		
		if(tq==qpsf) {
			cntr++;
			System.out.println(cntr+". "+asf); return;
		}
		
		for(int i=0; i<boxes.length; i++) {
			
			if(boxes[i]!=true) {
				boxes[i] = true;
					permutations(boxes, tq, qpsf+1, asf +"q"+(qpsf+1) +"b" +i);
				boxes[i] = false;
			}
		}
	}
	
	public static void permutationsOptimized(int bit,int tb, int tq, int qpsf, String asf) {
		if(tq==qpsf) {
			cntr++;
			System.out.println(cntr+". "+asf); return;
		}
		
		for(int i=0; i<tb; i++) {
			
			if((bit&(1<<i))==0) {
				
				bit ^= (1<<i);
					permutationsOptimized(bit, tb,tq, qpsf+1, asf +"q"+(qpsf+1) +"b" +i);
				bit ^= (1<<i);
			}
		}
	}
	
	

}
