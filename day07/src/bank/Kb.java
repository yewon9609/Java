package bank;

public class Kb extends Bank{
//출금 시 수수료 50%
	public Kb() {;	}
	
	@Override
		boolean withdraw(int bal) {
		money*=1.5;
		return super.withdraw(bal);
		}
	
}
