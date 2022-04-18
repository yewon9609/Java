package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		//아이디 , 비밀번호, 이름 , 나이
		
		HashMap<String, Object>userMap = new HashMap<>();
		userMap.put("id", "hds1234");
		userMap.put("pw", "1234");
		userMap.put("name", "한동석");
		userMap.put("age", 20);
		
		System.out.println(userMap.size());          //한쌍씩 계산
		System.out.println(userMap.get("id")); 		//key값을 전달,value값이 나옴 
		
		System.out.println(userMap);
		
		
		Iterator<Entry<String, Object>> iter =userMap.entrySet().iterator();
		
		while(iter.hasNext()) {
			Entry<String, Object>entry = iter.next();
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
