package day03;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
//		브론즈
//		1~100까지 출력
		
//		for (int i =0; i < 100; i++) {
//			System.out.println(i+1);
//		}
//		
////		100~1까지 출력
//		
//		for (int i = 100; i >0; i--) {
//			System.out.println(i);
//		}
		
		
//		1~100까지 중 짝수만 출력
//		for (int i = 0; i < 50; i++) {
//			System.out.println((i+1)*2);
//		}
		
		
//		실버
////		1~10까지 합 출력
//		int sum = 0;
//		int i = 1;
//		while(i<=10) {
//			sum+=i;
//			i ++;
//		}
//		System.out.println("1~10의 합계는"+sum+"입니다");
		
//		1~n까지 합 출력
//		Scanner sc= new Scanner(System.in);
//		int sum2 = 0;
//		
//		System.out.println("n의 값을 입력하세요 : ");
//		int n = sc.nextInt();
//		
//		for (int j = 1; j <= n; j++) {
//			sum2+=j;
//		}
//		System.out.println("1~n의 합계는"+ sum2+"입니다");
//		
//		
//		
//		
////		골드
////		A~F까지 출력
//		for (int j = 65; j < 71; j++) {
//			System.out.println((char)j);
//		}
//		
//		
////		A~F 중 C 제외하고 출력(5번만 반복)
////		0 1 2 3 4 5 
////		A B C D E F
//		for (int j = 0; j < 5; j++) {
//			System.out.println((char)(i+(i >1? 66:65)));
//		}
//		
//		
//		
		
		
//		다이아
//		0 1 2 3 0 1 2 3 0 1 2 3 출력
		for (int i = 0; i < 12; i++) {
			System.out.print(i%4 + "");
		}
		
		
//		aBcDeFg....Z출력
		for (int i = 0; i <26; i++) {
		System.out.println((char)(i+(	i % 2 ==0? 97 :65)));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
