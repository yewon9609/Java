package game;

import java.util.Random;

public class PeopleMethod {
	String name;	
	int hp;
	int moneynow;
	int level;
	int coal;
	int dia;
	

	
	
	public PeopleMethod(String name, int hp, int moneynow, int level, int coal, int dia) {
		super();
		this.name = name;
		this.hp = hp;
		this.moneynow = moneynow;
		this.level = level;
		this.coal = coal;
		this.dia = dia;
		
	}




	//1.석탄캐기 : 체력 1감소, 돈 10만원 증가 
	boolean mineCoal(){
		if(hp!=0) {
			hp--;
			moneynow+=10;
			return true;
		}
		return false;
	}
	
	
	//2.다이아 캐기(체력 1감소, 캐는거 성공시 100만원 증가, 실패시 50만원 증가)
	
	Quiz2 mineDia(Quiz2[] quiz2){
		hp--;
		int[]arData = new int[10];
		int rating = 20;
		Random r = new Random();
		for (int i = 0; i < rating/10; i++) {
			arData[i] = 1;
		}
		if(arData[r.nextInt(10)]==1) {
			for(int i = 0; i <quiz2.length; i++) {
				if(quiz2[i].jackpot) {
					return quiz2[i];				
				}
			}
		}
		Quiz2 q = null;
		while(true) {
			q= quiz2[r.nextInt(quiz2.length)];
			if(!q.jackpot) {break;}
		}
		return q;
	
		
	 }
	
	//3.휴식(체력 1 증가, 돈 10만원 감소 )
	
	boolean rest(){
		if(moneynow !=0) {
			hp++;
			moneynow-=10;
			return true;
		}
		return false;
	}

	//4.여행(체력 5 증가 ,돈 20만원 감소)
	
	boolean trip() {
		if(moneynow>=20) {
			hp+=5;
			moneynow-=20;
			return true;
		}
		return false;
	}
	
	//5.직급 상승 (돈이 100만원 이상이면 레벨업 ! )
	
	void levelUp() {
		if(moneynow>=1000) {
			level++;
			
		
	}
	
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	

