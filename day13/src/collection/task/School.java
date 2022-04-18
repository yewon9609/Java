package collection.task;

import java.util.ArrayList;
import java.util.Scanner;

//구현하는 클래스
public class School {
	public static void main(String[] args) {
		StudentField sf = new StudentField();
		Scanner sc = new Scanner(System.in);
		
		Student std1 =new Student("홍길동");
		Student std2 =new Student("홍길동");
		
		int[] arScore1 = {50, 60, 88};
		int[] arScore2 = {80, 70, 78};
		
		std1.setArScore(arScore1);
		std2.setArScore(arScore2);
		
		//학생추가
		//학생 한 명이 추가 될 때 마다 번호는 자동으로 증가된다.
		//이름 입력받고, 번호 부여하기, 점수입력받기
		
		sf.insert(std1);
		sf.insert(std2);
		
		System.out.println(sf.students.size());
//		==================================================
		String msg = "번호\t이름\t국어\t영어\t수학\t총점\t평균";
		String[] subjects= {"국어","영어","수학"};
		String name = null;
		int num = 0;
		int subjectNumber = 0;
		int score = 0;
		
		
		ArrayList<Student> students = null;
		Student student = new Student();
		
		
//		
//		//학생 점수 수정(이름)
//		//사용자가 선택한 학생의 번호, 
//		//선택한 과목, 입력한 점수로 수정 완성시키기
//		System.out.println("이름: ");	//이름 입력받기
//		name = sc.next();					//name에다가 저장 
//		
//		//어레이리스트 객체인 students에 이름 검색메소드 결과값 (동명이인이 담긴 어레이리스트)넣기
//		//이름검색메소드 파라미터값에는 입력받은 name을 넣는다.
//		students=sf.selectNames(name);		
//		if(students.size()>1) {//동명이인이 있을 때
//			System.out.println(msg);
//			for (int i = 0; i < students.size(); i++) {
//				//동명이인의 정보까지 같이 출력
//				System.out.println(students.get(i));
//			}
//			//동명이인 중 수정하고픈 학생 번호선택 
//			num = sc.nextInt();
//			
//		}else if(students.size()!=0){//동명이인이 없을 때
//			//같은 이름이 없기 때문에 이름으로 해당 학생의 번호 검사
//			num = sf.getNumOfStudent(name);
//		}else {//학생이 없을 때 
//			System.out.println("검색 결과가 없습니다.");
//		}
//		
//		if(num!=0) {//학생이 한명이라도 있을 때 
//			System.out.println("수정하실 과목을 선택하세요");
//			for (int i = 0; i < subjects.length; i++) {	//과목 수 만큼 반복
//				//1.국어, 2.영어, 3.수학 출력 (일일히 쓰기 귀찮으니까 반복문으로 출력한것임)
//				System.out.println(i+1+"."+subjects[i]);
//			}
//			
//			//수정할 과목 번호 입력받기 
//			subjectNumber=sc.nextInt();
//			//subjects[인덱스번호이니까 입력값-1해줘야함]
//			System.out.println(subjects[subjectNumber-1]+ " 점수 : ");
//			//수정할 점수 입력받기 
//			score = sc.nextInt();
//			//번호로 학생의 전체정보 가져오기
//			student = sf.getStudent(num);
//			//student객체의 점수를 수정한 점수로 변경 
//			student.getArScore()[subjectNumber-1]=score;
//			
//			//위에서 주소에 직접 접근하여 수정하기 때문에 update()를 사용할 필요는 없다.
//			if(sf.update(student)) {
//				System.out.println("수정 성공");
//				//수정 내용 확인
//				System.out.println(msg);
//				System.out.println(student);
//			}else {
//				System.out.println("수정 실패");
//			}
//		}
		
		//학생 삭제(이름)
		System.out.println("삭제할 학생의 이름을 입력해주세요 : ");
		name =sc.next();
		//어레이리스트 객체인 students에 이름 검색메소드 결과값 (동명이인이 담긴 어레이리스트)넣기
		//이름검색메소드 파라미터값에는 입력받은 name을 넣는다.
		students=sf.selectNames(name);		
		if(students.size()>1) {//동명이인이 있을 때
			System.out.println(msg);
			for (int i = 0; i < students.size(); i++) {
				//동명이인의 정보까지 같이 출력
				System.out.println(students.get(i));
			}
			//동명이인 중 수정하고픈 학생 번호선택 
			num = sc.nextInt();

		}else if(students.size()!=0){//동명이인이 없을 때
			//같은 이름이 없기 때문에 이름으로 해당 학생의 번호 검사
			num = sf.getNumOfStudent(name);

		}else {//학생이 없을 때 
			System.out.println("검색 결과가 없습니다.");
		}
		
		if(num!=0) {
			if(sf.delete(num)) {
				System.out.println("삭제성공!");
				System.out.println(msg);
				
				students = sf.selectAll();
				
				for (int i = 0; i < students.size(); i++) {
					System.out.println(students.get(i));
				}
				}else {
					System.out.println("삭제 실패!");
			}
		}
		
		
		
		
		
		
		
		//학생 목록(전체)
		System.out.println(sf.selectAll());
		
		
		
		
		//학생 검색(번호)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
