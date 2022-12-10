import java.util.Scanner;

public class A5Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter spreadsheet coloumn : ");
		String s  = sc.next();
		int res = 0;
		for(int i = 0; i<s.length(); i++) {
			res += ((s.charAt(s.length()-1-i))-64)*Math.pow(26, i);
		}
		System.out.println(res);
		
	}

}
