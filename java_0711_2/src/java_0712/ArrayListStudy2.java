package java_0712;

import java.util.ArrayList;

import Collection.Member;

public class ArrayListStudy2 {

	public static void main(String[] args) {
		
		ArrayList<Asset> list1 = new ArrayList<Asset>();
		
		list1.add( new Asset( "우리은행", 3450000, "이순신", "1004-91-123455"));
		list1.add( new Asset( "농협", 513350, "김유신", "34-123-349393"));
		list1.add( new Asset( "신한은행", 891003, "박팽년", "394-3412-2323"));
		list1.add( new Asset( "국민은행", 899900, "최무선", "39-2384-19939"));
		list1.add( new Asset( "우리은행", 28300, "문익점", "1002-93-878888"));
		list1.add( new Asset( "신한은행", 98000, "이율곡", "293-0123-1234"));
		list1.add( new Asset( "우리은행", 1920000, "김시민", "1006-23-123456"));
		list1.add( new Asset( "국민은행", 932000, "이율곡", "23-2555-29991"));
		
		
		System.out.println("=====우리은행을 이용하는 사람들=====");
		for( Asset 우리 : list1) {
			if( 우리.getBank().equals("우리은행")) {
				System.out.println( 우리 );
			}
		}
		
		System.out.println("=====잔액이 100만 이상인 사람들=====");
		list1.forEach( 백만 -> {
			if(백만.getBalance() >= 1000000) {
				System.out.println( 백만 );
			}
		});
		// list.forEach( a -> 실행코드 );
		// list.forEach( a -> {실행코드; 실행코드; });
		
		System.out.println("=====최무선이 우리은행 계좌를 가지고 있는가?=====");
		Asset asset = new Asset("우리은행", 0, "최무선", "1007-23-128954");
		if( !list1.contains(asset)) {
			list1.add(asset);
		}
		list1.forEach( info -> System.out.println( info ));
		
		System.out.println("=====없으면 우리은행 개설 1007-23-128954=====");
		
		
	}
	
	

}
