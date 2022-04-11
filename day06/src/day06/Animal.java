package day06;

import java.util.Random;

public class Animal {
//	유아용 게임, 모여라 셀럽동물(게임)
//	-육식동물 금지
//	이름, 나이, 먹이(종류), 먹이개수(개수),생명

	String name;
	   int age;
	   String feed;
	   int feedCount;
	   int life;
	   
	   
	   
	   
	   public Animal(String name, int age, String feed, int feedCount, int life) {
		this.name = name;
		this.age = age;
		this.feed = feed;
		this.feedCount = feedCount;
		this.life = life;
	}
//1.먹기
	boolean eat() {
	      if(feedCount != 0) {
	         feedCount--;
	         life++;
	         return true;
	      }
	      return false;
	   }
	   
	//2.자기
	   void sleep() {
	      life++;
	   }
//	   3.퀴즈
	   Quiz walk(Quiz[] quiz) {
	      life--;
	      //확률: 10칸 선언  (=10%단위)
	      int[] arData = new int[10];
	      //rating 만 건들면 확률 조작 가능 
	      int rating = 10;
	      //arData랜덤 인덱스 번호를 뽑기위해 만든 랜덤클래스
	      Random r = new Random();
	      //확률 , 1이나오면 잭팟
	      //rating/10 = 10/10 = 1 (=10칸 중 1칸)
	      //만약 rating 이 100이라면 100/10 =10 (arData 10칸 중 10칸)
	      for (int i = 0; i < rating / 10; i++) {
	         arData[i] = 1;
	      }
	      // arData배열안에 랜덤 클래스로 0~9 번 중 1번 이 잭팟 문제 
	      //r.nextInt()가 인덱스번호를 랜덤으로 바꿔줌 
	      if(arData[r.nextInt(10)] == 1) {
	         //잭팟 문제
	    	  //입력받은 문제배열의 갯수만큼 반복
	         for (int i = 0; i < quiz.length; i++) {
	            if(quiz[i].jackpot) {
	               return quiz[i];
	            }
	         }
	      }
	      
	      //일반 문제
	      Quiz q = null;
	      while(true) {
	         q = quiz[r.nextInt(quiz.length)];
	         if(!q.jackpot) { break; }
	      }
	      return q;
	   }

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

