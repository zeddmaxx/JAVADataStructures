package strings;
import java.util.*;

public class DiffInAscii {
	public static void main(String args[]) {
		String s = "amigos";
		AsciiDiffPrint(s);
	}
	public static void AsciiDiffPrint(String s) {
		StringBuilder sb = new StringBuilder("");
		sb.append(s.charAt(0));
		for(int i=0; i<s.length()-1;i++) {
			char c1 = s.charAt(i);
			char c2 = s.charAt(i+1);
			sb.append(c2-c1);
			sb.append(c2);
		}
		String v = sb.toString();
	System.out.println(v);
	}
}
