
public class sudukoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{4,3,5,2,6,9,7,8,1}, {4,8,2,5,7,1,6,9,3},{1,9,7,8,3,4,5,6,2}, {8,2,6,1,9,5,3,4,7},{3,7,4,6,8,2,9,1,5},{9,5,1,7,4,3,6,2,8},{5,1,9,3,2,6,8,7,4},{2,4,8,9,5,7,1,3,6},{7,6,3,4,1,8,2,5,9}};
		int n = 9;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Matrix 1 : ");
		for(int k = 0; k<=2; k++){
			for(int l = 0; l<=2; l++) {
				System.out.print(mat[k][l]);
			}
			System.out.println();
		}
		System.out.println("Matrix 2 : ");
		for(int k = 0; k<=2; k++){
			for(int l = 3; l<=5; l++) {
				System.out.print(mat[k][l]);
			}
			System.out.println();
		}
		System.out.println("Matrix 3 : ");
		for(int k = 0; k<=2; k++){
			for(int l = 6; l<=8; l++) {
				System.out.print(mat[k][l]);
			}
			System.out.println();
		}
		System.out.println("Matrix 4 : ");
		for(int k = 3; k<=5; k++){
			for(int l = 0; l<=2; l++) {
				System.out.print(mat[k][l]);
			}
			System.out.println();
		}
		System.out.println("Matrix 5 : ");
		for(int k = 3; k<=5; k++){
			for(int l = 3; l<=5; l++) {
				System.out.print(mat[k][l]); 
			}
			System.out.println();
		}
		System.out.println("Matrix 6 : ");
		for(int k = 3; k<=5; k++){
			for(int l = 6; l<=8; l++) {
				System.out.print(mat[k][l]);
			}
			System.out.println();
		}
		System.out.println("Matrix 7 : ");
		for(int k = 6; k<=8; k++){
			for(int l = 0; l<=2; l++) {
				System.out.print(mat[k][l]);
			}
		}
		System.out.println("Matrix 8 : ");
		for(int k = 6; k<=8; k++){
			for(int l = 3; l<=5; l++) {
				System.out.print(mat[k][l]);
			}
			System.out.println();
		}
		System.out.println("Matrix 9 : ");
		for(int k = 6; k<=8; k++){
			for(int l = 6; l<=8; l++) {
				System.out.print(mat[k][l]);
			}
			System.out.println();
		}
		
	}

}
