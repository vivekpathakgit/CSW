import java.util.Scanner;

public class revWrds_19 {
	static void PrintRev(String s, int i, int li) {
		while(i>=li) {
			System.out.println(s.charAt(i));
			i--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		int li = 0;
		for(int i = 0 ; i<s.length(); i++) {
			if(s.charAt(i)==' ') {
				PrintRev(s, i, li);
				
			}
			else
		}
	}

}
