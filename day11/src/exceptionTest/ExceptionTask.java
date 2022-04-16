package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
		
		//5개의 정수만 입력받기
		//-무한 입력 가능
		//-q를 입력하면 나가기
		//-5개의 정수는 배열에 담기
		//-if문은 딱 한번만 사용하기
		
		Scanner sc = new Scanner(System.in);
		String msg = "번째 정수입력[q:나가기]";
		String temp = null;
		int[]arData = new int[5];
		
		int idx = 0;
		while(true) {
			System.out.println(++idx+msg);
			temp = sc.next();
			//toLowerCase()는 String클래스에 선언된 메소드이다.
			//대문자를 모두 소문자로 바꿔주는 기능을 한다.
			if(temp.toLowerCase().equals("q")) {break;}
//			Integer.parseInt(temp);		//오류가 발생할 수 있는 문장
			try {
				//idx를 입력하면 ++idx(=1+idx)가 되기때문에 1을 빼줘야함
				arData[idx-1]=Integer.parseInt(temp);
			} catch (NumberFormatException e) {
				System.out.println("정수만 입력하세요.");
				idx --;		//잘못입력해도 ++idx가 증가하지 않게
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("정수를 5개 이상 입력하셨습니다.");
				for (int i = 0; i < arData.length; i++) {
					System.out.println(arData[i]+"");
				}
				break;
				
			}
			
		}
		
	}
}
