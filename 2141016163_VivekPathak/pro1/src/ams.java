import java.util.Scanner;

class ams{
	static long pow(int a, int n) {
		int p = a;
		for(int i = 1; i<n; i++) {
			p = p*a;
		}
		return p;
	}
	static int counter(int n) {
		if(n==0) {
			return 1;
		}
		int count = 0;
		while(n!=0) {
			count++;
			n = n/10;
		}
		return count;
	}
	static int amstrong(int n, int c) {
		int ams = 0;
		while(n!=0) {
			ams += pow(n%10, c);
			n = n/10;
		}
		return ams;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			int count = counter( i);
			int ams = amstrong( i, count);
			if(ams==i) {
				System.out.println(i);
			}
		}
		
	}
}