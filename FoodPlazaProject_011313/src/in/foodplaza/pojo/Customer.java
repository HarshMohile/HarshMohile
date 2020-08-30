package in.foodplaza.pojo;

public class Customer {

	private int custId;
	private String  custName;
	private String custEmail;
	private String custContact;
	private String custAddress;
	private String custPassword;
	private String custConfirmPassword;
	
	public Customer() {
		super();
	}

	public Customer(int custId, String custName, String custEmail, String custContact, String custAddress,
			String custPassword, String custConfirmPassword) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custEmail = custEmail;
		this.custContact = custContact;
		this.custAddress = custAddress;
		this.custPassword = custPassword;
		this.custConfirmPassword = custConfirmPassword;
	}

	public Customer(String custName, String custEmail, String custContact, String custAddress, String custPassword,
			String custConfirmPassword) {
		super();
		this.custName = custName;
		this.custEmail = custEmail;
		this.custContact = custContact;
		this.custAddress = custAddress;
		this.custPassword = custPassword;
		this.custConfirmPassword = custConfirmPassword;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustContact() {
		return custContact;
	}

	public void setCustContact(String custContact) {
		this.custContact = custContact;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getCustPassword() {
		return custPassword;
	}

	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}

	public String getCustConfirmPassword() {
		return custConfirmPassword;
	}

	public void setCustConfirmPassword(String custConfirmPassword) {
		this.custConfirmPassword = custConfirmPassword;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custEmail=" + custEmail + ", custContact="
				+ custContact + ", custAddress=" + custAddress + ", custPassword=" + custPassword
				+ ", custConfirmPassword=" + custConfirmPassword + "]";
	}
	
	
	
	
	
}
