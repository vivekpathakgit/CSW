import java.util.Scanner;

public class suduko2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int n = 9;
				//int[][] mat1 = new int[n][n];
				
				
				int mat[][] = {{4,3,5,2,6,9,7,8,1}, {6,8,2,5,7,1,4,9,3},{1,9,7,8,3,4,5,6,2}, {8,2,6,1,9,5,3,4,7},{3,7,4,6,8,2,9,1,5},{9,5,1,7,4,3,6,2,8},{5,1,9,3,2,6,8,7,4},{2,4,8,9,5,7,1,3,6},{7,6,3,4,1,8,2,5,9}};
//				int mat[][] = {{1,2,3,4,5,6,7,8,9}, {9,1,2,3,4,5,6,7,8},{8,9,1,2,3,4,5,6,7}, {7,8,9,1,2,3,4,5,6},{6,7,8,9,1,2,3,4,5},{5,6,7,8,9,1,2,3,4},{4,5,6,7,8,9,1,2,3},{3,4,5,6,7,8,9,1,2},{2,3,4,5,6,7,8,9,1}};
				boolean valid = true;
				for(int i = 0; i<n; i++) {
					for(int j = 0; j<n; j++) {
						System.out.print(mat[i][j] + " ");
						if(!(mat[i][j]>=1 && mat[i][j]<=9))
							valid = false;
					}
					System.out.println();
				}
				if(valid) {
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
						int arr1 [] = new int[10];
						for(int j = 0; j<n; j++) {
							if(arr1[mat[j][i]]>=1) {
								res = false;
								System.out.println(i+" "+j+" "+mat[j][i]);
							}
								
							else 
								arr1[mat[j][i]]++;
						}
					}
					int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, sum6 = 0, sum7 = 0, sum8 = 0, sum9 = 0;
					for(int i = 0; i<n; i++) {
						for(int j = 0; j<n; j++) {
							if(i>=0 && i<=2) {
								if(j>=0 && j<=2) {
									sum1 += mat[i][j];
								}
								if(j>=3 && j<=5) {
									sum2 += mat[i][j];
								}
								if(j>=6 && j<=8) {
									sum3 += mat[i][j];
								}
							}
							if(i>=3 && i<=5) {
								if(j>=0 && j<=2) {
									sum4 += mat[i][j];
								}
								if(j>=3 && j<=5) {
									sum5 += mat[i][j];
								}
								if(j>=6 && j<=8) {
									sum6 += mat[i][j];
								}
							}
							if(i>=6 && i<=8) {
								if(j>=0 && j<=2) {
									sum7 += mat[i][j];
								}
								if(j>=3 && j<=5) {
									sum8 += mat[i][j];
								}
								if(j>=6 && j<=8) {
									sum9 += mat[i][j];
								}
							}
						}
					}
					if(sum1!=45 || sum2 !=45 || sum3 !=45 || sum4 !=45 || sum5 !=45 || sum6 !=45 || sum7 !=45 || sum8 !=45 || sum9 !=45)
						res = false;
					System.out.println(res);
				}
				else {
					System.out.println("Enter valid input!");
				}
	}

}
