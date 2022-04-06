package day03;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
		//두 정수를 입력 받고 대소비교
		Scanner sc = new Scanner(System.in);
		int num1 = 0 , num2 = 0;
		String resultMsg = null;
		
		
		System.out.println("첫번째 정수 :");
		num1 = sc.nextInt();
		System.out.println("두번째 정수 : ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			 resultMsg ="큰값 : "+ num1;
		}else if(num1 == num2) {
			 resultMsg="두 수가 같습니다.";
		}else {
			 resultMsg="큰값 :" +num2;
		}
		
		System.out.println(resultMsg);
	}
}
