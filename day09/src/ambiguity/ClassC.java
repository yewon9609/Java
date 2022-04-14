package ambiguity;

public class ClassC implements InterA, InterB {

	@Override
	public void printData() {
		// TODO Auto-generated method stub
		InterA.super.printData();
	}



}
