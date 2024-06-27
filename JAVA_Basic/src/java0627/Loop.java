package java0627;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
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
		
		
		
	}

}
