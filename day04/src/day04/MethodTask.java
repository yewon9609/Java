package day04;

public class MethodTask {
	
	//아이언
	//1~10까지 println()으로 출력하는 메소드
	 void output(){
		for (int i = 0; i <10; i++) {
			System.out.println(i+1);
		}
	}
	
	
	//"홍길동"을 n번 println()으로 출력하는 메소드
	void honggil(int n){
		
		 for (int i = 0; i < n; i++) {
			 System.out.println("홍길동");
		}
	 }
	
	//브론즈
	//이름을 n번 println()으로 출력하는 메소드
	
	 void reName(int x, String name){
		for (int i = 0; i < x; i++) {
			System.out.println(name);
		}
	}
	
	//세 정수의 뺄셈을 해주는 메소드
	
	//실버
	//두 정수의 나눗셈을 해주는 메소드 (몫과 나머지)
	int [] div(int num1, int num2){
		int[] result = null;
		if(num2 != 0) {
			result = new int [2];
			result[0] = num1/num2;
			result[0] = num1%num2;
		}
		return result;
	}
	
	
	
	
	
	
	
	
//		void  division (int num1, int num2) {
//			int share =num1/num2;
//			int rest =num1%num2;
//			System.out.println("몫:"+share+"나머지 :"+rest);
//		}
	
	//1~n까지의 합을 구해주는 메소드
	int sumPlus(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum+=i;
		}
		System.out.println(sum);
		return sum ;
	}
	
	//골드 
	//홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
	int holzzack(int x){
		int holzak = 0;
		if(x %2 ==0) {
			holzak = x+1;
		}else {
			holzak = x+1;
		}
		System.out.println(holzak);
		return holzak;
	}
	
	//문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	 String change(String msg) {
		 int tmp = 0;
		 String out = "";
		 for (int i = 0; i < msg.length(); i++) {
			tmp = (int)msg.charAt(i);
			if((65 <= tmp)&&(tmp<=90)) {
				out +=(char)(tmp+32);
			}else if((97<=tmp)&&(tmp<=122)) {
				out+=(char)(tmp-32);
			}else {
				out+=(char)(tmp-32);
			}
		}
		 System.out.println(out);
		 return out;
	 }
	
	//플래티넘
	//문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
	 
	 
	//5개의 정수를 입력받은 후 원하는 번째 값을 구해주는 메소드 
	
	//다이아
	//한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024)
	 
	 int changeToInteger(String hangle) {
		 String hangleOri = "공일이삼사오육칠팔구";
		 String result = "";
		 for (int i = 0; i < hangle.length(); i++) {
			result+=hangleOri.indexOf(hangle.charAt(i));
		}
		 return Integer.parseInt(result);
	 }
	 
	 
	
	//마스터 
	//5개의 정수를 입력받고 최대값과 최소값을구해주는 void형 메소드 (메소드 안에서 출력 금지, 리턴타입은 void)
	
	
	
//	
//	public static void main(String[] args) {
//		MethodTask m = new MethodTask();
//		m.output();
//		m.honggil(3);
//		
//		m.sumPlus(30);
//		m.reName(4,"서예원");
//	}
}
