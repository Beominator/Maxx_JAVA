package DTO;

public class Tea {
	private int price;
	private String itemName;
	
	public Tea(String itemName, int price) {
		this.itemName = itemName;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return itemName+"("+price+"원)";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	
}
