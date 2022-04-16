package obj;

public class Student {
	int num;
	String name;
	
	public Student() {;	}
	
	
	
	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}



	public Student(String name) {
		super();
		this.name = name;
	}
	 @Override
	 public String toString() {
	 	return "이름: " + name;
	 }
	 	
	 @Override
	//학생의 번호가 같다면 true가 나올 수 있도록 equals()를 재정의 하기
			//주소비교>타입비교> 다운캐스팅> 번호> true
	public boolean equals(Object obj) {
		 //주소비교 (==)
		 if(this==obj) {
			 return true;
		 }
		 //타입비교
		 if(this instanceof Student) {
			 Student anotherStudent = (Student)obj;	//다운캐스팅
			 if(num==anotherStudent.num) {	//번호 비교
				 return true;
			 }else {
				 return false;
			 }
			 
		 }
		return super.equals(obj);
	}
	
}
