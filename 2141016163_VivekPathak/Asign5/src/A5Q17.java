import java.util.ArrayList;

public class A5Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,2,3,5,6,6,6,8,34,55,55};
		ArrayList<Integer> res = new ArrayList<>();
		for(int i = 0; i<arr.length; i++) {
			res.add(arr[i]);
			while(i<arr.length-1 && arr[i+1]==arr[i])
				i++;
		}
		for(int e : res) {
			System.out.print(e+" ");
		}
	}

}
