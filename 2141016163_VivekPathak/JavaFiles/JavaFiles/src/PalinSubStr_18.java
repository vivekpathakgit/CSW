import java.util.Scanner;

public class PalinSubStr_18 {
	static boolean checkPalin(int st, int ed, String s) {
		boolean res = true;
		while(st<ed) {
			
			if(s.charAt(st++)!=s.charAt(ed--)) {
				res = false;
				break;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.next();
		String sub = "";
		int max = 0;
		for(int i = 0; i<s.length(); i++) {
			for(int j = s.length()-1;j>=0; j--) {
				if(checkPalin(i, j, s)) {
					if(j-i+1>max) {
						max = j-i+1;
						sub = s.substring(i, j+1);
					}	
				}
			}
		}
		System.out.println(max);
		System.out.println(sub);
	}

}
