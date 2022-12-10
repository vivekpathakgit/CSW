
public class A5Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 43, 23, 3, 2, 22, 7, 34};
		int i = 0, j = arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
		}
		for(int e : arr)
			System.out.print(e+" ");
	}

}
