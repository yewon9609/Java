package anonymous;
public class Knotted {
	
	public String branchName;
	//등록하기 메소드
	// form은 구현이 되어야지만매개변수로 전달받을수 있음 
	public void register(Form form) {
		String[] menus = form.getMenu();
		System.out.println("=====`===" + branchName + " 도넛 메뉴========");
		for (int i = 0; i < menus.length; i++) {
			System.out.println(i + 1 + ". " + menus[i]);
		}
		
		form.sell("민트초코");
	}
}
