
public class A5Q15 {
	static boolean isPrime(int n) {
		for(int i = 2; i<=n/2; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 43, 23, 3, 2, 22, 7, 34};
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(isPrime(arr[i]))
				count++;
		}
		System.out.println("No of Prime numbers : "+ count);
	}

}
