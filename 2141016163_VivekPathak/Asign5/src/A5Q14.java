
public class A5Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 232, 22, 12, 22, 22, 34, 34};
		boolean visited[] = new boolean[arr.length];
		for(int i = 0; i<arr.length; i++) {
			int count = 1;
			if(!visited[i]) {
				for(int j = i+1; j<arr.length; j++) {
					if(arr[i]==arr[j]) {
						count++;
						visited[j] = true;
					}
						
				}
				System.out.println("Frequency of "+ arr[i]+ " is : "+ count);
			}
		}
	}

}
