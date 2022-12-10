
public class A5Q4 {
	static int multiply(int a, int b) {
		   int result = 0;
		   while (b > 0) {
		      if ((b & 1)==1 ) {
		         result += a;
		         }
		      a = a << 1;
		      b = b >> 1;
		   }
		   return result;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4, b = 3;
		System.out.println(multiply(a,b));
	}

}
