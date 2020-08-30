package in.foodplaza.pojo;

public class Cart {
	
	private int cartId;
	private int foodId;
	private String custEmail;
	private int foodQuantity;
	
	private String foodName;
	private String foodType;
	private String foodCategory;
	
	private double foodPrice;
	
	public Cart() {
		super();
	}

	public Cart(int foodId, String custEmail, int foodQuantity) {
		super();
		this.foodId = foodId;
		this.custEmail = custEmail;
		this.foodQuantity = foodQuantity;
	}

	public Cart(int foodId, String custEmail, int foodQuantity, String foodName, String foodType, String foodCategory,
			double foodPrice) {
		super();
		this.foodId = foodId;
		this.custEmail = custEmail;
		this.foodQuantity = foodQuantity;
		this.foodName = foodName;
		this.foodType = foodType;
		this.foodCategory = foodCategory;
		this.foodPrice = foodPrice;
	}

	public Cart(int cartId, int foodId, String custEmail, int foodQuantity, String foodName, String foodType,
			String foodCategory, double foodPrice) {
		super();
		this.cartId = cartId;
		this.foodId = foodId;
		this.custEmail = custEmail;
		this.foodQuantity = foodQuantity;
		this.foodName = foodName;
		this.foodType = foodType;
		this.foodCategory = foodCategory;
		this.foodPrice = foodPrice;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public int getFoodQuantity() {
		return foodQuantity;
	}

	public void setFoodQuantity(int foodQuantity) {
		this.foodQuantity = foodQuantity;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getFoodCategory() {
		return foodCategory;
	}

	public void setFoodCategory(String foodCategory) {
		this.foodCategory = foodCategory;
	}

	public double getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", foodId=" + foodId + ", custEmail=" + custEmail + ", foodQuantity="
				+ foodQuantity + ", foodName=" + foodName + ", foodType=" + foodType + ", foodCategory=" + foodCategory
				+ ", foodPrice=" + foodPrice + "]";
	}

	public Cart(int foodId, String custEmail) {
		super();
		this.foodId = foodId;
		this.custEmail = custEmail;
	}
	
	

}
