
public class spiralTrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Enter sum from : ");
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		int indx1 = 0;
		int indx2 = 0;
		int s1 = indx1, e1 = mat.length-1, s2 = indx2, e2 = mat[0].length-1, in =0, sum = 0; 
		while(in<mat.length*mat[0].length) {
			for(int i = s2; i<=e2; i++) {
				
				System.out.println(mat[s1][i]);
				in++;
			}
			s1++;
			for(int i = s1; i<=e1; i++) {
				System.out.println(mat[i][e2]);
				in++;
			}
			e2--;
			for(int i = e2; i>=s2; i--) {
				System.out.println(mat[e1][i]);
				in++;
			}
			e1--;
			for(int i =e1; i>=s1; i-- ) {
				System.out.println(mat[i][s2]);
				in++;
			}
			s2++;
		}
	}

}
