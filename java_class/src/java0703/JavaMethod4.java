package java0703;

public class JavaMethod4 {

	public static void main(String[] args) {
		
		// 메서드를 통해 숫자 10을 받아 출력하기
		
		ReturnMth rm = new ReturnMth();
		
		int num = rm.get();
		System.out.println( num );
		
		// 메서드로부터 두 정수의 더하기 결과 받아서 출력하기.
		
		int result = rm.sum();
		System.out.println( result );
		
		
		
	}

}


class ReturnMth{
	
	int sum() {
		int num1 = 30, num2 = 45;
		int result = num1 + num2;
		return result;
	}
	
	int get() {
		return 10;
	}
}