import java.util.Scanner;

public class matrixDivide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matrix1 row size: ");
		int r1 = sc.nextInt();
		System.out.println("Enter matrix1 col size: ");
		int c1 = sc.nextInt();
		System.out.println("Enter matrix2 row size: ");
		int r2 = sc.nextInt();
		System.out.println("Enter matrix2 col size: ");
		int c2 = sc.nextInt();
		if(c1!=r2) {
			System.out.println("Invalid Input");
		}
		else {
			int[][] mat1 = new int[r1][c1];
			int[][] mat2 = new int[r2][c2];
			
			System.out.println("Enter mat1 : ");
			for(int i = 0; i<r1; i++) {
				for(int j = 0; j<c1; j++) {
					mat1[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter mat2 : ");
			for(int i = 0; i<r2; i++) {
				for(int j = 0; j<c2; j++) {
					mat2[i][j] = sc.nextInt();
				}
			}
		}
		
	}

}
