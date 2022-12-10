
public class A5Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello I am Anonymous", res="";
		for(int i = 0; i<s.length(); i++) {
			StringBuffer sb = new StringBuffer();
			if(s.charAt(i)!=' ') {
				int j = i;
				while(i<s.length() && s.charAt(i)!=' ') {
					i++;
				}
				sb.append(s.substring(j, i));
				sb.reverse();
				res += sb.toString();
			}
			if(i<s.length())
				res += s.charAt(i);
		}
		System.out.println(res);
	}

}
