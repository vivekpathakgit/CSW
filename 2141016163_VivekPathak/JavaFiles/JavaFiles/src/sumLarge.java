import java.util.Scanner;

public class sumLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int carry = 0;
		int i1 = s1.length()-1, i2 = s2.length()-1;
		String res = "";
		while(i1>=0 && i2>=0) {
			res =(char)((carry + s1.charAt(i1)+s2.charAt(i2) - 2*48)%10+48) + res ;
			carry = (carry + s1.charAt(i1--)+s2.charAt(i2--)-2*48)/10;
		}
		while(i1>=0) {
			res = ((char)((carry + s1.charAt(i1)-48)%10 +48)) + res;
			carry = (carry + s1.charAt(i1--) - 48)/10;
		}
		while(i2>=0) {
			res = ((char)((carry + s2.charAt(i2)-48)%10+48))+ res;
			carry = (carry + s1.charAt(i2--)- 48 )/10;
		}
		System.out.println(res);
	}

}
