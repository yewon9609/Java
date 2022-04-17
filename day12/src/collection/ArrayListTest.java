package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
		//<?> :제네릭(이름이 없는)
		// 객체로 사용할 때 타입을 지정하는 기법
		// 지정할 타입에 제한을 둘 수 있다.
		// 따로 다운캐스팅을 할 필요가 없다.
		ArrayList<Integer> arList =new ArrayList<>();
		arList.add(10);
		arList.add(20);
		arList.add(40);
		arList.add(50);
		arList.add(90);
		arList.add(80);
		arList.add(70);
		arList.add(60);

		System.out.println(arList.size());
//		System.out.println(arList.get(2));	//2번째 인덱스
		
		for (int i = 0; i < arList.size(); i++) {
			System.out.println(arList.get(i));
		}
		
//		정렬 //toString 생략 가능
		Collections.sort(arList);
		System.out.println(arList);
//		Collections.reverse(arList);
//		System.out.println(arList.toString());
//		Collections.shuffle(arList);
//		System.out.println(arList.toString());
		
		//추가(삽입)
		// 50 뒤에 500 삽입
		
		if(arList.contains(50)) {
			arList.add(arList.indexOf(50)+1, 500);
		}
		
		   // 수정
	      // 90을 9로 수정
		
		if(arList.contains(90)) {
			arList.set(arList.indexOf(90), 9);
		}
	      
		System.out.println(arList);
	      // 삭제
	      // 80 삭제
	      // 1. 인덱스로 삭제
	      // 2. 값으로 삭제

		if(arList.contains(80)) {
//			arList.remove(arList.indexOf(80));		//인덱스로 삭제
			arList.remove(Integer.valueOf(80));	//값으로 삭제
		}
		System.out.println(arList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
