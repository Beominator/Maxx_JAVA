package java0702_2;

import java.util.Arrays;

public class ClassObject {

	public static void main(String[] args) {
//		Arrays.toString(null);
		System.out.println( Car.제조사 );
		
		Car car1;
		
		car1 = new Car(); // carName, 배기량, 연료 변수 생성
		car1.carName="쏘나타";
		car1.연료 = "휘발유";
		car1.제조사 = "기아";
		System.out.println( Car.제조사 );
		
		
		
		Car car2 = new Car("그랜져",3000,"휘발유");
		
	/*
		데이터 : 이름 , 포인트 , 평점
		       김건우 ,  4580,  4.3
		       김경제 ,  3485,  4.1
		       박재범 , 90930,  2.7
		       서석완 , 19200,  3.1
		 
		웹소설 작가들의 구독자 평점과,  소설 뷰횟수에 따른 포인트점수이다.
		위 내용을 저장 할 수 있는 클래스를 정의하고 데이터 입력후 출력하세요
		( 매개변수 있는 생성자 메서드는 두개 이상 구현 )
	*/
		
		WebNovel author1 = new WebNovel("김건우", 4580, 4.3f);
		WebNovel author2 = new WebNovel("김경제",3485,4.1f);
		
		System.out.println( author1.name +" "+ author1.rating );
		System.out.println( author1.point );
		System.out.println( author1 );
	}

}

class WebNovel{
	String name; // 이름 - 인스턴스변수
	int point; // 포인트점수 - 인스턴스변수
	float rating; // 평점 - 인스턴스변수
	WebNovel(){
		
	}
	WebNovel(String name){
		this.name = name;
	}
	
	WebNovel(String name, int point, float rating){
		this.name = name;
		this.point=point;
		this.rating = rating;
	}
	
	public String toString() {
		return name+" "+ point+"점  "+ rating;
	}
}


// 클래스 내부에 선언되는 변수(또는 배열)는  두가지가 있다.
//  클래스 변수 , 인스턴스 변수 
// 인스턴스변수는  클래스 객체 생성시 메모리 할당이된다.
//  클래스 객체 생성은 new 연산자를 통한다.
// 클래스 변수는 프로그램 실행 할때 메모리에 로드하면서 생성된다.

// 생성자 메서드 - 객체(인스턴스) 공간을 생성할때 공간 초기화 해주는 메서드
// 생성자 메서드 - return이 존재하지않는다. , 
//              return을 하면 안되는이유가 생성자메서드에는 return 타입
//              지정이 안되기 때문에 
// 오버로딩 - 오버로딩 구현 조건
//       1. 동일 클래스에서만 가능하다.
//       2. 메서드의 이름은 같아야 한다.
//       3. 매개변수의 타입은 다르게 선언되어야 한다.
//       4. 매개변수의 갯수가 달라야 한다.

class Car{
	static String 제조사 = "현대"; //클래스 변수 
	
	String carName; // 인스턴스 변수
	int 배기량; // 인스턴스 변수
	String 연료 = "휘발유"; // 인스턴스 변수
	
	// 생성자 메서드
	Car(){
		// 생성자메서드의 내용 - 인스턴스변수의 초기값 지정
		연료="휘발유"; // new 연산자에 의해 객체 생성시 연료변수에 
		             // 휘발유 저장된다.
	}
	// 매개변수가 있는 생성자 메서드
	Car(String 연료, float ㅁㅁ, String aa){
		
	}
	Car(String 연료, String aa, float ㅁㅁ){
		this.연료 = 연료;
	}
	Car( String carName , int cc , String fuel){
		this.carName = carName;
		배기량=cc;
		this.연료 = fuel;
	}
}



















