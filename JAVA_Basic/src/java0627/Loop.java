package java0627;

import java.util.Scanner;

public class Loop {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		// 반복문 - for, while, do~while
		//for(초기값; 조건식; 증감식;) { 반복내용 }
		// 조건식이 거짓이 될 때까지 중괄호 안의 내용이 계속 실행된다.
		// 초기값 -> 조건식 -> 참이라면 -> 중괄호 -> 증감식 -> 조건식비교 -> 참이라면 -> 중괄호 -> 증감식 -> 조건식비교 -> 거짓이라면 ->끝.

//		
//		for(int i=1; i<=17; i+=2) {
//			System.out.println("반복문........"+i);
//		}
//		
//		for(int i=10; i>0; i--) {
//			System.out.println(i);
//		}
//		
//		int num = 1;
//	
//		for (int a=1; a<=3; a++ ) {
//			num = num + a;
//			System.out.println(num);
//		}
		
		// 1부터 내가 입력한 숫자까지의 총 합을 구하세요.
//		int total = 0;
//		int b = scan.nextInt();
//		for(int a=1; a<=b; a++) {
//			total = total + a;
//			System.out.println(total);
//		}
//		
		System.out.print("숫자 입력 : ");
		int number = scan.nextInt();
		
		int sum = 0;
		for(int i=1; i<=number; i++) {
			sum = sum + i;
		}
		System.out.print("총합 : " + sum);
		
		
//		for(; num1!=0; ) {
//			System.out.println("정수 입력 : ");
//			int num = scan.nextInt();
//			if(num == 0) break;
//		}
		
		// 무한루프 종료시키는법
		// 1.if문의 조건식이 참이되면 break 실행
		// 2 for( ; 조건식 ;)
		// 3. return; = 반복문코드가 있는 메서드릴 종료시키기때문에 반복문도 종료된다.
		// break; - 반복문, switch 사용가능
		//			if문 단독으로 break 사용불가
		// if(10>5) break; -> 오류!
		
		//continue
		
		for (int i=1; i<=10; i++) {
			System.out.println(i+"번째 반복 시작");
			if(i%3 == 0) continue;
			System.out.println(i+"번째 반복 진행중");
			System.out.println(i+"번째 반복 마지막 내용");
		}
		
		// 자바의 랜덤
		int random = (int)Math.floor(Math.random()*10)+1;
	}

}
