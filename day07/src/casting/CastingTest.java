package casting;


class Car{
	
	void engineStart() {
		System.out.println("열쇠로 시동 킴");
	}
	
	
	
	
	
}
class SuperCar extends Car{
	
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 킴");
	}
	
	void openRoof() {
		System.out.println("지붕 염");
	}
	
	
	
}



public class CastingTest {
	public static void main(String[] args) {
		
	
		
	Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
//		ferrari.engineStart();
	
		//up casting 모든 자식은 부모타입이다.(단 부모는 자식타입이 아니다)
	Car noOptionFerrari = new SuperCar();
	
	noOptionFerrari.engineStart();
		
		//down casting
		//업캐스팅 객체를 자식타입으로 다시 강제 형변환 
	SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		
		
		
		System.out.println(matiz instanceof Car);
		  // matiz instanceof Car                     : true
      // matiz instanceof SuperCar               : false
//      System.out.println(matiz instanceof SuperCar);
      // ferrari instanceof Car                     : true
//      System.out.println(ferrari instanceof Car);
      // ferrari instanceof SuperCar               : true
//      System.out.println(ferrari instanceof SuperCar);
      // noOptionFerrari instanceof Car         : true
//      System.out.println(ferrari instanceof SuperCar);
      // noOptionFerrari instanceof SuperCar   : true
//      System.out.println(ferrari instanceof SuperCar);
      // fullOptionFerrari instanceof Car         : true
//      System.out.println(ferrari instanceof SuperCar);
      // fullOptionFerrari instanceof SuperCar   : true
//      System.out.println(ferrari instanceof SuperCar);

		
		
//		
//		Car matiz = new Car();
//		SuperCar ferrari = new SuperCar();
		//up casting : 자식 값을 부모타입으로 형변환 
		//자식은 무조건 부모보다 기능이 많거나 같
			//superCar : 자식 ----> Car :부모
//		Car noOptionFerrari = new SuperCar();
//		noOptionFerrari.engineStart();
		
		//down casting:업캐스팅 된 객체를 자식타입으로 형변환
			//noOptionFerrari = 업캐스팅 된 객체 앞에 (SuperCar)로 다운캐스팅 
		
	
//		다운캐스팅을 하는 이유 ? 만약 up casting 으로 자식 값을 전달받았다면, 자식에서 새롭게 구현한 기능들은 사용할 수
//		없기 때문에 down casting을 통해서 복구하고 사용한다.
//		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
//		fullOptionFerrari.openRoof();
		
		//오류(단 부모는 자식타입이 아니다)
//		SuperCar brokenFerrari = (SuperCar)new Car();
		
		

//		객체 간 타입 비교
//		instanceof
//			a instanceof A : 조건식, 참 또는 거짓 하나가 나오는 식
//			-a가 A타입이면 true
//			-a가 A타입이 아니면 false
		
		// matiz instanceof Car							: true
//		System.out.println(matiz instanceof Car);
		// matiz instanceof SuperCar					: false
//		System.out.println(matiz instanceof SuperCar);
		// ferrari instanceof Car							: true
//		System.out.println(ferrari instanceof Car);
		// ferrari instanceof SuperCar					: true
//		System.out.println(ferrari instanceof SuperCar);
		// noOptionFerrari instanceof Car			: true
//		System.out.println(ferrari instanceof SuperCar);
		// noOptionFerrari instanceof SuperCar	: true
//		System.out.println(ferrari instanceof SuperCar);
		// fullOptionFerrari instanceof Car			: true
//		System.out.println(ferrari instanceof SuperCar);
		// fullOptionFerrari instanceof SuperCar	: true
//		System.out.println(ferrari instanceof SuperCar);
		

		
		
		
		
//		noOptionFerrari.engineStart();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//강제형변환	//new car는 값이 된다.
//		SuperCar brokenFerrari = (SuperCar)new Car(); 	 	//그치만 강제형변환 불가능, +a를 못채워서 (오류뜸)
		
		
	
		
	}
}
