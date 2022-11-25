import java.util.HashSet;
import java.util.Scanner;
public class sameElement_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1: ");
		String s1 = sc.next();
		System.out.println("Enter String2");
		String s2 = sc.next();
		boolean res = true;
		for(int i = 0; i<s1.length(); i++) {
			if(s2.indexOf(s1.charAt(i))==-1)
				res = false;
		}
		for(int i = 0; i<s2.length(); i++) {
			if(s1.indexOf(s2.charAt(i))==-1)
				res = false;
		}
		System.out.println(res);
	}

}
