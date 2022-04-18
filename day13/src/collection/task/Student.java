package collection.task;

//학생 한 명이 추가 될 때 마다 번호는 자동으로 증가된다.
//아래 작성된 필드의 접근자는 private으로 한다.
public class Student {
	private static int seq;
	
//번호, 이름
	private int number;
	private String name;
//국어 , 영어, 수학점수
	private int[] arScore;
	
//	인스턴스 블럭
//	->객체화 시 항상 실행되는 영역 
	{this.number = ++seq;}
	
//	초기화 블럭
//	처음에 한번만 실행되고 그다음부터는 실행되지 않는다.
//	클래스가 JVM에 로드될 때 딱 한번만 사용할 로직 작성
	static {System.out.println("~학생관리 프로그램~");}
	
	
	
	public Student() {;	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getArScore() {
		return arScore;
	}

	public void setArScore(int[] arScore) {
		this.arScore = arScore;
	}

	public Student( String name, int[] arScore) {
		super();
		this.name = name;
		this.arScore = arScore;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		String str = number + "\t"+name+"\t";
		int total = 0;
		double avg = 0.0;
		
		for (int i = 0; i < arScore.length; i++) {
			str += arScore[i]+"\t";
			total +=arScore[i];
		}
		avg = (double)total/arScore.length;
		avg = Double.parseDouble(String.format("%.2f", avg));
		
		str +=total + "\t"+avg;
		return str;
		
	}
	
	
	
}
