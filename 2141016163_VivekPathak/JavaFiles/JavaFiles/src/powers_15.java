import java.util.Scanner;

public class powers_15 {
	static int power (int x , int y, int count, int c) {
		if(y==0) {
			return 1;
		}
		if(count==y) {
			return x;
		}
		return power(x*c, y, ++count, c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x, y, z : ");
		int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
		int yPz = power(y, z, 1, y);
		System.out.println(yPz);
		int res = power(x, yPz, 1, x);
		System.out.println(res);
	}

}
