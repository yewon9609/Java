package bakery;

public class BreadPlate {
	//클래스 객체 싱글톤이라 private을 붙인다.
	private static BreadPlate plate;
	
//메소드 2개 
//1. 빵만드는 메소드
//2. 빵 먹는 메소드
	int breadCount;
	int eatCount;
	
	//싱글톤 패턴 
	//객체가 한개만 있어야하니까 (빵집은 한개니까) 생성자를 막아줘야한다. 
	private BreadPlate() {;	}
	
	
	public static BreadPlate getInstance() {
		if(plate ==null) {
		plate = new BreadPlate(); //싱글톤이라 new를 한번만 선언해야한다. 
		}
		return plate;
	}
	
	public synchronized void makeBread() {
		if(breadCount >9) {	//열개가 되는 순간
			System.out.println("빵이 가득 찼습니다.");
			try {
				wait();		//멈추는 메소드 , 더이상 컴파일러가 밑으로 내려가지 않음 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		breadCount++;
		System.out.println("빵을 1개 만들었습니다. 총: "+breadCount+"개");
	}
	
	public synchronized void eatBread() {
		if(eatCount ==20) {
			System.out.println("빵이 다 떨어졌습니다.");
		}else if(breadCount<1) {
			System.out.println("🍞🍞🍞빵을 만들고 있어요!🍞🍞🍞 ");
		}else {
			breadCount--;
			eatCount++;
			System.out.println("빵을 1개 먹었습니다. 총 : "+breadCount+"개");
			notify();	//wait()메소드를 꺠우는 메소드 
		}
	}
	
	
	
	
	
	
}
