import java.util.Scanner;

public class checkPrime_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		boolean res = true;
		int x = sc.nextInt();
		for(int i = 2; i<x; i++) {
			if(x%i==0) {
				res = false;
			}
		}
		System.out.println(res);
	}

}
