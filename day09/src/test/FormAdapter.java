package test;

public abstract class FormAdapter implements Form{
// 이 메소드는 써야하니까 굳이 강제성을 없애주지 않아도 된다.
//	@Override
//	public String[] getMenu() {
//		return null;
//	}

	
	//판매방식은 골라서 재정의해야 하기때문에 강제성을 없앤다.
	@Override
	public void sell(String order) {
		
	}

}
