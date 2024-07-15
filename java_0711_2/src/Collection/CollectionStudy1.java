package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionStudy1 {

	public static void main(String[] args) {
		
		// Byte - byte
		// Short - short
		// Integer - int
		// Long - long
		// Float - float
		// Double - double
		// Character - char
		// Boolean - boolean
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add( 89 );
		list1.add( 230 );
		list1.add( 4542 );
		list1.add( 3434 );
		list1.add( 2 );
		
		System.out.println( list1 );
		System.out.println( list1.get(2) );
		
		for( int i = 0; i < list1.size(); i++) {
			System.out.println( list1.get(i) );
		}
		
		System.out.println( list1.indexOf(232));
		System.out.println( list1.contains(3434));
//		list1.remove(230);
//		System.out.println( list1 );
//		
		System.out.println(list1.isEmpty());
		
		list1.add(1,450);
		System.out.println( list1 );
		System.out.println(list1.lastIndexOf(230));
		
		list1.forEach(n -> System.out.println(n));
		
		list1.set(3, 15);
		System.out.println( list1 );
		
		Integer[] number = list1.toArray(new Integer[list1.size()]);
		
		Integer[] aa = new Integer[3];
		aa[0] = 10;
		aa[1] = 20;
		aa[2] = 30;
		
		ArrayList<Integer> alist = new ArrayList<Integer>(Arrays.asList(aa));
		
		Collections.sort( list1 );
		System.out.println( list1 );
		
		list1.remove(Integer.valueOf(89));
		System.out.println( list1 );
		
		// 김춘추, 장영실, 이성계, 정몽주, 정도전, 김정호
		// 위 이름을 ArrayList에 저장하고 출력하세요.
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("김춘추");
		list2.add("장영실");
		list2.add("이성계");
		list2.add("정몽주");
		list2.add("정도전");
		list2.add("김정호");
		
		System.out.println( list2 );
		
		Collections.sort( list2 );
		System.out.println( list2 );
		
		for( String name : list2) System.out.println( name );
		
		// 이름이 저장되어있는 ArrayList에 이순신이 없으면 추가 저장하고 있으면 저장 안 하기
		
		if(!list2.contains("이순신")) {
		list2.add(6, "이순신");
		}
		System.out.println( list2 );
		
		Collections.sort( list2 );
		System.out.println( list2 );
		
		for( String name : list2) System.out.println( name );
		
		// p.631 만 익혀도 된다.
		
	}

}

/*
	자바 컬렉션 프레임워크
	
	데이터를 저장, 관리하기 위한 자료구조와 
	데이터를 처리, 가공하는 알고리즘이 구현되어있는
	클래스들의 집합체
	
	Collection, Map 인터페이스
	
	Collection 인터페이스
		- List 인터페이스
			ArrayList 클래스/
			Vector
			LinkedList/
			Stack/		데이터의 순서표현
			Queue/		데이터의 순서표현
		- Set 인터페이스
			HashSet/	그룹화
			TreeSet/	검색, 정렬
			LinkedHashSet
			
	Map 인터페이스
		- HashMap/		그룹화
		- TreeMap/		검색, 정렬
		- LinkedHashMap
*/