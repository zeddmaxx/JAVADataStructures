package typesOfPrint;

public class SpiralPrint {

	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6}, {7,8,9}};
		
		int rmin = 0;
		int cmin = 0;
		int rmax = a.length-1;
		int cmax = a[0].length-1;
		int cntr = 1;
		int tn = a.length * a[0].length;
		
		while(cntr<=tn) {
			//left wall
			for(int i=rmin; i<=rmax &&cntr<=tn; i++) {
				System.out.print(a[i][cmin] + " ");
				cntr++;
			}
			
			//bottom wall
			cmin++;
			for(int i=cmin; i<=cmax&&cntr<=tn; i++) {
				System.out.print(a[rmax][i] +" ");
				cntr++;
			}
			//right wall
			rmax--;
			for(int i=rmax; i>=rmin&&cntr<=tn;i--) {
				System.out.print(a[i][cmax]+" ");
				cntr++;
			}
			//top wall
			cmax--;
			for(int i=cmax; i>=cmin&&cntr<=tn;i--) {
				System.out.print(a[rmin][i]+" ");
				cntr++;
			}
			rmin++;
		}
	}

}
