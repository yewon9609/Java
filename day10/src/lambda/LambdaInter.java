package lambda;

//함수형 인터페이스 (메소드 1개만 있어야함)
@FunctionalInterface
public interface LambdaInter {
//10의 배수인지 아닌지 검사하는 메소드
//앞에 abstract 생략
	boolean checkMultipleOf10(int number);
	
}
