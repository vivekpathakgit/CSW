
public class A5Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello I am Anonymous";
		int count = 0;
		for(int i =0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') {
				count++;
				while(i<s.length() && s.charAt(i)!=' ')
					i++;
			}
		}
		System.out.println(count);
		
	}

}
