package thread.threadtest2;

public class ThreadTask implements Runnable{
	public ThreadTask() {;}
	
	
	public void printFirst(Runnable first) {
		first.run(); //수정금지
	}
	public void printSecond(Runnable second) {
		second.run(); //수정금지
	}
	public void printThird(Runnable third) {
		third.run(); //수정금지
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}
