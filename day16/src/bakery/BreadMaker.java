package bakery;

public class BreadMaker implements Runnable{
	
	private boolean exit;
	
	public boolean isExit() {
		return exit;
	}
	public void setExit(boolean exit) {
		this.exit= exit;
	}



	@Override
	public void run() {
		//20개의 빵을 만드는 자원 구현
		for (int i = 0; i < 20; i++) {
			
			if(exit) {
				break;
			}
			BreadPlate.getInstance().makeBread();	
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {e.printStackTrace();}
		
		BreadPlate.getInstance().makeBread();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {e.printStackTrace();}
		
	
	}
		if(!exit) {
		System.out.println("재료소진");
		}
		
	}
}
