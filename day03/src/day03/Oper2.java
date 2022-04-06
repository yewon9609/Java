package day03;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
		//두 정수 입력받고 대소비교
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		String result = null;
		
		System.out.println("첫번째 정수");
		num1 = sc.nextInt();
		System.out.println("두번째 정수");
		num2 = sc.nextInt();
		
		result = num1>num2 ? "큰 값: " +num1 :num1 ==num2? "두 수가 같습니다.": "큰 값: " +num2;
		System.out.println("큰 값: "+ result);
		

		
		
		
		
		
		
		
		
		
		
		
		
	}
}
