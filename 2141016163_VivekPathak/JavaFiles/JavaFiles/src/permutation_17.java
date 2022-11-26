import java.util.Arrays;
import java.util.Scanner;

public class permutation_17 {
	static int factorail
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.next();
//		char arr [][] = new char[s.length()][2];
		char arr[] = new char[s.length()];
		for(int i = 0; i<s.length(); i++) {
			arr[i] = s.charAt(i);
		}
		Arrays.sort(arr);
		
	}

}
