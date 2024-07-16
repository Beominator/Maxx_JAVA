package java_0716;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapStudy1 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();		// 두가지 타입의 Class
		
		map.put("이순신", 19990405);
		map.put("김춘추", 19990101);
		map.put("장영실", 20110718);
		map.put("이도", 20051103);
		map.put("김춘추",20091010);
		map.put("이성계", 19880305);
		
		map.putIfAbsent("장영실", 1222);	// map에 키가 존재한다면 저장 안함.
		
		System.out.println( map );
		
		// key에 매칭되는 value 출력
		System.out.println( map .get("이도"));	// map.get(key)
		
		// 수정
		map.replace("이성계", 19760505);
		
		System.out.println( map );
		
		// 확인
		System.out.println( map.containsKey("김정호") );
		System.out.println( map.containsValue(1222) );
		System.out.println( map.isEmpty() );
		System.out.println( map.size() );
		
		// set 또는 collection 변환
		Set<String> keys = map.keySet();
		
		System.out.println( keys );
		for(String name : keys) {
			System.out.println( map.get(name) );
		}
		
		List<Integer> birth = new ArrayList<> (map.values());
		System.out.println( birth );
		
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		
		map.forEach((k,v) -> System.out.println(k+" "+v));
	}

}
/*
	HashMap
	 - 순차적으로 저장되지 않는다.
	 - key : value
	 - key 중복 허용되지 않는다.
	 - value 중복 허용.
	 - Map은 색인 검색에 특화되어있다.
	 - 메모리 공간을 많이 소비한다. 서버에 부담이 될 수도 있다.
	 - 
*/
