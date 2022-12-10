class Student{
	String name;
	int rn;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRn() {
		return rn;
	}
	public void setRn(int rn) {
		this.rn = rn;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class A5Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student all[] = new Student[3];
		all[0] = new Student();
		all[0].setName("Rahul");
		all[0].setRn(1);
		all[0].setAge(20);
		
		all[1] = new Student();
		all[1].setName("Sammy");
		all[1].setRn(3);
		all[1].setAge(21);
		
		all[2] = new Student();
		all[2].setName("Manas");
		all[2].setRn(2);
		all[2].setAge(20);
		
		for(int i = 0; i<all.length-1; i++) {
			for(int j = 0; j<all.length-i-1; j++) {
				if(all[j].getRn()>all[j+1].getRn()) {
					Student temp = all[j];
					all[j] = all[j+1];
					all[j+1] = temp;
				}
			}
		}
		for(Student s : all) {
			System.out.println(s.getName()+ " "+ s.getAge()+ " "+ s.getRn());
		}
	}

}
