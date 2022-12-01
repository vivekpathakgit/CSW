import java.util.Scanner;

public class suduko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 9;
		//int[][] mat1 = new int[n][n];
		
		
		//int mat[][] = {{4,3,5,2,6,9,7,8,1}, {6,8,2,5,7,1,4,9,3},{1,9,7,8,3,4,5,6,2}, {8,2,6,1,9,5,3,4,7},{3,7,4,6,8,2,9,1,5},{9,5,1,7,4,3,6,2,8},{5,1,9,3,2,6,8,7,4},{2,4,8,9,5,7,1,3,6},{7,6,3,4,1,8,2,5,9}};
		int mat[][] = {{4,3,5,2,6,9,7,8,1}, {4,8,2,5,7,1,6,9,3},{1,9,7,8,3,4,5,6,2}, {8,2,6,1,9,5,3,4,7},{3,7,4,6,8,2,9,1,5},{9,5,1,7,4,3,6,2,8},{5,1,9,3,2,6,8,7,4},{2,4,8,9,5,7,1,3,6},{7,6,3,4,1,8,2,5,9}};
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		boolean res = true;
		
		for(int i = 0; i<n; i++) {
			int arr [] = new int[10];
			for(int j = 0; j<n; j++) {
				if(arr[mat[i][j]]>=1)
					res = false;
				else 
					arr[mat[i][j]]++;
			}
		}
		for(int i = 0; i<n; i++) {
			int arr [] = new int[10];
			for(int j = 0; j<n; j++) {
				if(arr[mat[j][i]]>=1)
					res = false;
				else 
					arr[mat[i][j]]++;
			}
		}
//		for(int i = 0; i<n; i++) {
//			for(int j = 0; j<n; j++) {
//				if(i>=0 && i<=2) {
//					if(j>=0 && j<=2) {
//						for(int k = 0; k<=2; k++){
//							for(int l = 0; l<=2; l++) {
//								if(k==i && l==j)
//									continue;
//								if(mat[i][j]==mat[k][l])
//									res = false;
//							}
//						}
//					}
//					if(j>=3 && j<=5) {
//						for(int k = 0; k<=2; k++){
//							for(int l = 3; l<=5; l++) {
//								if(k==i && l==j)
//									continue;
//								if(mat[i][j]==mat[k][l])
//									res = false;
//							}
//						}
//					}
//					if(j>=6 && j<=8) {
//						for(int k = 0; k<=2; k++){
//							for(int l = 6; l<=8; l++) {
//								if(k==i && l==j)
//									continue;
//								if(mat[i][j]==mat[k][l])
//									res = false;
//							}
//						}
//					}
//				}
//				if(i>=3 && i<=5) {
//					if(j>=0 && j<=2) {
//						for(int k = 3; k<=5; k++){
//							for(int l = 0; l<=2; l++) {
//								if(k==i && l==j)
//									continue;
//								if(mat[i][j]==mat[k][l])
//									res = false;
//							}
//						}
//					}
//					if(j>=3 && j<=5) {
//						for(int k = 3; k<=5; k++){
//							for(int l = 3; l<=5; l++) {
//								if(k==i && l==j)
//									continue;
//								if(mat[i][j]==mat[k][l])
//									res = false;
//							}
//						}
//					}
//					if(j>=6 && j<=8) {
//						for(int k = 3; k<=5; k++){
//							for(int l = 6; l<=8; l++) {
//								if(k==i && l==j)
//									continue;
//								if(mat[i][j]==mat[k][l])
//									res = false;
//							}
//						}
//					}
//				}
//				if(i>=6 && i<=8) {
//					if(j>=0 && j<=2) {
//						for(int k = 6; k<=8; k++){
//							for(int l = 0; l<=2; l++) {
//								if(k==i && l==j)
//									continue;
//								if(mat[i][j]==mat[k][l])
//									res = false;
//							}
//						}
//					}
//					if(j>=3 && j<=5) {
//						for(int k = 6; k<=8; k++){
//							for(int l = 3; l<=5; l++) {
//								if(k==i && l==j)
//									continue;
//								if(mat[i][j]==mat[k][l])
//									res = false;
//							}
//						}
//					}
//					if(j>=6 && j<=8) {
//						for(int k = 6; k<=8; k++){
//							for(int l = 6; l<=8; l++) {
//								if(k==i && l==j)
//									continue;
//								if(mat[i][j]==mat[k][l])
//									res = false;
//							}
//						}
//					}
//				}
//			}
//		}
		System.out.println(res);
	}

}
