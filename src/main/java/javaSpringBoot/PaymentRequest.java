package javaSpringBoot;

public class PaymentRequest {
	int userId;//user's identifier
	String itemId = new String();//item identifier
	double discount;
	public PaymentRequest() { }
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;//assigning user's identifier
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;//assigning item identifier
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;//assigning rebate
	}
}