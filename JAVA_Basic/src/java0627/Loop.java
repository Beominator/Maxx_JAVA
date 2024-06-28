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
//		System.out.print("숫자 입력 : ");
//		int number = scan.nextInt();
//		
//		int sum = 0;
//		for(int i=1; i<=number; i++) {
//			sum = sum + i;
//		}
//		System.out.print("총합 : " + sum);
//		
		
//		for(; num1!=0; ) {
//			System.out.println("정수 입력 : ");
//			int num = scan.nextInt();
//			if(num == 0) break;
//		}
		
		// 무한루프 종료시키는법
		// 1.if문의 조건식이 참이되면 break 실행
		// 2 for( ; 조건식 ;)
		// 3. return; = 반복문코드가 있는 메서드 종료시키기때문에 반복문도 종료된다.
		// break; - 반복문, switch 사용가능
		//			if문 단독으로 break 사용불가
		// if(10>5) break; -> 오류!
		
		//continue
		
//		for (int i=1; i<=10; i++) {
//			System.out.println(i+"번째 반복 시작");
//			if(i%3 == 0) continue;
//			System.out.println(i+"번째 반복 진행중");
//			System.out.println(i+"번째 반복 마지막 내용");
//		}
		
		// 자바의 랜덤
		// int random = (int)Math.floor(Math.random()*10)+1;
		
		// 랜덤의 범위 (1~50)
		// 랜덤 값 계속 출력
		// 랜덤값이 11의 배수일 경우 반복문 종료.
		
		
//		for (int i=1; true; i++) {
//			//int random = (int)Math.floor(Math.random()*50)+1;
//			int num1 = (int)(Math.random()*50)+1;
//			if(num1%11 == 0) break;
//			
//			System.out.println(num1);
//			
//	}
//		
		// up & down 만들기
		// 컴퓨터가 제시한 숫자 맞추기.
		// 컴퓨터가 제시하는 숫자는 랜덤으로( 랜덤범위 20~100 )
		// 컴퓨터가 제시한 숫자가 74라면
		// 내가 입력한 숫자가 40일 경우 up이라고 출력
		// 내가 입력한 숫자가 80일 경우 down이라고 출력
//		int com = (int)(Math.random()*81)+20;
//		for ( ;true;) {
//			int user = scan.nextInt();
//			System.out.print("20~100 사이입력 : "+user);
//			
//			
//		if(user < com) {
//			System.out.print("up");
//		}else  if(user == com){
//			System.out.print("정답");
//			break;
//		}else {
//			System.out.print("down");
//		}
//		}
		
		// 이름이 있는 반복문
//		
//		int sum=0;
//		
//		출력:
//		
//		
//		더하기 : for(int i=1; i<=10; i++) {
//			for( int k=1; k<=4; k++) {
//				if ( sum + k >= 40) break 더하기;
//			sum = sum+k;
//			System.out.println("	 "+ k);
//			
//			}
//			System.out.println( i );
//			sum = sum+i;
//			
//			
//		}
//		if( sum < 40 ) {
//			System.out.println( "sum 출력 :"+ sum );
//		}
//		
		
		// 베스킨라빈스 31
		// 컴퓨터와 나 둘이서 한다.
		// 한번에 제시할 수 있는 숫자는 최소1개, 최대3개
		// 31을 입력하면 패배
		
		
		int num=1;
		
		베스킨:
		for(;;) {
			System.out.print("숫자 몇개 : ");
			int user = scan.nextInt();
			System.out.print("나 : ");
			for ( int u = 1; u<=user; u++) {
				System.out.print( num );
				num++;
			}
			if(num == 31) break 베스킨;
			System.out.println();
			
			int com = (int)(Math.random()*3)+1;
			System.out.print("	com : ");
			for ( int c = 1; c<=com; c++) {
				System.out.print( num );
				if(num == 31) break 베스킨;
				num++;
				
				}
			if(num == 31) break 베스킨;
			System.out.println();
			}
		}	
}
