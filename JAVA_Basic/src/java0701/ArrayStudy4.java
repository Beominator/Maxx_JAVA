package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy4 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		// 많은 양의 데이터를 다룰때는 배열을 사용한다.
		// 상황에 따라서는 배열을 쓰면 안되는 경우도 있지만
		// 보통은 배열의 구조에 데이터를 저장한다.
		//
		// 동적 배열 만들기
		
//		int[] a = new int[5];
//		
//		a[0]=10; a[1] = 20; a[4]=40; 
//		
//		System.out.println( Arrays.toString(a));
//		
//		a = new int[7];
//		a[5]=100;
//		System.out.println( Arrays.toString(a));
		
		
//		int[] num = new int[] {10, 20, 30, 40 ,50};
//		
//		// num[5]=60; 인덱스 범위 벗어나서 오류
//		// 데이터를 추가로 더 저장하려면 배열의 크기를 늘려야 한다.
//		int size = num.length;		// 기존 배열의 크기
//		
//		int[] temp = new int[size+1];
//		for(int i=0; i<size; i++) {
//			temp[i] = num[i];
//		}
//		num = temp;
//		num[5] = 60;
//		System.out.println("크기 증가 후 : " + Arrays.toString(num));
		
		// 문자열에서 같다 비교는 .equals() 로 한다.
		// 문자열에 특정문자나 문자열 포함 여부는 .contains()
		// 다음 주소중 선화동의 주소만 추출하여 배열에 저장하세요.
		// 배열에 잘 저장되어있는지 확인 출력은 Arrays 이용하여 출력.
		
		String[] addr = new String[] {
				"대전 중구 선화동 25", "대전 중구 선화동 92",
				"대전 서구 둔산동 111", "대전 서구 둔산동 1023",
				"대전 유성구 노은동 93", "대전 중구 대흥동 932",
				"대전 동구 가양동 945", "대전 중구 선화동 1234",
				"대전 중구 대흥동 23", "대전 중구 선화동 984"
		};
//		System.out.print("주소 검색 : ");
//		String search = sc.nextLine();
//		
//		for( int i=0; i <addr.length; i++) {
//			if( addr[i].contains(search)) {
//				System.out.println("검색 결과 : " + addr[i]);
//			}
//		}
//		System.out.println("전체 주소 : " + Arrays.toString(addr));
//		
		
		
		// addr[i].contains("선화동")
		// addr 배열의 크기만큼 선언하기, 선화동 카운팅 수 만큼 선언.
//		
//		String[] 선화동 = new String[addr.length];
//		int index = 0;
//		
//		for(int i=0; i<addr.length; i++){
//			if(addr[i].contains("선화동")) {
//				선화동[index++] = addr[i];
//			}
//			
//		}System.out.println("전체 주소 : " + Arrays.toString(선화동));
//		
		// 2차원 배열
		// 1차원 배열의 공간에 1차원 배열을 연결해놓은 구조.
		
//		int[][] arr = new int[5][3];	// 3의 크기를 가진 배열 5개.
//		
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[0][2] = 30;
//		arr[1][0] = 40;
//		arr[2][0] = 50;
		
		// 고등학교 1학년 학생들의 성적
		// 1학년은 1반 부터 6반까지 있다.
		// new int[6][30];
		
		// 0 번 인덱스부터 	n번 인덱스까지 순차적 나열방법
//		int[] a = new int[] {10,20,30,40,50,60,70,80,90,100};
//		
//		for( int data : a) {	// forEach, each
//			System.out.println( data );
//		}
		
		int[][] array1 = new int[2][3];
		System.out.println(array1.length);
		System.out.println(array1[0].length);
		System.out.println(array1[1].length);
		System.out.println();
		
		
		int[][] array2 = new int[][] {{1,2}, {3,4,5}};
		System.out.println(array2.length);
		System.out.println(array2[0].length);
		System.out.println(array1[1].length);
		System.out.println();
		
		
		
		System.out.print(array2[0][0] + " ");
		System.out.print(array2[0][1] + " ");
		System.out.println();
		System.out.print(array2[1][0] + " ");
		System.out.print(array2[1][1] + " ");
		System.out.print(array2[1][2]);
		System.out.println();
		
		for(int i=0; i<array2.length; i++) {
			for(int j=0; j<array2[i].length; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int[] array: array2) {
			for (int k:array) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
	}
	

}
