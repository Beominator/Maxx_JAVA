package study1;

import java.util.ArrayList;

public class Study2 {
	
	public static void main(String[] args) {
		// 자바의 자료구조
		// 자바구조란 데이터를 효율적으로 저장 관리하기 위한 구조
		
//		ArrayList<String> arr = new ArrayList<String>();
//		
//		arr.add("이순신");
//		arr.add("김경제");
//		arr.add("송영진");
//		arr.add("송미연");
//		
//		System.out.println( arr ); 		// 확인용. 출력용 아님.
//		
//		for(int i=0; i < arr.size() ; i++) {
//			System.out.println( arr.get(i) );
//		}
//		
//		for( String name : arr) {
//			System.out.println( name );
//		}
		
		// ArrayList를 사용하기. - 어려우면 정적배열로 String[] 방식
		// 이름 10개 저장
		// 이름 중에서 김씨만 출력하기.
		
		
//		ArrayList<String> name = new ArrayList<String>();
//		name.add("이순신");
//		name.add("김춘추");
//		name.add("김유신");
//		name.add("강감찬");
//		name.add("정약용");
//		name.add("김무열");
//		name.add("김경호");
//		name.add("제갈량");
//		name.add("계백");
//		name.add("박효신");
	
		String[] nam = new String[10];
		nam[0] = "이순신";
		nam[1] = "김춘추";
		nam[2] = "김유신";
		nam[3] = "강감찬";
		nam[4] = "정약용";
		nam[5] = "김무열";
		nam[6] = "김경호";
		nam[7] = "제갈량";
		nam[8] = "계백";
		nam[9] = "박효신";
//		for(String name1 : name) {
//			if(name.contains("김"));
//			System.out.println( name1 );
		for(int i=0; i<nam.length; i++) {
			if(nam[i].contains ("김")) {
				System.out.println( nam[i] );
		}
		}
	}

}
