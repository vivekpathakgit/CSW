import java.util.Scanner;

public class Vovel_8 {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s  = sc.next();
		boolean res = false;
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||
					s.charAt(i)=='u' ||s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||
					s.charAt(i)=='O' ||s.charAt(i)=='U') {
				res = true;
			}
		}
		if(res) {
			System.out.println("Vovel is present in the String");
		}
		else
			System.out.println("Vovel is NOT present in the String");
	}

}
