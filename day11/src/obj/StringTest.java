package obj;


public class StringTest {
	public static void main(String[] args) {
		//값을 우선시하기떄문에 constant pool주소를 비교함
		String data1 = "ABC";
		String data2 = "ABC";
		//필드를 우선시하기 때문메 필드의 주소를 비교함(위의 data1,2와 constant pool주소는 같음)
		String data3 =new String("ABC");
		String data4 =new String("ABC");
		
		System.out.println(data1==data2);
		System.out.println(data1.equals(data2));
		
		//equals 는 String클래스에 값을 비교하는거로 재정의 됌.
		System.out.println(data3==data4);
		System.out.println(data3.equals(data4));
	}
}
