package test;

public class Road {
	public static void main(String[] args) {
		//직영점
		Nike dms1 = new Nike();
		Nike dms2 = new Nike();
		
		dms1.shopname = "<직영점>";
		dms2.shopname = "<무료나눔점> ";

		
		dms1.register(new Form() {
			
			@Override
			public void sell(String order) {
				String[]menus = getMenu();
				for (int i = 0; i < menus.length; i++) {
					if(menus[i].equals(order)) {
						
						System.out.println("'"+order+"' 주문이 완료되었습니다.");
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				String[]menus = {"티셔츠", "바지", "운동화", "양말"};
				return menus;
			}
		});
								//업캐스팅
		dms2.register(new FormAdapter() {
			@Override
			public String[] getMenu() {
				String[]menus = {"티셔츠", "바지", "운동화", "양말"};
				return menus;
			}
		});
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
