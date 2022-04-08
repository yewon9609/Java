package day05;

public class MethodTask {

	 // 아이언
	   // 1~10까지 println()으로 출력하는 메소드 
//	 void num(){
//		for (int i = 0; i <10; i++) {
//			System.out.println(i+1);
//		}
//	}
	
	
	   // "홍길동"을 n번 println()으로 출력하는 메소드
	   
//	 void name(int num){
//		 for (int i = 0; i < num; i++) {
//			System.out.println("홍길동");
//		}
//	 }
	 
	 
	   // 브론즈
	   // 이름을 n번 println()으로 출력하는 메소드
//	void whatYourName(int num, String name){
//		for (int i = 0; i < num; i++) {
//			System.out.println(name);
//		}
//	}
	
	
	   // 세 정수의 뺄셈을 해주는 메소드
	
//	int minus(int num1, int num2, int num3){
//		return num1-num2-num3;
//		
//	}
//	
	   
	   // 실버
	   // 두 정수의 나눗셈을 해주는 메소드(몫과 나머지)
//	 int[] divide (int x, int y) {
//		 //몫과 나머지를 담을 배열 선언
//		 //분모가 0이면 나눠도 0이되므로 초기값은 null로 설정해준다.
//		 int []result = null;
//		 if(y!=0) {
//			 //배열의 크기 2(몫,나머지)로 설정
//			 result = new int [2];
//			 result[0]=x/y;
//			 result[1]=x%y;
//		 }
//		 return result;
//	}
	
	   // 1~n까지의 합을 구해주는 메소드


	
//	 int total(int x) {
//		 int sum = 0;
//		for (int i = 0; i <x; i++) {
//			sum+=i+1;
//		}
//		return sum;
//	}
	   
	   // 골드
	   // 홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
	
//	int holzzack(int x){
//		int result=0;
//		if(x!=0) {
//			result = x+1;
//		}
//		return result;
//	}
	
	   // 문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	
	//매개변수로 문자열 입력받기
	
//	String alpabat (String msg){
//		char c = ' ' ;
//		String result = "";
//		//입력받은 문자열 갯수만큼 반복돌리기
//		for (int i = 0; i < msg.length(); i++) {
//			//c에 인덱스 번호 값 불러와서 담기 
//			c=msg.charAt(i);
//			//대문자 -> 소문자로 바꾸기
//			if(c>=65 && c<=90) {
//				result +=(char)( c+32);
//			}else if(c>=97&&c<=122){		//소문자 ->대문자로 바꾸기
//				result +=(char)(c-32);
//			}else {
//				result +=c;	//특수문자 그대로 입력받기
//			}
//		}
//			return result;
//		
//		
//	}
	
	
	
	
	
	
	   // 플래티넘
	   // 문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드

	
	
	//매개변수 : 입력받을 문자열 값과, 원하는 문자
//	int temp(String Msg, char num){
//		//원하는 문자의 갯수를 담을 변수값
//		int count = 0;
//		//입력받은 문자열길이만큼 반복함, 만약 원하는 원하는 문자값이 있다면 그 갯수만큼 count++
//		for (int i = 0; i < Msg.length(); i++) {
//			if(Msg.charAt(i)==num) {
//				count ++;
//			}
//		}
//		return count;
//	}
	
	
	
	   // 5개의 정수를 입력받은 후 원하는 번째 값을 구해주는 메소드
//	int getValue(int []arData, int ordinal){
//		return arData[ordinal-1];
//	}
//	
	
	
//	int youWant(int a, int b, int c, int d, int e, int f){
//		int[]number5 = {a,b,c,d,e};
//		int result = 0;
//		
//			if(f==0||f>5) {
//				System.out.println("1,2,3,4,5 중 하나를 입력해주세요.");
//			}else {
//				result =number5[f-1];
//			}
//		
//		return result;
//	}
//	
//	
	   
	   // 다이아
	   // 한글을 정수로 바꿔주는 메소드(일공이사 -> 1024)
	int changeToInteger (String hangle) {
		String HangleOri="공일이삼사오육칠팔구";
		String result = "";
		for (int i = 0; i < hangle.length(); i++) {
			result+=HangleOri.indexOf(hangle.charAt(i));
		}
		return Integer.parseInt(result);
	}
	   
	   // 마스터
	   // 5개의 정수를 입력받고 최대값과 최소값을 구해주는 void형 메소드(메소드 안에서 출력 금지, 리턴타입은 void)
	//getMaxAndMin 메소드를 쓰려면 사용하려는곳(메인메소드)에서 주소를 받아와야한다.
//		배열은 주솟값을 가지고 있으니 int[]results를 매개변수자리에 쓰도록한다
	
	void getMaxAndMin(int[]arData, int[]results) {	
		
		results[0] = arData[0];
		results[1] = arData[0];
		
		for (int i = 0; i < arData.length; i++) {
			if(results[0]<arData[i]) {results[0] = arData[i];}
			if(results[1]<arData[i]) {results[0] = arData[i];}
			
		}
	}
	
	

	
	
	
	
	public static void main(String[] args) {
		  MethodTask m = new MethodTask();
		int[]results = new int[2];		//주소를 getMaxAndMin 의 매게변수 int []results에 전달 
		int []arData = {1,3,6,4,2};
		m.getMaxAndMin(arData, results);
		System.out.println("최대값:"+ results[0]);
		System.out.println("최소값:"+ results[1]);
		
		//정수에서 쉼표대신 _ 를 사용한다.
	//1,000,000
	// -> int data = 1_000_000;
//	int []results = new int[2];
//	int[]arData = {1,3,6,4,2};
//	 m.getMaxAndMin(arData, results);
//	
	
		
	}

}
