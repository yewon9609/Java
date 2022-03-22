package day02;

import java.util.Scanner;

public class InputTask {
	public static void main(String[] args) {
		//두 정수를 입력한 후 덧셈 결과 출력
		//단 next()만 사용
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
//		String n1Msg = "첫번째 정수: ";
//		String n2Msg = "두번째 정수: ";
//		
//		System.out.println(n1Msg);
		
		
		System.out.print("첫번째 정수 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		num2 = sc.nextInt();
		System.out.println("두 수의 합:" +(num1+num2));
		
	
	}
}

