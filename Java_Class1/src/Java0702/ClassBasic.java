package java0702;

public class ClassBasic {

	public static void main(String[] args) {
		
		//정의 된 클래스 타입의 공간을 생성 한다.
		// 생성된 공간에 데이터를 저장한다.
		// 클래스 타입으로 생성된 공간을 객체 또는 인스턴스라고한다.
		
		// 클래스 인스턴스 생성 - 생성자 메서드
		Member member1 = new Member();
		Member member2 = new Member();
		
		System.out.println( member1  );
		
		member1.name = "이순신";
		member1.age = 23;
		
		System.out.println( member1.name );
		System.out.println( member1.age );
		
		member2.name="김유신";
		member2.age=34;
		
		// java - 495p , 메모리최적화기법 - 893p
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "java";
		book1.page = 495;
		
		book2.title = "메모리최적화기법";
		book2.page = 893;
		
		// 스마트폰 제품명, 운영체제, 메모리(ram)크기 에 대해
		// 저장할 수 있는 클래스를 정의하고 인스턴스 생성하여
		// 값 저장 ,출력 을하세요 (스마트폰 3개)
		
		Phone 삼성폰 = new Phone();
		Phone 아이폰 = new Phone();
		Phone 샤오미 = new Phone();
		
		삼성폰.제품명 = "갤럭시s24";
		삼성폰.운영체제 = "안드로이드";
		삼성폰.메모리 = 12;
		
		아이폰.제품명 = "아이폰15";
		아이폰.운영체제 = "IOS16";
		아이폰.메모리 = 8;
		
		샤오미.제품명 = "레드미";
		샤오미.운영체제 = "하이퍼OS";
		샤오미.메모리 = 12;
		
		System.out.println( 아이폰.제품명 );
		System.out.println( 아이폰.운영체제 );
		System.out.println( 아이폰.메모리 );
	}

}
class Phone{
	String 제품명;
	String 운영체제;
	int 메모리;
	Member a = new Member();
}




//책 제목과 총페이지수를 저장하기위한 클래스 정의
class Book{
	String title;
	int page;
}


// 클래스 - 설계도,  객체 - 제품
// 클래스 - 붕어빵틀 ,  객체 - 붕어빵

// 클래스는 사용자 정의 데이터 타입 이라고 한다.
class Member{  // Member 라는 이름의 클래스 정의
	String name; //이름
	int age; //나이

}














