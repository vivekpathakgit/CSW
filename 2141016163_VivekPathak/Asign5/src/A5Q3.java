import java.util.Scanner;

public class A5Q3 {
	static String toBinary(long n) {
		String s = "";
		while(n!=0) {
			s = n%2 + s;
			n = n/2;
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = 1000110221;
		System.out.println("Enter ith index and jth index : ");
		int i = sc.nextInt(), j = sc.nextInt();
		String s = toBinary(n);
		System.out.println("Before swap : "+s);
		s = s.substring(0,i)+s.charAt(j)+s.substring(i+1,j)+s.charAt(i)+s.substring(j+1, s.length());
		System.out.println("After swap :  " + s);
	}

}
