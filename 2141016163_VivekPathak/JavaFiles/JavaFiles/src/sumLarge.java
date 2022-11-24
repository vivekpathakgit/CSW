import java.util.Scanner;

public class sumLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int carry = 0;
		int i1 = s1.length(), i2 = s2.length();
		String res = "";
		while(i1>=0 && i2>=0) {
			res +=(char)(carry + s1.charAt(i1)+s2.charAt(i2))%10 ;
			carry = (carry + s1.charAt(i1)+s2.charAt(i2))/10;
		}
		while(i1>=0) {
			res += (char)(carry + s1.charAt(i1))%10;
			carry = (carry + s1.charAt(i1))/10;
		}
		while(i2>=0) {
			res += (char)(carry + s1.charAt(i2))%10;
			carry = (carry + s1.charAt(i2))/10;
		}
		String res2 = "";
		for(int i = res.length()-1; i>=0; i--) {
			res2 += res.charAt(i);
		}
	}

}
