package bank;

public class Shinhan extends Bank{
//잔액 조회시 재산 반토막
	public Shinhan() {;	}
	
	@Override
		void show() {
		this.money *= 0.5;
		
		}
	
}
