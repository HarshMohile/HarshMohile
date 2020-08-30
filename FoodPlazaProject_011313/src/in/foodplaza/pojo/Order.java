package in.foodplaza.pojo;

public class Order {

	private int orderId;
	private String custEmail;
	private String orderStatus;
	private String orderDate;
	private double totalBill;

	public Order() {
		super();
	}

	public Order(String custEmail, String orderStatus, String orderDate, double totalBill) {
		super();
		this.custEmail = custEmail;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
		this.totalBill = totalBill;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", custEmail=" + custEmail + ", orderStatus=" + orderStatus
				+ ", orderDate=" + orderDate + ", totalBill=" + totalBill + "]";
	}

	public Order(int orderId, String custEmail, String orderStatus, String orderDate, double totalBill) {
		super();
		this.orderId = orderId;
		this.custEmail = custEmail;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
		this.totalBill = totalBill;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public double getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}

}
