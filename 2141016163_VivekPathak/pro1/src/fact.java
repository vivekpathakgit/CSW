import java.util.Scanner;

class fact{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 1;
		int a = n;
		while(a>1) {
			ans = ans*a;
			a--;
		}
		System.out.println(ans);
	}
}