package onepiece;

import java.util.Scanner;

public class Boat {
	public static void main(String[] args) {
		
		Pirate[] pirates = new Pirate[3];
										//이름, 나이, 직급, 체력 , 돈
		pirates[0] = new Pirate("루피", 18, "고무고무 인간",3, 200);
		pirates[1] = new Pirate("상디", 20, "발차기 잘하는애",5 , 100);
		pirates[2] = new Pirate("조로", 22, "칼 잘쓰는 애", 2, 300);
		
		Quiz[] quiz = {
				new Quiz("약탈 대 성공 !", true),
				new Quiz("약탈 실패! 그래도 돈500만원은 건졌다!")
		};
		BeerJ[] beerj = {
				new BeerJ("앗!!취해있는사이 약탈을 당해버렸다!", true),
				new BeerJ(" \"크~ 취한다\" ")
		};
		
		Scanner sc = new Scanner(System.in);
		String job1 = "선원";
		String job2 = "해적 왕";
		String title = "★★★내 꿈은 해적왕★★★";
		String menuMsg = "해적왕으로 키우고 싶은 캐릭터를 골라주세요. \n1.루피\n2.상디\n3.조로\n4.나가기";
		String actionMsg = "1.다른 해적선 약탈하기\n2.술판 벌이기\n3.물에 빠진사람 구하기\n4.해적선 사기(1500만원)\n5.해적왕 포기";
		int answer = 0;
		int charNum = 0;
		int actionChoice = 0;
		
		while(true) {
			System.out.println(menuMsg);
			charNum= sc.nextInt();
			if(charNum ==4 ) {break;}
			int count =0 ;
			while(true) {
				System.out.println(actionMsg);
				actionChoice = sc.nextInt();
				if(actionChoice == 5) {break;}
				
				//선택한 캐릭터 정보
				
				Pirate pirate =  pirates[charNum -1 ];
				
				switch(actionChoice) {
				case 1 : //약탈 : (체력 감소, 돈 증가) ->50%확률로 3번연속 성공시 승진
					if(pirate.hp>1) {
						
						Quiz q= pirate.looting(quiz);
						
						if(q.jackpot) {
							System.out.println(pirate.name+"가 '약탈'로 돈1000만원을 획득했습니다!");
							System.out.println("-----------------------------------------------------");
							System.out.println("현재 재산: "+ pirate.moneynow+"만원");
							System.out.println("현재 체력: "+ pirate.hp);
							System.out.println("현재 직업: "+ pirate.rank);
							System.out.println("-----------------------------------------------------");
							count++;
							
							if(count==3) {
								System.out.println("축하합니다! 약탈3번 연속 성공으로 \n직급이 한 단계 올랐습니다!");
								pirate.rank=job1;
								System.out.println("현재 직급 : "+pirate.rank);
							}
							
							if(count ==5) {
								System.out.println("축하합니다! 약탈5번 연속 성공으로 \n해적왕이 되었습니다!");
								pirate.rank=job2;
								System.out.println("현재 직급 : "+pirate.rank);
							}
								
						}
						else{System.out.println(q.question);
						System.out.println("-----------------------------------------------------");
						System.out.println("현재 재산: "+ pirate.moneynow+"만원");
						System.out.println("현재 체력: "+ pirate.hp);
						System.out.println("현재 직업: "+ pirate.rank);
						System.out.println("-----------------------------------------------------");
							count = 0;
								}
						
					}
					else {
							System.out.println("체력이 딸려...술판이나 벌여볼까?");
							System.out.println("-----------------------------------------------------");
							System.out.println("현재 재산: "+ pirate.moneynow+"만원");
							System.out.println("현재 체력: "+ pirate.hp);
							System.out.println("현재 직업: "+ pirate.rank);
							System.out.println("-----------------------------------------------------");
							
					}
					break;
				
//				2.술판벌이기(체력 +5 증가) -> 10%확률로 약탈당해서 돈 500감소 
				case 2:
						BeerJ q = pirate.beer(beerj);
					if(q.jackpot) {
						System.out.println(q.question);
						System.out.println("돈 100만원을 약탈당했습니다.");
						System.out.println("-----------------------------------------------------");
						System.out.println("현재 재산: "+ pirate.moneynow+"만원");
						System.out.println("현재 체력: "+ pirate.hp);
						System.out.println("현재 직업: "+ pirate.rank);
						System.out.println("-----------------------------------------------------");
						
					}
					else {
						System.out.println(q.question);
						System.out.println("체력이 5 늘어났습니다!");
						System.out.println("-----------------------------------------------------");
						System.out.println("현재 재산: "+ pirate.moneynow+"만원");
						System.out.println("현재 체력: "+ pirate.hp);
						System.out.println("현재 직업: "+ pirate.rank);
						System.out.println("-----------------------------------------------------");
					}
				break;
				
//				3.물에 빠진 사람 구하기 (돈 증가)
				case 3:
					pirate.Save();
					System.out.println("와아, 물에 빠진걸 건져주니 돈300만원을 주고 갔어요!");
					System.out.println("-----------------------------------------------------");
					System.out.println("현재 재산: "+ pirate.moneynow+"만원");
					System.out.println("현재 체력: "+ pirate.hp);
					System.out.println("현재 직업: "+ pirate.rank);
					System.out.println("-----------------------------------------------------");
				break;
				
//				4.해적선 사기 (돈 1500만원 이상 소지시 가능 )
				case 4 :
					if(pirate.moneynow <1500) {
						System.out.println("아직 돈이 부족해서 살 수 없어요 ㅠ");
					}else {
					pirate.buyBoat();
					System.out.println("와아~ 새로운 해적선이에요 !");
					}
					break;
				
			}
		
			}	
		
		}
	}
}
