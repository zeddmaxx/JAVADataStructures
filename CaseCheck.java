
public class CaseCheck {
	public static void main(String args[]) {
		int i = 0;
		char a = 'a';
		int f = 0;

		if (a >= 'A' && a <= 'Z') {
			System.out.println("Upper ");
			f = 1;
		}

		else if (a >= 'a' && a <= 'z') {
			System.out.println("Lower ");
		}

		if (f == 1) {
			System.out.println((char) (a + 'A' + 'D'-'d' -1));
		} else {
			System.out.println((char) (a + 'a' + 'd' -1 -'a'));
		}
		
	}
}
