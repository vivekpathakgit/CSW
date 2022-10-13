class p1{
	public static void main (String[]args) {
		//With variable : 
		int a = 4, b = 6;
		System.out.println("a = "+a + ", b = "+b);
		int c = a;
		a = b;
		b = c;
		System.out.println("a = "+a + ", b = "+b);
		
		//Without variable : 
		a = 4; b = 6;
		System.out.println("a = "+a + ", b = "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a = "+a + ", b = "+b);
	}
}