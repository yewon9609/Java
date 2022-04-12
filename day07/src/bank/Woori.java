package bank;

public class Woori extends Bank {
//입금시 수수료50%
	public Woori() {;}
	
	@Override
		void deposit(int bal) {
		money*=0.5;
		super.deposit(bal);
		}
	
}
