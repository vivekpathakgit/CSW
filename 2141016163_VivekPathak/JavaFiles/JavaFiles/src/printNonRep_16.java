import java.util.Scanner;

public class printNonRep_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String inn = sc.next();
		for(int i = 0; i<inn.length(); i++) {
			boolean isUnique = true;
			for(int j = i+1; j<inn.length(); j++) 
				if(inn.charAt(i)==inn.charAt(j))
					isUnique = false;
			
			for(int j = 0; j<i; j++)
				if(inn.charAt(i)==inn.charAt(j))
					isUnique = false;
			if(isUnique) 
				System.out.println(inn.charAt(i));
		}
	}

}
