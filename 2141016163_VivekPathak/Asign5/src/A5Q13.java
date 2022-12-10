
public class A5Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2324542;
		int arr[] = new int[10];
		while(n!=0) {
			arr[n%10]++;
			n = n/10;
		}
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]!=0) {
				System.out.println("Frequency of "+ i +" is : "+ arr[i]);
			}
		}
	}

}
