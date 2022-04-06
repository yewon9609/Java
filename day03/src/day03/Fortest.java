package day03;

public class Fortest {
	public static void main(String[] args) {
		//이름 10번 출력
//		for(int i=0; i<10; i=i+1) {
//			System.out.println(i+1+".서예원");
//		}
		
		//이름 10번 출력, 10~1까지 출력
		for(int i = 10; i>0; i--) {
			System.out.println(i+".서예원");
		}
		
		//이름 10번 출력, 10~ 20까지 출력
		
		//-11번 반복
		int end =10;
		for (int i = 0; i <end; i++) {
			System.out.println(i+10+(end == 11? "." : ".서예원"));
			if (i == 9) {end++;}
		}
		
		
		
		
		
	}
}
