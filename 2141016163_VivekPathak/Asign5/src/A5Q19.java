import java.util.Scanner;

public class A5Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,4,5,6};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element : ");
		int e = sc.nextInt();
		System.out.println("Enter a position : ");
		int p = sc.nextInt();
		int res[] = new int[arr.length+1];
		for(int i = 0; i<res.length; i++) {
			if(i<p)
				res[i] = arr[i];
			else if(i==p)
				res[i] = e;
			else
				res[i] = arr[i-1];
			System.out.print(res[i]+" ");
		}
	}

}
