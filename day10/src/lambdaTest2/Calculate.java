package lambdaTest2;

import java.util.Scanner;

import lambda.LambdaInter2;

public class Calculate {
	
//	*두 정수의 덧셈, 뺄셈을 구해주는 함수형 인터페이스를 리턴하는static 메소드 선언(람다식 리턴)
	
	public static LambdaInter1 calculator(String something) {
		//인터페이스 리턴
		LambdaInter1 lambda = null;
		
		switch(something) {
		case "+" :
			lambda =(num1, num2)->num1 + num2;
			break;
			
		case "-" :
			lambda =(num1, num2)->num1 -num2;
			break;
		}
		return lambda;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
//		 main메소드에 getOper(추상메소드)를 람다식으로 구현
		LambdaInter2 opercheck = (expression) ->{
			 String temp = "";
			 for (int i = 0; i < expression.length(); i++) {
				char c = expression.charAt(i);
				if(c ==43 || c ==45) {
					temp+=c;
				}
			}
			 return temp.split("");
		 };
	
		 String msg = "정수의 덧셈, 뺼셈에 대한 식을 입력하세요";
		 String exMsg = "예) 7 + 65 - 8";
		 String temp = null;
		 String[] nums = null;
		 String[] opers = null;
		 int num1, num2 = 0;
		 
		 System.out.println(msg);
		 System.out.println(exMsg);
		 temp = sc.next();
		 
		 nums = temp.split("\\+ | \\-");
//			* 전체 식을 전달받은 후 String[]로 리턴하는 Opercheck추상메소드 
		 opers = opercheck.OperCheck(temp);
		 
		 
		 num1 = Integer.parseInt(nums[0].equals("")?opers[0]+nums[1] :nums[0]);
		 for (int i = 0; i < opers.length; i++) {
			if(num1 < 0 && i ==0) {
				continue;
			}
			num2 = Integer.parseInt(nums[i+1]);
//			 두 정수를 전달받은 후 int로 리턴하는 calc추상메소드
			num1 = calculator(opers[i]).calc(num1, num2);
		}
		System.out.println(num1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
