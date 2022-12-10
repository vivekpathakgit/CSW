class Num{
	int [] arr;

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public int[] reverse(int [] arr) {
		int res[] = new int[arr.length];
		for(int i = arr.length-1; i>=0; i--) {
			res[arr.length-i-1] = arr[i];
		}
		return res;
	}
}
public class A5Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num n = new Num();
		n.setArr(new int[4]);
		n.arr[0] = 3;
		n.arr[1] = 4;
		n.arr[2] = 1;
		n.arr[3] = 6;
		int result[] = n.reverse(n.getArr());
		for(int e : result) {
			System.out.println(e);
		}
	}

}
