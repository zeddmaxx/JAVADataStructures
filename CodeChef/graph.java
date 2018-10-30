package CodeChef;

import java.util.Scanner;

public class graph {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			t--;
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = s.nextInt();
			}
			
		}

	}
	public static void dfs(int s)
	{
	    //visited[s]=1;
	    
	   /* for(auto x:edges[s])
	    {
	        if(visited[x]==0)
	        dfs(x);
	    }*/
	}
	
	public static boolean coprime(int a, int b) { 
        
        if ( gcd(a, b) == 1) 
            return true;  
        else
            return false;  
    }
	
	public static int gcd(int a, int b) 
    { 
		if(b==0)
		    return a;
		    
		    else
		    return gcd(b,a%b);
    }

}
