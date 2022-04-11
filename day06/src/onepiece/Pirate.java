package onepiece;

import java.util.Random;

public class Pirate {
	String name;
	int age;
	String rank;
	int hp;
	int moneynow;
	
	
	public Pirate(String name, int age, String rank, int hp, int moneynow) {
		super();
		this.name = name;
		this.age = age;
		this.rank = rank;
		this.hp = hp;
		this.moneynow = moneynow;
	}

	//메소드구현

	//1.약탈 (체력감소, 돈 증가) ->50%확률로 3번연속 성공시 승진
	Quiz looting(Quiz[] quiz){
		hp--;
		int[]arData = new int[10];	//확률 단위
		int rating = 50;	//확률 조절
		Random r = new Random(); //인덱스번호 무작위로 바꾸기
		
		for (int i = 0; i < rating/10; i++) {
			arData[i]=1;
		}
		
		if(arData[r.nextInt(10)]==1) {
			for (int i = 0; i < quiz.length; i++) {
				if(quiz[i].jackpot);{
				moneynow+=1000;
				return quiz[i];
				}
			}
			
		}
		Quiz q = null;
		while(true) {
			q=quiz[r.nextInt(quiz.length)];
			if(!q.jackpot) {moneynow+=500;
			break;}
		}
		
		return q;
	}
	
	//2.술판 벌이기 (체력 증가)
	 BeerJ beer(BeerJ[] beerj){
		int[]arData = new int[10];
		int rating =10;
		Random r = new Random();
		
		for (int i = 0; i < rating/10; i++) {
			arData[i]=1;
		}
		if(arData[r.nextInt(10)]==1) {
			//10%확률로 약탈 당해서 돈 감소
			for(int i = 0; i<beerj.length; i ++) {
				if(beerj[i].jackpot) {
					moneynow -=100;
					return beerj[i];
				}
			}
		}
		BeerJ j = null;
		while(true) {
			j= beerj[r.nextInt(beerj.length)];
			if(!j.jackpot) {
			hp+=5;
			break;
			}
		}
		return j;
	}
	
	//3.물에 빠진사람 구하기 (돈증가)
	void Save(){
		moneynow+=300;
	}
	
	//4.해적선 사기 (돈1500만원 이상 소지시 가능)
	
	void buyBoat(){
		moneynow-=1500;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
