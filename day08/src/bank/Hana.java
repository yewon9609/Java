package bank;

import java.util.Random;

public class Hana extends Bank implements Runnable{
	 
	   int stockMoney = 0;
	   int depositMoney = 0;
	   
	   
	   //주식
	   public boolean stock() {
	      Random r = new Random();
	      int rating = 0;
	      
	      if(r.nextInt(100) == 0) {
	         stockMoney = 0;
	         return false;
	      }
	      
	      rating = r.nextInt(30) + 1;
	      stockMoney *= (100 + rating) * 0.01;
	      return true;
	   }
	   
	   //매도
	   //주식 현재 잔액
	   
	   //run() 재정의
	   @Override
	   public void run() {
	      //- 투자금액은 전재산보다 작아야한다.
	      if(this.getMoney() >= depositMoney) {
	         
	         try {
	            while(true) {
	               if(!stock()) {break;}
	                  Thread.sleep(1000);
	            }
	         } catch (InterruptedException e) {
	            //주식 전 투자금액 출력
	            //주식 후 투자금액 출력
	            //수익률 출력
	         }
	         
	      }else {
	         System.out.println("잔액 부족");
	      }
	   }

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
