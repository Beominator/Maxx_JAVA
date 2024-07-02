package java0702;

public class ClassBasic {

	public static void main(String[] args) {
		// 정의된 클래스 타입의 공간을 생성한다.
		// 생성된 공간에 데이터를 저장한다.
		// 클래스 타입으로 생성된 공간을 객체 또는 인스턴스라고한다.
//		Member member1 = new Member();
//		Member member2 = new Member();
//		
//		System.out.println( member1 );
//		
//		member1.name = "이순신";
//		member1.age = 23;
//		
//		System.out.println( member1.name );
//		System.out.println( member1.age );
//		
//		member2.name = "김유신";
//		member2.age = 34;
//		
//		System.out.println( member2.name );
//		System.out.println( member2.age );
//		// java - 495p, 메모리최적화기법 - 893p
//		Book book1 = new Book();
//		Book book2 = new Book();
//		
//		book1.title = "java";
//		book1.page = 495;
//		
//		book2.title = "메모리최적화기법";
//		book2.page = 893;
		
		// 스마트폰 제품명, 운영체제, 메모리(ram)크기에 대해 저장할 수 있는 클래스를 정의하고
		// 인스턴스 생성하여 값 저장, 출력을 하세요. (스마트폰 3개)
		


	
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		Phone phone3 = new Phone();
		
		phone1.name = "iPhone";
		phone1.cpu = "A17";
		phone1.ram = 8;
		
		phone2.name = "Galaxy";
		phone2.cpu = "oneui";
		phone2.ram = 8;
		
		phone3.name = "Hwawei";
		phone3.cpu = "harmony";
		phone3.ram = 8;
		
		System.out.println( phone1.name );
		System.out.println( phone1.cpu );
		System.out.println( phone1.ram );
		
		System.out.println( phone2.name );
		System.out.println( phone2.cpu );
		System.out.println( phone2.ram );
		
		System.out.println( phone3.name );
		System.out.println( phone3.cpu );
		System.out.println( phone3.ram );
		
	}



	
}


// 책 제목과 총페이지수를 저장하기위한 클래스 정의
//class Book{
//	String title;
//	int page;
//}
//
//
//
//
//// 클래스 - 설계도, 객체 - 제품
//// 클래스는 사용자 정의 데이터 타입이라고 한다.
//class Member{		// Member 라는 이름의 클래스 정의
//	String name;	// 이름
//	int age;		// 나이
//	Member(){
//		
//	}
//}

class Phone{
	String name;
	String cpu;
	int ram;
//	
	}