package game;

import java.util.Scanner;

public class play {
	public static void main(String[] args) {
		PeopleMethod[] people = new PeopleMethod[3];
		people[0] = new PeopleMethod("토끼",  100,100, 1,0,0);
		people[1] = new PeopleMethod("한동석", 5, 100, 1,0,0);
		people[2] = new PeopleMethod("거북이", 6, 100, 1,0,0);
		
		Quiz2[] quiz2= {
				new Quiz2("다이아를 캐시겠습니까? \n1.예 \n2.아니요", 1),
				new Quiz2("다이아를 캐시겠습니까? \n1.예 \n2.아니요", 1),
				new Quiz2("다이아를 캐시겠습니까? \n1.예 \n2.아니요", 1),
				new Quiz2("다이아를 캐시겠습니까? \n1.예 \n2.아니요", 1),
				new Quiz2("다이아를 캐시겠습니까?\n1.예 \n2아니요", 1, true),
				new Quiz2("다이아를 캐시겠습니까? \n1.예 \n2.아니요", 1),
				new Quiz2("다이아를 캐시겠습니까? \n1.예 \n2.아니요", 1),
				new Quiz2("다이아를 캐시겠습니까? \n1.예 \n2.아니요", 1),
				new Quiz2("다이아를 캐시겠습니까? \n1.예 \n2.아니요", 1),
				new Quiz2("다이아를 캐시겠습니까? \n1.예 \n2.아니요", 1),
				new Quiz2("다이아를 캐시겠습니까? \n1.예 \n2.아니요", 1)
				
		};
		
		
		Scanner sc = new Scanner(System.in);
		
		String title ="돈 벌러와요~ 광산의 숲";
		String menuMsg = "~캐릭터를 골라봅시당~ \n1.토끼\n2.한동석\n3.거북이\n4.나가기 ";
		String actionMsg = "1.석탄캐기 \n2.다이아캐기 \n3.휴식 \n4.여행 \n5.나가기";
		int answer = 0;
		int charNum =0;		//캐릭터 넘버
		int actionChoice = 0;
		
		while(true) {
			System.out.println(menuMsg);	//캐릭터 고르기
			charNum = sc.nextInt();		//캐릭터 번호 입력받기
			if(charNum ==4) {break;}		//4번입력받으면 나가기
			
			while(true) {
				System.out.println(actionMsg);
				actionChoice = sc.nextInt();
				if(actionChoice ==5) {break;}
				
				PeopleMethod peoples = people[charNum-1];
				
				if(peoples.moneynow >=100) {
					peoples.levelUp();
					System.out.println("축하합니다 ! 레벨이"+peoples.level+"이 되었습니다.");
					}
			
				switch(actionChoice) {	

				
					case 1: //석탄캐기
						if(peoples.mineCoal()) {
							System.out.println(peoples.name+"님이 석탄을 캤습니다!");
							System.out.println("현재 석탄 개수: "+ peoples.coal);
							System.out.println("현재 체력 개수: "+peoples.hp);
							System.out.println("현재 돈 :"+peoples.moneynow);
							
						}else {
						System.out.println("체력이 없네요ㅠㅠ 휴식이나 여행을 다녀오시는게 어때요?");}
						break;
					case 2://다이아 캐기  (체력 1 감소, 성공시 100만원, 실패시 50만원)
						if(peoples.hp>1) {
							Quiz2 q = peoples.mineDia(quiz2);
							
							if(q.jackpot) {
								System.out.println("축하드립니다. 핑크다이아몬드를 캐셨군요!");
								System.out.println("현재 다이아 개수: " +peoples.dia);
								System.out.println("현재 체력:" + peoples.hp);
								System.out.println("현재 돈 : "+ peoples.moneynow);
							}
							System.out.println(q.exercise);
							answer = sc.nextInt();
						
						if(q.answer == answer) {
							System.out.println("다이아몬드를 캐셨습니다!");
							System.out.println("현재 다이아 개수: " +peoples.dia);
							System.out.println("현재 체력:" + peoples.hp);
							System.out.println("현재 돈 : "+ peoples.moneynow);		
							break;
							}
						if(peoples.hp ==0) {
							System.out.println("체력이 없어요 ㅠㅠ 휴식을 취하거나 여행을 떠나세요");
						}
						}
						break;
					
					case 3://휴식 (체력 1 증가, 돈 10만원 감소 )
						if(peoples.rest()) {
							System.out.println(peoples.name+ "님이 휴식을 취했습니다.");
							System.out.println("현재 체력 개수: "+ peoples.hp);
							System.out.println("현재 돈 : " + peoples.moneynow);
							
						}else {
							System.out.println("휴식을 취할 돈이 없어요 ㅠㅠㅠ");
						}
						break;
					
					case 4: //여행(체력 5 증가, 돈 20만원 감소)
						if(peoples.trip()) {
							System.out.println(peoples.name+"님이 여행을 떠났어요");
							System.out.println("현재 체력 개수: "+peoples.hp);
							System.out.println("현재 돈 : "+ peoples.moneynow);
						}else {
							System.out.println("여행을 갈 돈이 없어요 ㅠㅠ");
						}
						break;
						
				}
					
					
			}
					
					
					
				}
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
	}

