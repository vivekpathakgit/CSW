import java.util.Scanner;

public class removeOcurr_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a charecter: ");
		char a = sc.next().charAt(0);
		System.out.println("Enter a String: ");
		String s = sc.next(), res ="";
		
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i)!=a) {
				res += s.charAt(i);
			}
		}
		System.out.println(res);
		
	}

}
