package java0626;

import java.util.Scanner;

public class input2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 // 문자열 - "" 큰따옴표로 표현하여 작성한다.
		  	문자열은 String 클래스 타입을 사용해야 한다.
		  	
		 문제2. 
		 직원 이름, 소속 부서명, 월급여액을 키보드를 통해 입력받는다.
		 세금은 8%를 낸다. 실수령액은 얼마인지 출력
		 이름, 부서, 실수령액을 출력하세요. 
		 두명의 직원에 대해 출력하세요.
		 */
		String name1 = "직원이름1";
		String name2 = "직원이름2";
		String part1 = "소속부서1";
		String part2 = "소속부서2";
		System.out.println("직원이름1 : ");
		name1 = scan.nextLine();
		System.out.println("소속부서1 : ");
		part1 = scan.nextLine();
		System.out.println("직원이름2 : ");
		name2 = scan.nextLine();
		System.out.println("소속부서2 : ");
		part2 = scan.nextLine();
		int pay;
		double dtax = 0.08;
		System.out.println("급여1 : ");
		pay = scan.nextInt();
		int 실수령액1 = (int)(pay - (pay*dtax));		// 강제 형변
		System.out.println("직원1 실수령액1 : "+실수령액1+"원");
		System.out.println("급여2 : ");
		pay = scan.nextInt();
		double 실수령액2 = pay - (pay*dtax);
		System.out.println("직원2 실수령액2 : "+실수령액2+"원");
		
		
		

	}

}
