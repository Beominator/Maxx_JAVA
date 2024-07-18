package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStudy1 {

	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		
		list.add( new Member( "이순신", 34, "19900405"));
		list.add( new Member( "김춘추", 32, "19920505"));
		list.add( new Member( "정도전", 21, "20031207"));
		list.add( new Member( "장보고", 28, "19961109"));
		list.add( new Member( "홍길동", 36, "19880827"));
		
		System.out.println( list );
		
		for( Member m : list ) {
			if( m.getAge() >= 30)
			System.out.println( m );
	}
		
	System.out.println("=====1995년 이후에 태어난 사람들=====");
	for( Member m : list) {
		String temp = m.getBirth().substring( 0,4 );
		int year = Integer.parseInt(temp);
		if( year > 1995)
			System.out.println( m );
	}
	
	// 8월, 9월, 10월, 11월에 태어난 사람만 출력
	
	System.out.println("=====8월, 9월, 10월, 11에 태어난 사람들=====");
	for( Member m : list) {
		String temp = m.getBirth().substring( 4,6 );
		int day = Integer.parseInt(temp);
		if( day == 11) {
			System.out.println( m );
		}else if( day == 10) {
			System.out.println( m );
		}else if( day == 9) {
			System.out.println( m );
		}else if( day == 8) {
			System.out.println( m );
		}
	}
	list.add(2,new Member("장영실", 34, ""));
	System.out.println( list );
	
	// 생년월일이 없는 사람을 찾아서 그 사람의 나이를 보고 년도를 넣고 0월0일로 저장되게 하라.
	for ( Member mem : list) {
		if( mem.getBirth().isBlank()) {
			int year = 2024 - mem.getAge();
			mem.setBirth( year + "0000");
			
		}
	}
	System.out.println( list );
	
	// 개발자가 정의한 클래스를 컬렉션에 사용하는 경우
	// 컬렉션의 메서드 들을 온전히 사용하려면 필요한 메서드를
	// 클래스에 구현해야 한다.
	// 필요한 메서드는 최상위 부모 클래스인 Object가 가지고있다.
	// 추가로 컬렉션에 관련된 인터페이스를 implements 하기도 한다.
	
	Member t = new Member("장보고", 28, "19961109");
	
	System.out.println(list.indexOf(t));		// Member 클래스 객체를 indexOf에 넣어서 찾기
	
	list.remove(t);
	System.out.println( list );
	
	list.forEach( m -> System.out.println( m ));
	
	Member[] mem = list.toArray( new Member[list.size()]);
	
	for(Member mm : mem) {
		System.out.println( mm );
	}
	
	// 정렬
	Collections.sort( list );
	System.out.println("=====정렬 후=====");
	list.forEach(m -> System.out.println( m ));
	
	
	
	
	
}
}