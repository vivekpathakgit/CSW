import java.util.*;
public class CountFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 29837929;
		int test = n;
		int arr[] = new int[10];
		for(int i = test; i>=0; i++) {
			arr[test%10]++;
			test = test/10;
		}
		System.out.println("Check freq of : ");
		int r = sc.nextInt();
		if(r/10!=0) 
			System.out.println("Invalid Input");
		
		else 
			System.out.println("Freq of "+ r + " is : "+ arr[r]);
	}

}
