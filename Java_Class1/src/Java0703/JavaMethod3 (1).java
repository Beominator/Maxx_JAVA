package java0703_1;

import java.util.Scanner;

public class JavaMethod3 {

	public static void main(String[] args) {
		
		// 정수 두개 입력 받아 합을 출력하기
		Calc calc = new Calc();
		calc.sum(40,10);
		
		//calc.sum();
		
		// 세과목의 총점을 구하여출력하세요
		int kor =89 , eng=74, mat=43;
		calc.scoreTotal(kor, eng, mat);
		
		
		// 메서드 호출하여 '메서드 dog쉽네~' 라고 출력
		calc.easy();
		calc.view(); //view 메서드 호출
		
		//메서드를 호출하여 이름과 나이를 출력하세요
		// 매개변수 없는 메서드, 키보드를 입력 X
		calc.infoPrint();
		
		
		//메서드를 호출하여 아래의 데이터를 출력하세요
		String animal="골드리트리버";
		String 공고일 ="2024-07-01";
		TestMethod testMethod = new TestMethod();
		testMethod.animalStray(animal, 공고일);
		
		//다음 날짜중에서 월과 일 만 출력하세요
		// 문자열 메서드 substring 또는 split 사용
		String examDate = "2024-08-13";
		testMethod.datePrint(examDate);
		
		// 네 사람의 나이 평균 값을 구하여 출력하세요
		// 평균값은 정수입니다.
		int 흥민=31, 강인 = 23, 희찬 = 28,  재범=37;
		testMethod.ageAvg( 흥민, 강인, 희찬, 재범 );
	}

}
class TestMethod{
	
	void ageAvg( int 손, int 이 , int 황, int 박 ) {
		int total = 손+이+황+박;
		int avg = total/4;
		System.out.println("나이 평균 : " + avg);
	}
	
	void datePrint( String date ) {
		String[] current = date.split("-");
		System.out.println( current[1] +"  "+ current[2] );
	}
	
	void animalStray( String animal , String 공고일 ) {
		System.out.println( animal +" "+ 공고일 );
	}
	
}


// 인스턴스 메서드, 인스턴스 변수는 객체(인스턴스)를 통해 사용
// 클래스 메서드, 클래스변수는 클래스이름으로~~~사용

class Calc {
	
	 void infoPrint(  ) {
		String name="김경호";
		int age=51;
		System.out.println( name+" "+age );
	}
	
	void view() { // 변수a,b 의 값 출력하는 메서드
		int a=10, b=20; 
		System.out.println( a+" "+ b );
	}
	
	void easy() {
		System.out.println("메서드 dog쉽네~");
	}
	
	
	void scoreTotal( int k , int e, int m ) {
		int total = k+ e+ m;
		System.out.println("총점 : " +total);
	}
	
	
	void sum(int num1 , int num2) {
		int result = num1+ num2;
		System.out.println("합 : "+result);
	}
	
	
	void sum() {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = scan.nextInt();
		int result = num1 + num2;
		System.out.println("합 : " + result);
	}
}










