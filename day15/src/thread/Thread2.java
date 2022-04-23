package thread;

public class Thread2 implements Runnable{

	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			//.currentThread : 현재 접근한 객체를 가져오는 메소드
			System.out.println(Thread.currentThread().getName());
			try {
				//컴파일러 속도 조절해주는 메소드, try~catch문과 함께 쓴다. 
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
