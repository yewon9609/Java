package ambiguity;

public interface InterA {

	//추상메소드(기본값)가 아니라 일반메소드라는 뜻으로 default를 써야함
	default void printData() {
		System.out.println("InterA");
	}
}
