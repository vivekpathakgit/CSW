import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter matrix row size: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat1 = new int[n][n];
		int[][] mat2 = new int[n][n];
		System.out.println("Enter mat1 : ");
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter mat2 : ");
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}
		int [][] matRes = new int[n][n];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				System.out.print(mat1[i][j]+mat2[i][j]);
			}
			System.out.println();
		}
	}

}
