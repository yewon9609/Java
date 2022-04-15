package lambda;

public class LambdaTest {
	public static void main(String[] args) {
														//값으로 볼 줄 알아야 한다 !!!
		LambdaInter lambda1 = (int number) -> number%10 ==0;
		boolean check1 = lambda1.checkMultipleOf10(10);
		System.out.println(check1);
		
		//10의 배수 검사를 출력하고 리턴한다.
		
		LambdaInter lambda2 = (int number) ->{	System.out.println("10의 배수 검사");		
																					return number % 10 ==0; };
		boolean check2 = lambda2.checkMultipleOf10(99);
		System.out.println(check2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//new 생성자()이니까 
		//new LambdaInter()를 값(주소값)으로 봐야한다.
//		boolean check = new LambdaInter() {
//
//			@Override
//			public boolean checkMultipleOf10(int number) {
//				return number % 10 ==0;
//			}
//			
//		}.checkMultipleOf10(10);
//		
		
		
		
		
	}
}
