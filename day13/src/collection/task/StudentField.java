package collection.task;

import java.util.ArrayList;

public class StudentField {
	//자료구조 DB
	public ArrayList<Student> students = new ArrayList<>();
	//학생 추가
	//학생 한 명이 추가 될 때 마다 번호는 자동으로 증가된다.
	//이름 입력받고, 번호 부여하기, 점수입력받기
	public void insert(Student std) {
		students.add(std);
	}
	
	
	//학생 점수 수정(이름)
	//이름이 동명 이인이라면 (중복이 있다면) 목록을 출력해서
	//사용자가 선택한 번호(1번홍길동인지 , 2번홍길동인지 )의 학생의 점수를 수정한다.
	public boolean update(Student std) {
		for (int i = 0; i < students.size(); i++) {
			if(students.get(i).getNumber()==std.getNumber()) {
				students.set(i, std);
				return true;
			}
		}
		return false;
		
		
		
	}
	
	//이름 검색 메소드 
	//DB에서 이름을 조회한 후 검색된 모든 정보들을 리턴한다.
	public ArrayList<Student> selectNames(String name) {
		ArrayList<Student> students = new ArrayList<>();
		for (int i = 0; i <this.students.size(); i++) {
			if(this.students.get(i).getName().equals(name)) {
				//지역변수인 students에 if문에 들어온 i번째 학생을 추가해준다.
				//students엔 동명이인이담긴다.
				students.add(this.students.get(i));
			}
		}
		return students;
	}
	
	
	//번호 검색
	//이름으로 해당 학생의 번호를 검색한다.
	public int getNumOfStudent(String name) {
		for (int j = 0; j < students.size(); j++) {
		if(students.get(j).getName().equals(name)) {
			return students.get(j).getNumber();
		}
		}
		return -1;
	}
	
	//학생 삭제(이름)
	//이름이 동명 이인이라면 (중복이 있다면) 목록을 출력해서
	//사용자가 선택한 번호(1번홍길동인지 , 2번홍길동인지 )의 학생을 삭제한다.
	public boolean delete(int num) {
		boolean result = false;
		for (int i = 0; i < students.size(); i++) {
			if(students.get(i).getNumber()==num) {
				result = students.remove(students.get(i));
				
			}
		}
		return result;
	}
	
	//학생 목록(전체)
	public ArrayList<Student> selectAll() {
		ArrayList<Student>students = new ArrayList<>();
		for (int i = 0; i < students.size(); i++) {
			students.add(this.students.get(i));
		}
		return students;
	}
	
	//학생 검색(번호)
	public Student getStudent(int num) {
		Student student = null;
		for (int i = 0; i < students.size(); i++) {
			if(students.get(i).getNumber() == num) {
				student= students.get(i);
			}
		}
		return student;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
