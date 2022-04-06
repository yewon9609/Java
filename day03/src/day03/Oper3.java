package day03;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
		//심리 테스트
		/*
		 * Q.당신이 좋아하는 색을 선택하세요
		 * 1.빨간색
		 * 2.노란색
		 * 3.검은색
		 * 4.흰색
		 * 
		 * 빨간색: 불같고 열정적이고 적극적이다.
		 * 노란색: 발랄하고 밝고 귀엽고 개성있고 유하다.
		 * 검은색: 묵묵하고 든든하고 냉철하고 멋지다. 그리고 강하다.
		 * 흰색: 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
		 * 
		 * *삼항 연산자 사용
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String redMsg ="불같고 열정적이고 적극적이다.";
		String yellowMsg ="발랄하고 밝고 귀엽고 개성있고 유하다.";
		String blackMsg ="검은색: 묵묵하고 든든하고 냉철하고 멋지다. 그리고 강하다.";
		String whiteMsg ="천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String resultMsg = null;
		String errorMsg = "잘못 선택하셨습니다";
		
		System.out.println("당신이 좋아하는 색은?\n1.빨간색\n2.노란색\n3.검은색\n4흰색");
		choice = sc.nextInt();
		
		resultMsg = choice == 1? redMsg :
			choice == 2? yellowMsg :
					choice == 3? blackMsg :
						choice == 4 ? whiteMsg : errorMsg;
		
		System.out.println(resultMsg);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
