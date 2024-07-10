package java_0709;

public class ObjectArray1 {

	public static void main(String[] args) {
		// 영화 정보 5개 입력
	
		
		Movie[] mv = new Movie[5];
		
		mv[0] = new Movie("범죄도시", "강윤성", 18);
		mv[1] = new Movie("인사이드아웃2", "켈시", 1);
		mv[2] = new Movie("탈주", "이종필", 12);
		mv[3] = new Movie("하이재킹", "김성한", 12);
		mv[4] = new Movie("혹성탈출", "웨스", 12);
		
		for( int i=0; i < mv.length; i++) {
			System.out.println( mv[i] );
		}
		
		for( Movie movie : mv) {
			System.out.println( movie );
		}
	}

}


/*
	
	배열의 생성
	데이터 타입[] 참조변수 = new 	데이터 타입[배열크기];
	
	클래스명 - Movie
	
	Movie t;
	
	Movie[] mv = new Movie[10];
	Movie클래스의 참조변수 10개 생성 된 것.
	
	mv[0] = new Movie();
	mv[1] = new Movie();
	
	int a;
	
	int[] arr = new int[10];
	int 타입 공간 10개 생성( int 타입으로 선언된 변수 10개 있는 것과 같다고 봐도 된다.)
	arr[0] = 100;
	
 */
 