import java.util.Scanner;

public class matrixMultiply3 {

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
		System.out.println("Enter matrix2 row size: ");
		int r3 = sc.nextInt();
		System.out.println("Enter matrix2 col size: ");
		int c3 = sc.nextInt();
		if(c1!=r2) {
			System.out.println("Invalid Input");
		}
		else {
			int[][] mat1 = new int[r1][c1];
			int[][] mat2 = new int[r2][c2];
			int[][] matMid = new int [r1][c2];
			int[][] mat3 = new int[r3][c3];
			System.out.println("mat1 : ");
			for(int i = 0; i<r1; i++) {
				for(int j = 0; j<c1; j++) {
					mat1[i][j] = (int) (1+ Math.random()*9);
					System.out.println(mat1[i][j]);
				}
			}
			System.out.println("mat2 : ");
			for(int i = 0; i<r2; i++) {
				for(int j = 0; j<c2; j++) {
					mat2[i][j] = (int) (1+ Math.random()*9);
					System.out.println(mat2[i][j]);
				}
			}
			System.out.println("mat3 : ");
			for(int i = 0; i<r3; i++) {
				for(int j = 0; j<c3; j++) {
					mat3[i][j] = (int) (1+ Math.random()*9);
					System.out.println(mat3[i][j]);
				}
			}
			for(int i = 0; i<r1; i++) {
				for(int j = 0; j<c2; j++) {
					int res = 0;
					for(int k = 0; k<c1; k++) {
						res += mat1[i][k]*mat2[k][j];
					}
					matMid[i][j] = res;
					System.out.print(res+" ");
				}
				System.out.println();
			}
			for(int i = 0; i<r1; i++) {
				for(int j = 0; j<c3 ; j++) {
					int res = 0;
					for(int k = 0; k<c2; k++) {
						res += mat1[i][k]*mat2[k][j];
					}
					System.out.print(res+" ");
				}
				System.out.println();
			}
		}
		
		
	}

}
