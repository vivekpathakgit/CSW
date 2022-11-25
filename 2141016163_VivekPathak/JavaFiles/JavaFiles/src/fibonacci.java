import java.util.Scanner;

public class fibonacci {
	public static void fibo (int n, int i1, int i2, int count) {
		if(count==n) {
			return;
		}
		System.out.println(i1);
		int c = i1+i2;
		i1 = i2;
		i2 = c;
		fibo(n, i1, i2, ++count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the nth term: ");
			int n = sc.nextInt();
			 fibo(n, 0, 1, 0);
	}

}
