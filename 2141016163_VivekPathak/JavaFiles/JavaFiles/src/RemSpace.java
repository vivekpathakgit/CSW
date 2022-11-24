
public class RemSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "He Is Harry", res = "";
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				res += s.charAt(i);
			}
		}
		System.out.println(res);
	}

}
