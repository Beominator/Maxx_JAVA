package study1;

import java.util.Scanner;

public class MainStudy {

	public static void main(String[] args) {
		
//		// 정수 데이터 12개 저장할 수 있는 배열 만들기.
//		
//		int[] arr = new int[12];
//		
//		// 5개 실수 데이터 저장할 수 있는 배열만들기.
//		float[] arr1 = new float[5];
//		
//		// 4명의 이름을 저장할 수 있는 배열
//		String[] name = new String[4];
//		
//		Member[] mem = new Member[120];
//		mem[0].age = 10;
		
//		// 정수 데이터 42개 저장한다.
//		int[] bb = new int[42];
//		
//		// 10,20,30,40,50 을 배열에 저장
//		int[] cc = new int[5];
//		cc[0] = 10;
//		cc[1] = 20;
//		cc[2] = 30;
//		cc[3] = 40;
//		cc[4] = 50;
//		
//		for( int i=0; i<cc.length; i++) {
//			System.out.println( cc[i]);
//		}
		
//		int[] width = new int[] {10,20,30,44,55,11,22,33,66,77};
//		for(int i=0; i<width.length; i++) {
//			System.out.println(width[i]);
//		}
//		
//		String[] we = new String[] {"이순신", "김유신","김춘추","장보고","장영실","이사부","이성계","계백","을지문덕"};
//		for(int i=0; i<we.length; i++) {
//			System.out.println( we[i] );
//		}
		
		// 7개 정수 저장할 배열
		int[] seven = new int[7];
		Scanner sc = new Scanner(System.in);
//		for( int i=0; i<seven.length; i++) {
//			System.out.println("정수 입력 : ");
//			seven[i] = sc.nextInt();
//		}
		
		// 6명의 몸무게를 입력하세요.(소수점 1자리까지만.)
		// 입력하고 출력까지
		
//		float[] six = new float[6];
//		for(int i=0; i<six.length; i++) {
//			System.out.println("몸무게 입력 : ");
//			six[i] = sc.nextFloat();
//			
//		}
//		// 몸무게가 저장된 배열에서 몸무게가 50 이상만 출력
//		for(int i=0; i<six.length; i++) {
//			if(six[i]>=50) {
//				System.out.println(six[i]);
//			}
//		}
		
		
		// number 배열의 값 출력
		// 짝수만 출력하세요.
		int[] number = new int[] {55, 44, 33, 88, 99, 54, 14, 28, 91, 4, 6, 9};
		for(int i = 0; i < number.length; i++) {
			if(number[i]%2 == 0) {
				System.out.println(number[i]);
			}
		}
	

	}
}