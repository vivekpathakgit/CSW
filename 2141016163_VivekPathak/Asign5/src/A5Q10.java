import java.util.Scanner;

public class A5Q10 {
	static int toDecimal(int n, int base1) {
		int res = 0, i = 0;
		while(n!=0) {
			res += n%10*Math.pow(base1, i++);
			n = n/10;
		}
		return res;
	}
	static int desiredBase(int n, int base2) {
		int res = 0, i = 0;
		while(n!=0) {
			res += n%base2*Math.pow(base2, i++);
			n = n/10;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		System.out.println("Enter base1 : ");
		int base1 = sc.nextInt();
		System.out.println("Enter base2 : ");
		int base2 = sc.nextInt();
		System.out.println(desiredBase(toDecimal(n, base1), base2));
		
	}	

}
