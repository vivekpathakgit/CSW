import java.util.Scanner;

public class A5Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = sc.next();
		System.out.println("Enter DOB (ddmmyyy) : ");
		String date = sc.next();
		char a =(char) (64+ Math.random()*20), b = (char) (64+ Math.random()*20), c =(char) (64+ Math.random()*100);
		String password  =""+ name.charAt(0)+ a + name.charAt(1) + c+ date.charAt(2)+ date.charAt(3);
		System.out.println("Password : " + password);
	}

}
