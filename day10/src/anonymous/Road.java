package anonymous;


public class Road {
	public static void main(String[] args) {
		
		Knotted jamsil = new Knotted();
		jamsil.branchName = "잠실점";
		
		Form apple = new Form() {
			
			@Override
			public void sell(String order) {
				// TODO Auto-generated method stub
			
			}
			
			@Override
			public String[] getMenu() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		jamsil.register(apple);
	}
}
