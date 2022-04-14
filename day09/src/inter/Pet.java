package inter;

public interface Pet {
	final static int eyes = 2;
	//앞에 항상 final static이 생략되어있다.
	int nose = 1;
	
	//메소드 앞에 abstract가 생략됨 (어차피 추상메소드밖에 못쓰니까)
	void sitDown();
	void stop();
	void poop();
	void 빵야();

	
	
}
