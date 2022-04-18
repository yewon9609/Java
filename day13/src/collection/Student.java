package collection;

public class Student {
	int num;
	String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {return true;}
		if(obj instanceof Student) {
			Student std =(Student)obj;
			if(std.num==this.num) {
				return true;
			}
		}
		return false;
	}
	//equals를 재정의했다면 반드시 hashCode도 같이 재정의 해준다.
	@Override
	public int hashCode() {
		return num;
	}
	
	
}
