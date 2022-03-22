package day02;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
		//3개의 정수를 한번에 입력받은 후 
		//3개의 정수의 합 출력
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2  =0;
		int num3  =0;
		
		System.out.println("정수 3개를 한번에 입력하시오: ");
		num1 =sc.nextInt();
		num2 =sc.nextInt();
		num3 =sc.nextInt();
		
		System.out.println("3개 정수의 합 : "+(num1+num2+num3));
		
	}
}
