package day04;

import java.util.Scanner;

public class ArTask2 {
	public static void main(String[] args) {
		//사용자에게 입력받은 문자열 중 소문자는 모두 대문자로, 대문자는 모두 소문자로 변경한다.
//		Scanner sc = new Scanner(System.in);
//		String input = null;		//입력받은 문자열을 저장 할 input선언
//		String output = null;		//최종적으로 출력할 문자열을 저장하는 output선언
//		int num = 0;
//		System.out.println("문자열을 입력하세요 단, 영어로 : ");
//		input= sc.nextLine();		//입력받은 문자열을 input에 저장
//		
//		for (int i = 0; i < input.length(); i++) {		//문자열을 검사하기 위해서 input의 길이만큼 반복문 실행 
//																		//한글자씩 num에 옮겨서 검사
//			num = (int) input.charAt(i);				//문자열은 아스키코드로 저장되기 때문에 int형으로 변환
//			if((65<=num)&&(num <=90)) {		//문자가 65<= num <=90인경우 (대문자인 경우)
//				output += (char)(num+32);		//32를 더해서 소문자로 변환
//			}else if ((97<=num)&&(num <=122)) {		//문자가 97<=num<=122인 경우 (소문자인 경우)
//				output +=(char)(num -32);		//32를 뺴서 소문자로 변환
//			}else {												//그 외의 문자열일 경우
//				output +=(char)num;				//그대로 출력
//			}
//		}
//		System.out.println("변환된 문자열 : "+ output);
		
		//정수를 한글로 변경 
		//입력 예 :1024
		//출력 예  :일 공 이 사 
		int num = 0;
		String hangle = "공일이삼사오육칠팔구";
		String result = "";
	
		while (num != 0) {
			result = hangle.charAt(num%10)+ result;
				num /= 10;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
