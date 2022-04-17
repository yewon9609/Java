package obj;

public class EqualsTask {
	public static void main(String[] args) {
		Student std = new Student(1,"한동석");
		//학생의 번호가 같다면 true가 나올 수 있도록 equals()를 재정의 하기
		//주소비교>타입비교> 다운캐스팅> 번호> true
		System.out.println(std.equals(new Student(1, "한동석")));
	}


}
