package Recursioncontd;

import java.util.ArrayList;

public class Misc {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		System.out.println(PP1("abc", 0));
		

	}
	public static ArrayList<String> PP1(String str, int vidx){
        if(str.length()==vidx){
            ArrayList <String>x = new ArrayList<>();
            x.add("");
            return x;
        }
        ArrayList <String> res = new ArrayList<>();
        
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            
        ArrayList <String> a = PP1(str.substring(0,i)+str.substring(i+1), vidx+1);
            for(String var: a){
                String x = " "+ch;
                res.add(x+var);
            }
            //String y = res.get(res.size()-1);
            //System.out.println(y);
            //;res.remove(a.size()-1);
            //res.add(y.substring(0,y.length()-1));
        }
        return res;
    }

}
