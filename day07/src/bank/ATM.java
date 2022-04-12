package bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {
		public static void main(String[] args) {
			//각 은행별로 최대 100명의 고객을 유치할 수 있다.
			String msg = "1.신한은행 \n2. 국민은행 \n3.우리은행 \n4.나가기";
			String menu = "1.계좌개설 \n2.입금하기 \n3.출금하기 \n4.잔액조회 \n5.계좌번호찾기\n6.나가기";
			
			//고객의 은행 번호로 은행 이름을 알아내기 위한 배열
			String[] bankName = {"신한은행", "국민은행", "우리은행"};
			Scanner sc = new Scanner(System.in);
			Random r = new Random();
			
			//임시 저장 공간
			String name= "" ;
			String pw = "";
			String account = "";
			String phone= "";
			
			//검사한 객체를 담을 저장공간
			Bank user = null;
			int choice = 0, menu_choice = 0;
			while(true) {
					System.out.println(msg);
					choice = sc.nextInt();
				
					if(choice ==4 ) {break;}
				
					//사용자가 선택한 은행번호가 choice -1 이므로 1빼준다
					choice--;
					
					while(true) {
						System.out.println(menu);
						menu_choice = sc.nextInt();
						//나가기
						if(menu_choice ==6) {
							System.out.println("프로그램 종료");
							break;
						}
						switch(menu_choice){
							//계좌 개설
						case 1 :
							//계좌 개설시 어떤 은행을 선택했는지는 알지만, 각 은행객체는 규칙성이 없기 때문에 규칙성을
							//부여하고 자 배열에 담아준다.
							Bank[] arBank = {new Shinhan(), new Kb(), new Woori()};
							while(true) {
								//새로운 회원의 랜덤한 계좌번호를 account에 담아준다
								account = ""+(r.nextInt(900000)+100000);
								//만약 존재하지 않는 계좌번호라면 탈출한다.
								//중복이 있다면 없을때까지 무한반복
								if(Bank.checkDup(account)==null)break;
								
							}
							//위의 반복문을 탈풀했다면 acc에는 중복이 없는 계좌번호가 담겨있다.
							//해당 은행 객체는 게좌번호 및 정보를 넣어준다
							arBank[choice].account = account;
							System.out.println("예금주 : ");
							arBank[choice].name = sc.next();
							
							while(true) {
								int i = 0;
								System.out.println("핸드폰 번호 ['-'제외] : ");
								phone = sc.next();
								for (int j = 0; j < phone.length(); j++) {
									//숫자를 제외한 문자가 포함되어 있으면 숫자만 입력할떄까지 무한반복
									//사용자가 입력한 각 문자가 0보다 작거나 9보다 크면 종료
									if(phone.charAt(i)<48 || phone.charAt(i)>57) {
										break;
									}
								
								}
								//위의 for문에서 강제로 break을 만나서 탈출한다면 i는 phone.length()까지 
								//절대로 증가할 수 없다. 따라서 정상적으로 증가하여 i가 phone.length()가 되었다면
								//사용자가 핸드폰번호를 특수문자 없이 잘 입력했다는 뜻이다.
								if(i==phone.length()) {
									//사용자가 입력한 폰 번호가 중복이 없다면 탈출 
									if(Bank.checkPhone(phone)==null) break;
									else System.out.println("이미 존재하는 번호입니다.");
								}
								break;
							}
							
							//핸드폰 번호를 정상적으로 입력했을 때 올 수 있는 영역
							arBank[choice].phone = phone;
							while(true) {
								System.out.println("비밀번호 4자리 : ");
								pw = sc.next();
								//사용자가 입력한 비번 4자리가 아니면 무한반복
								if(pw.length() ==4) {break;}
								
							}
							
							arBank[choice].pw = pw;
							//사용자가 선택한 은행 (행:choice)에 arCnt[choice]번째 고객으로 신규고객arBank[choice]에 저장
							Bank.arrBank[choice][Bank.arCnt[choice]] = arBank[choice];
							System.out.println("내 계좌번호 : "+account);
							//사용자가 선택한 은행의 고객수 1증가
							Bank.arCnt[choice]++;
							break;
							
							
						case 2 : //입금하기
							System.out.println("계좌번호 : ");
							account = sc.next();
							System.out.println("비밀번호 : ");
							pw = sc.next();
							
							//로그인 성공시 객체 리턴, 실패시 null리턴
							user = Bank.login(account, pw);
							//입금시 타행에서 입금할 수 없음, 고객의 은행 번호와 현재 이용중인 은행번호가일치하지 않으면
							//사용자에게 안내 메시지 출력s
							if(Bank.bank_num != choice) {
								System.out.println(bankName[Bank.bank_num]+"에서 처리 가능합니다.");
								continue;
							}
							
							//로그인 성공시 참
							if (user !=null) {
								System.out.print("입금액: ");
								//해당 객체가 Bank의 자식 객체면 재정의 된 메소드로 실행된다.
								user.deposit(sc.nextInt());
								System.out.println("잔고 : "+ user.money);
							}else {System.out.println("입금 실패 : 정보 오류");}
							break;
							
							//출금하기
						case 3:
							System.out.println("계좌번호 : ");
							account = sc.next();
							System.out.println("비밀번호 : ");
							pw = sc.next();
							
							user = Bank.login(account, pw);
							if(user != null) {
								System.out.println("출금액 : ");
								if(user.withdraw(sc.nextInt())) {
										System.out.println("잔고 : "+ user.money);
								}else {
									System.out.println("출금 실패 : 잔액 부족");
								}
							}else System.out.println("출금 실패 : 정보 오류");
						break;
						//잔액조회
						case 4: 
							System.out.println("계좌번호 : ");
							account = sc.next();
							System.out.println("비밀번호: ");
							pw = sc.next();
							user = Bank.login(account, pw);
							if(user!=null)user.show();
							else System.out.println("조회실패 : 정보 오류");
							break;
							
						//계좌번호 찾기
						case 5 : 
							System.out.println("계좌 개설 시 등록한 핸드폰 번호: ");
							phone = sc.nextLine();
							user = Bank.checkPhone(phone);
							if(user != null) {
								//사용자의 은행과 일치하는 은행에서만 계좌번호를 찾을 수 있다.
								if(Bank.bank_num!=choice) {
									System.out.println(bankName[Bank.bank_num]+"에서 처리가능합니다.");
									continue;
								}
								System.out.println("비밀번호 : ");
								pw= sc.nextLine();
								
								//만약 핸드폰 번호와 비밀번호가 일치하면 중복되지 않는 새로운 계좌번호를 생성해준다.
								if(user.pw.equals(pw)) {
									while(true) {
										account = ""+(r.nextInt(900000)+100000);
										if(Bank.checkDup(account)==null) {break;}
									}
									user.account = account;
									System.out.println(user.name+"님의 새로운 계좌번호 : "+account);
								}else {System.out.println("정보 오류");}
							}
							break;
									
							
							
							
							
							
							
							
							
							
						}
						
						
					}
					
				
				
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	


