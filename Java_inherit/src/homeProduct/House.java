package homeProduct;

public class House {

	boolean onOff;
	String brand;	// 제품 브랜드명
	int price;		// 제품 구매 가격
	
	House(){
		this.onOff = false;
	}
	
	void power() {
		this.onOff = !this.onOff;
		System.out.println(" 전원 : "+this.onOff);
	}
}
