package lambda;

@FunctionalInterface
public interface LambdaInter2 {
//	* 전체 식을 전달받은 후 String[]로 리턴하는 getOper 추상메소드 선언(함수형 인터페이스 제작)
	public String[] OperCheck(String expression);
	
}
