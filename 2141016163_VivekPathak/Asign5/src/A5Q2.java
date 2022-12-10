
public class A5Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 1000110221, count = 0;
		while(n!=0) {
			count += n&1;
			n = n>>1;
		}
		System.out.println(count&1);
	}

}
