package Recursioncontd;

import java.util.ArrayList;

public class perm {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		
		//PP1("aab", a, 0);
		String str = "a";
		System.out.println(str.substring(1).length());

	}
	
	public static void PP1(String str, ArrayList<String> a, int vidx){
        if(str.length()==0){
            System.out.println(a);
        }
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            //System.out.println(a);
            a.add(i,""+ch);
            PP1(str.substring(0,i)+str.substring(i+1), a, vidx+1);
            StringBuilder y = new StringBuilder(a.get(a.size()-1));
            //System.out.println(a);
            y.deleteCharAt(y.length()-1);
            a.remove(a.size()-1);
            a.add(y.toString());
            System.out.println(a);
            
        }
        
    }

}
