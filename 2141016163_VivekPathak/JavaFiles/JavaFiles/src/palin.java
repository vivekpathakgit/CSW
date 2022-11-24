
public class palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HelleH";
		int low = 0, high = s.length()-1;
		boolean isPalin = true;
		while(low<high) {
			if(s.charAt(low)!=s.charAt(high)) {
				isPalin = false; break;
			}
			low++; high--;	
		}
		if(isPalin) {
			System.out.println("String "+s+" is a Palindrome");
		}
		else
			System.out.println("String "+s+" is NOT a Palindrome");
	}

}
