package threadTest1;

public class Zoo {
	public static void main(String[] args) {
		
	
//	동석이네 동물원에는 3마리의 동물이 있다. 
//	각 동물은 울음소리가 다르고 2마리의 동물은 동시에 운다. 
//	나머지 1마리 동물은 2마리 동물이 모두 울고나서 마지막에 운다.
//
//	package명은 threadTest1으로 만들고 클래스는 2개만 선언한다.
//	하나의 클래스에는 main쓰레드가 있다. 
//	Runnable 인터페이스로 멀티 쓰레드를 구현하고 반드시 join()을 사용한다.
//	->각 동물은 10번씩만 운다.
	
		//배열써야 합격임 ㅠㅠㅠ
	ZooThread[] z = new ZooThread[3];
	for (int i = 0; i < z.length; i++) {
		z[i]=new ZooThread();
	}
	
	
//	ZooThread z1 = new ZooThread();
//	ZooThread z2= new ZooThread();
//	ZooThread z3 = new ZooThread();
		
	
	Thread chiken =new Thread(z[0],"꼬끼오");
	Thread chick =new Thread(z[1],"삐약");
	Thread cow =new Thread(z[2],"음매");
	
	chiken.start();
	chick.start();
	try {
		chiken.join();
		chick.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	cow.start();
	
	
	
	
	
	
	}
}
