package test;

public class Nike {
	//직영점
	public String shopname;
	//등록
	public void register(Form form) {
		String[] menus = form.getMenu();
		System.out.println("=========="+shopname+"나이키 메뉴===========");
		for (int i = 0; i < menus.length; i++) {
			System.out.println(menus[i]);
		}
		if(form instanceof FormAdapter) {
			System.out.println("'무료 나눔 직영 점' 입니다.");
		}else {
			form.sell("티셔츠");
		}
	}
	
	
	
}
