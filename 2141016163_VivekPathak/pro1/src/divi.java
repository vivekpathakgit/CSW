import java.util.Scanner;

class divi{
	static boolean isPrime(int n ) {
		for(int i = 2; i<=n/2; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =2; i<=n; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
}