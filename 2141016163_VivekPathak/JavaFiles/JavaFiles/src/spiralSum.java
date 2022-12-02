import java.util.Scanner;

public class spiralSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter square matrix size: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				mat[i][j] =(int) (1+ Math.random()*9);
			}
		}
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Enter corner Index : ");
		int indx1 = sc.nextInt();
		int indx2 = sc.nextInt();
		System.out.println("Enter 1 : (for clockwise) or 2 : (for anti-clockwise)");
		int c = sc.nextInt();
		if(indx1==0 && indx2==0 && c==1) {
			int s1 = 0, e1 = mat.length-1, s2 =0, e2 = mat[0].length-1, in =0; 
			while(in<mat.length*mat[0].length) {
				for(int i = s2; i<=e2; i++) {
					System.out.print(mat[s1][i] );
					in++;
				}
				s1++;
				for(int i = s1; i<=e1; i++) {
					System.out.print(mat[i][e2] );
					in++;
				}
				e2--;
				for(int i = e2; i>=s2; i--) {
					System.out.print(mat[e1][i] );
					in++;
				}
				e1--;
				for(int i =e1; i>=s1; i-- ) {
					System.out.print(mat[i][s2] );
					in++;
				}
				s2++;
			}
		}
		else if(indx1==0 && indx2==mat[0].length-1 && c==1) {
			int s1 = 0, e1 = mat.length-1, s2 = 0, e2 = mat[0].length-1, in =0; 
			while(in<mat.length*mat[0].length) {
				for(int i = s1; i<=e1; i++) {
					System.out.print(mat[i][e2] );
					in++;
				}
				e2--;
				for(int i = e2; i>=s2; i--) {
					System.out.print(mat[e1][i] );
					in++;
				}
				e1--;
				for(int i =e1; i>=s1; i-- ) {
					System.out.print(mat[i][s2] );
					in++;
				}
				s2++;
				for(int i = s2; i<=e2; i++) {
					System.out.print(mat[s1][i] );
					in++;
				}
				s1++;
			}
		}
		else if(indx1==mat.length-1 && indx2==mat[0].length-1 && c==1) {
			int s1 =0, e1 = mat.length-1, s2 = 0, e2 = mat[0].length-1, in =0; 
			while(in<mat.length*mat[0].length) {
				for(int i = e2; i>=s2; i--) {
					System.out.print(mat[e1][i] );
					in++;
				}
				e1--;
				for(int i =e1; i>=s1; i-- ) {
					System.out.print(mat[i][s2] );
					in++;
				}
				s2++;
				for(int i = s2; i<=e2; i++) {
					System.out.print(mat[s1][i] );
					in++;
				}
				s1++;
				for(int i = s1; i<=e1; i++) {
					System.out.print(mat[i][e2] );
					in++;
				}
				e2--;
				
				
			}
		}
		else if(indx1==mat.length-1 && indx2==0 && c==1) {
			int s1 = 0, e1 = mat.length-1, s2 =0, e2 = mat[0].length-1, in =0; 
			while(in<mat.length*mat[0].length) {
				for(int i =e1; i>=s1; i-- ) {
					System.out.print(mat[i][s2] );
					in++;
				}
				s2++;
				for(int i = s2; i<=e2; i++) {
					System.out.print(mat[s1][i] );
					in++;
				}
				s1++;
				for(int i = s1; i<=e1; i++) {
					System.out.print(mat[i][e2] );
					in++;
				}
				e2--;
				for(int i = e2; i>=s2; i--) {
					System.out.print(mat[e1][i] );
					in++;
				}
				e1--;
				
			}
		}
		else if(indx1==0 && indx2==0 && c==2) {
			int s1 = 0, e1 = mat.length-1, s2 =0, e2 = mat[0].length-1, in =0; 
			while(in<mat.length*mat[0].length) {
				for(int i = s1; i<=e1; i++) {
					System.out.print(mat[i][s2] );
					in++;
				}
				s2++;
				for(int i = s2; i<=e2; i++) {
					System.out.print(mat[e1][i] );
					in++;
				}
				e1--;
				for(int i =e1; i>=s1; i-- ) {
					System.out.print(mat[i][e2] );
					in++;
				}
				e2--;
				for(int i = e2; i>=s2; i--) {
					System.out.print(mat[s1][i] );
					in++;
				}
				s1++;
				
			}
		}
		else if(indx1==0 && indx2==mat[0].length-1 && c==2) {
			int s1 = 0, e1 = mat.length-1, s2 = 0, e2 = mat[0].length-1, in =0; 
			while(in<mat.length*mat[0].length) {
				for(int i = e2; i>=s2; i--) {
					System.out.print(mat[s1][i] );
					in++;
				}
				s1++;
				for(int i = s1; i<=e1; i++) {
					System.out.print(mat[i][s2] );
					in++;
				}
				s2++;
				for(int i = s2; i<=e2; i++) {
					System.out.print(mat[e1][i] );
					in++;
				}
				e1--;
				for(int i =e1; i>=s1; i-- ) {
					System.out.print(mat[i][e2] );
					in++;
				}
				e2--;
				
			}
		}
		else if(indx1==mat.length-1 && indx2==mat[0].length-1 && c==2) {
			int s1 =0, e1 = mat.length-1, s2 = 0, e2 = mat[0].length-1, in =0; 
			while(in<mat.length*mat[0].length) {
				
				for(int i =e1; i>=s1; i-- ) {
					System.out.print(mat[i][e2] );
					in++;
				}
				e2--;
				for(int i = e2; i>=s2; i--) {
					System.out.print(mat[s1][i] );
					in++;
				}
				s1++;
				for(int i = s1; i<=e1; i++) {
					System.out.print(mat[i][s2] );
					in++;
				}
				s2++;
				for(int i = s2; i<=e2; i++) {
					System.out.print(mat[e1][i] );
					in++;
				}
				e1--;
			}
		}
		else if(indx1==mat.length-1 && indx2==0 && c==2) {
			int s1 = 0, e1 = mat.length-1, s2 =0, e2 = mat[0].length-1, in =0; 
			while(in<mat.length*mat[0].length) {
				for(int i =e1; i>=s1; i-- ) {
					System.out.print(mat[i][e2] );
					in++;
				}
				e2--;
				for(int i = s2; i<=e2; i++) {
					System.out.print(mat[e1][i] );
					in++;
				}
				e1--;
				for(int i = s1; i<=e1; i++) {
					System.out.print(mat[i][s2] );
					in++;
				}
				s2++;
				for(int i = e2; i>=s2; i--) {
					System.out.print(mat[s1][i] );
					in++;
				}
				s1++;
			}
		}
		else {
			System.out.println("Invalid Input!!");
		}

	}

}
