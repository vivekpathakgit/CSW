import java.util.Arrays;
import java.util.Scanner;

public class findAngrams_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1: ");
		String s1 = sc.next().toLowerCase();
		System.out.println("Enter String2");
		String s2 = sc.next().toLowerCase();
		char arr1[] = new char[s1.length()];
		char arr2[] = new char[s2.length()];
		boolean res = true;
		if(s1.length()!=s2.length()) {
			System.out.println("Invalid Inputs. (Please keep string length same)");
		}
		else {
			
			for(int i = 0; i<s1.length(); i++) {
				arr1[i] = s1.charAt(i);
				arr2[i] = s2.charAt(i);
			}
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for(int i = 0; i<s1.length(); i++) {
				if(arr1[i]!=arr2[i])
					res = false;
			}
			if(res) {
				System.out.println("Is a valid anagrams");
			}
			else {
				System.out.println("Is NOT a valid anagram");
			}
		}
		
	}

}
