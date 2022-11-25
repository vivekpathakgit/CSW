import java.util.Scanner;

public class odd_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the strength of array");
		int n = sc.nextInt();
		int [] a = new int [n];
		boolean res = true;
		System.out.println("Enter "+n+ " values :");
		for(int i = 0; i<a.length; i++) {
			a[i]= sc.nextInt();
			if(a[i]%2!=1)
				res = false;
		}
		System.out.println(res);
	}

}
