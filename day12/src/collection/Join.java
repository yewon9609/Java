package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Join {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		UserField userField = new UserField();
		User user = new User();
		
		String msg = "1.회원가입\n2.로그인";
		int choice = 0;
		String name = "";
		String id = "";
		String pw ="";
		String phoneNum="";
		
		while(true) {
		System.out.println(msg);
		choice = sc.nextInt();
		
		
		switch(choice) {
		case 1 : //회원가입
			ArrayList<User> users = new ArrayList<>();
			
			
			System.out.println("이름: ");
			name=sc.next();
			System.out.println("ID: ");
			id = sc.next();
			if(userField.checkId(id)!=null) {
				System.out.println("이미 있는 아이디 입니다.");
			}else {System.out.println("사용 가능한 아이디 입니다.");}

			System.out.println("PW: ");
			pw = sc.next();
			System.out.println("핸드폰 번호: ");
			phoneNum =sc.next();
			
			user.setId(id);
			user.setName(name);
			user.setPhoneNum(phoneNum);
			user.setPw(userField.encrypt(pw));
			
			userField.join(user);
			System.out.println(user);
			break;
			
		case 2: //로그인
			
			System.out.println("아이디를 입력해주세요");
			id = sc.next();
			System.out.println("비밀번호를 입력해주세요");
			pw =sc.next();
			userField.login(id, pw);
			
			if(user==null) {
				System.out.println("아이디 또는 비밀번호 입력이 잘못되었습니다.");
			}else {System.out.println("로그인에 성공하였습니다");}
			
			break;
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
