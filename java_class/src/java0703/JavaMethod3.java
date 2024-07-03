package java0703;

import java.util.Scanner;

public class JavaMethod3 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		

	// 정수 두개 입력받아 합을 출력하기.
//		Calc calc = new Calc();
		TestMethod testMethod = new TestMethod();
//		calc.sum(40,10);
		//calc.sum();
		
//		// 세 과목의 총점을 구하여 출력하세요.
//		int kor = 89, eng = 74, mat = 43;
//		calc.sum(kor, eng, mat);
//		
		// 메서드 호출하여 '메서드 dog쉽네~' 라고 출력
		String msg = "메서드 dog쉽네~";
//		calc.msg();
//		calc.view();
//		calc.std();
		
		// 메서드를 호출하여 이름과 나이를 출력하세요.
		// 매개변수 없는 메서드, 키보드를 입력 x
		
		// 메서드를 호출하여 아래의 데이터를 출력하세요.
		String animal = "골드리트리버";
		String 공고일 = "2024-07-01";
//		testMethod.paper(animal, 공고일);
		
		// 다음 날짜중에서 월과 일만 출력하세요.
		// 문자열 메서드 substring 또는 split 사용.
//		String examDate = "2024-08-13";
//		testMethod.Date(examDate);
		
		// 네 사람의 나이 평균 값을 구하여 출력하세요.
		// 평균값은 정수입니다.
		int 흥민 = 31, 강인 = 23, 희찬 = 28, 재범 = 37;
		testMethod.avg(흥민, 강인, 희찬, 재범);
	}

}

class TestMethod{
	void avg(int 흥민, int 강인, int 희찬, int 재범) {
		int avg = (흥민 + 강인 + 희찬 + 재범)/4;
		System.out.println("평균 나이 : " + avg);
	
	
	
	
	
//	void Date(String examDate) {
//	String Date = examDate.substring(examDate.indexOf("-")+1);
//	System.out.print( Date );
//		String[] current = examDate.split("-");
//		System.out.println(current[1]+" "+current[2]);
//	
	
//	void paper(String animal, String 공고일) {
//		
//		System.out.print(animal + " \n" + 공고일);
//	}
}

// 인스턴스 메서드, 인스턴스 변수는 객체(인스턴스)를 통해 사용
// 클래스 메서드, 클래스 변수는 클래스 이름으로 사용!

class Calc{
	
	void std() {
		String name1 = "이순신", name2 = "김유신";
		int age1 = 35, age2 = 33;
		System.out.print(" 이름 : " + name1 + " 나이 : "+ age1 + "\n" + " 이름 : " + name2 + " 나이 : "+ age2);
		
	
//	void view() {		// 변수 a,b의 값 출력하는 메서드
//		int a = 10, b = 20;
//		System.out.print(a + "\n" + b);
	}

//	void msg() {
//		System.out.print("메서드 dog쉽네~");

//	void sum(int kor, int eng, int mat) {
//		int result = kor + eng + mat;
//		System.out.print("합 : "+result);
//	void sum(int num1, int num2) {
//		int result = num1 + num2;
//		System.out.print("합 : "+result);
//	}
//	
//	void sum() {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("첫번째 정수 : ");
//		int num1 = scan.nextInt();
//		System.out.print("두번째 정수 : ");
//		int num2 = scan.nextInt();
//		int result = num1 + num2;
//		System.out.print("합 : "+result);
//	}
//	}
}
}