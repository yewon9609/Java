package collection.task2;

import java.util.ArrayList;

public class StudentField {
	//자료구조 DB
	public ArrayList<Student> students = new ArrayList<>();
	
	//학생 추가
	public void insert(Student std) {
		students.add(std);
	}
	
	//학생 점수 수정(이름)
	//이름이 동명 이인이라면(중복이 있다면) 목록을 출력해서
	//사용자가 선택한 번호의 학생의 점수를 수정한다.
	
						//전달받은 std를 이미 수정이 끝난 정보로 봐야한다.
	public boolean update(Student std) {
		for (int i = 0; i < students.size(); i++) {
			//전달받은 std의 번호와 DB에있는학생의 번호 비교 
			if(students.get(i).getNum() == std.getNum()) {
				//i번쨰있는 방의 정보를 std(수정이이미 끝난 정보)로 바꿔준다. 
				students.set(i, std);
				return true;
			}
		}
		return false;
	}
	
	//이름 검색
	//DB에서 이름을 조회한 후 검색된 모든 정보들을 리턴한다.
																//매개변수로 이름받아오기
	public ArrayList<Student> selectNames(String name) {
		//ArrayList 타입으로 리턴해줘야하니까 객체생성
		ArrayList<Student> students = new ArrayList<>();
		for (int i = 0; i < this.students.size(); i++) {
			if(this.students.get(i).getName().equals(name)) {
				//지역변수인 students에 if문에 들어온 i번째 학생을 추가해준다.
				//students 객체에는 동명이인이 들어가있음!!!!!!
				students.add(this. students.get(i));
			}
		}
		return students;
	}
	
	//번호 검색
	//이름으로 해당 학생의 번호를 검색한다.
	//이름이 중복이없을때(동명이인이 없을때)에만 사용가능한 메소드 
	//동명이인이면 번호가 2개 이상이나오니까 어떤게 자신의 번호인지 알수가없음(메소드 목적 상실)
	//그래서 중복이 없을때에만 사용가능하다 !
	public int getNumOfStudent(String name) {
		for (int i = 0; i < students.size(); i++) {
			if(students.get(i).getName().equals(name)) {
				return students.get(i).getNum();
			}
		}
		//이름으로 검색이안되면 -1로 리턴 (-1은 그냥 임의값임)
		return -1;
	}
	
	//학생 삭제(이름)
	//이름이 동명 이인이라면(중복이 있다면) 목록을 출력해서
	//사용자가 선택한 번호의 학생을 삭제한다.
	

	public boolean delete(int num) {
		boolean result = false;
		for (int i = 0; i < students.size(); i++) {
			if(students.get(i).getNum() == num) {
					//remove값으로 삭제하면 true,false로 리턴 됨
				result = students.remove(students.get(i));
			}
		}
		return result;
	}
	
	//학생 목록(전체)
	public ArrayList<Student> selectAll() {
		//굳이 객체를 생성할 필요 없지만 외부에 DB가 있다고 가정하고 만들자!
		ArrayList<Student> students = new ArrayList<>();
		for (int i = 0; i < this.students.size(); i++) {
			//현재 DB에 있는 전체 학생을 겍체에 담아준다.
			students.add(this.students.get(i));
		}
		return students;
	}
	
	//학생 검색(번호)
	public Student getStudent(int num) {
		Student student = null;
		for (int i = 0; i < students.size(); i++) {
			//DB에 있는 학생의 num과 입력받은 num이 같다면 객체에 그 학생의 정보를 담아줌
			if(students.get(i).getNum() == num) {
				student = students.get(i);
			}
		}
		return student;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
