import java.util.*;
class p2{
	public static void main(String []args) {
//		System.out.println("Enter a number : ");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int a = 0, b = 1;
//		for(int i = 2; i<=n; i++) {
//			System.out.println(a+b);
//			a++;
//			b++;
//		}
		
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0, b = 1, sum =0;
		for(int i = 2, count = 0;  count<=n; i++) {
			if(i%2==0) {
				//System.out.println(a+b);
				sum += a+b;
				 count++;
			}
			a = b;
			b = i;
		}
		System.out.println(sum);
	}
}