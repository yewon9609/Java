package day03;

import java.util.Scanner;

public class Oper4 {
	public static void main(String[] args) {
		//사용자에게 키를 입력받고, 정수라면 정수로 출력
		//실수라면 실수로 출력
		//삼항연산자 사용
		//183 --> 183출력
		//183.5 --> 183.5 출력
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		String Msg="키: ";
		double height = 0.0;
		String format= null;
		char newLine = '\n';
		
		System.out.println(Msg);
		height = sc.nextDouble();
		
		check = height -(int)height == 0;
		
		
		
		
//		format = check ? "%dcmd%c" : "%.2fcm%c";
//				
//		System.out.printf(format, height, newLine);
//				
				
		
		
				
		
		
		
		
	}
}
