package java_0703;

import java.util.Scanner;

public class JavaMethod4 {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		//
		
		ReturnMth rm = new ReturnMth();
		int num=rm.get();
		
		System.out.println(num);
		
		// 
		int =rm.sum();
		System.out.println();
		
		// 다음의 물음표에 들어갈 코드를 작성하여 이름과 나이가 출력되게!!
		
		String =rm.getName(); 
		String userName=;
		int age=34;
		System.out.println(userName+" "+age);
		
		// 국어(89), 영어(78), 수학(50) 세과목의 총점을 구하는 메서드
		// 세과목의 평균을 구하는 메서드
		// 총점과 평균을 출력하세요.
		System.out.println("총 합 : " + 총합);
		System.out.println("평균 : " + 평균);

	}

}

class ReturnMth{
	
	int avg() {
		int 평균 = 총합/3;
		return 평균;
	}
	
	int total() {
		int 국어 = 89, 영어 = 78, 수학 = 50;
		int 총합 = 국어 + 영어 + 수학;
		return 총합;
	}
	
	
	String getName(){
		String name="�̼���"; 
		int age=34;
		String info=name+age;
		return info;
	}
	
	int sum() {
		int num1=30, num2=45;
		int result=num1+num2;
		return result;
	}
	
	int get() {
		return 10;
	}
	
	
}
