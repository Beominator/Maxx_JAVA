package java_0709_3;

interface RestCustomer{			// 식당에 찾아오는 손님
	
	public void setCustomer(String customer);
	public String food();
}

class ReserveCustomerA implements RestCustomer{
	String customer;		// 예약 손님

	@Override
	public void setCustomer(String customer) {
		this.customer = customer;
		
	}

	@Override
	public String food() {
		return customer+" 청국장 준다. ";
		
	}
}	// 첫번째 예약손님 A
class ReserveCustomerB implements RestCustomer{
	String customer;		// 예약 손님

	@Override
	public void setCustomer(String customer) {
		this.customer = customer;
		
	}

	@Override
	public String food() {
		return customer+" 돈가스 준다. ";
		
	}
}	// 두번째 예약손님 B

class Owner{		// 사장
	void food( RestCustomer cus ) {
		System.out.println( cus.food());
	}
	
}

public class Interface_Test1 {

	public static void main(String[] args) {
		
		Owner ow = new Owner();
		ReserveCustomerA a = new ReserveCustomerA();
		ReserveCustomerB b = new ReserveCustomerB();
		a.setCustomer("A-이순신");
		b.setCustomer("B-장보고");
		
		ow.food(a);
		ow.food(b);

	}

}

// 성적
// 초등학생, 중학생, 고등학생, 대학생

// 변호사, 검사, 소방관, 의사, 미화원
// 이름, 나이, 근무지, 연봉, 업무

// 사용자 요청 처리 클래스, - 컨트롤 클래스
// 사용자 요청에 필요한 데이터 가공 및 수집 실행 클래스, - 서비스 클래스, 인터페이스
// 데이터만 저장하는 클래스 - 사용자에게 제공할 데이터 클래스 -  VO, DTO
//					  - 데이터베이스에 저장할 데이터 클래스 - Entity
// 데이터베이스 처리 인터페이스 - repository
// 
