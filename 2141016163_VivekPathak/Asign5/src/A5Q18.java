
public class A5Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {2,3,44,56,77};
		int arr2[] = {4,5,45,66};
		int res[] = new int[arr1.length+arr2.length];
		int i = 0, j = 0, r = 0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) 
				res[r++] = arr1[i++];
			else
				res[r++] = arr2[j++];
		}
		while(i<arr1.length) {
			res[r++] = arr1[i++];
		}
		while(j<arr2.length) {
			res[r++] = arr2[j++];
		}
		for(int e : res)
			System.out.print(e+ " ");
	}

}
