package customer;

	public class Customer {
	    private int customerId;
	    private String customerName;
	    private String email;
	    private String phone;

	    public Customer(int customerId, String customerName, String email, String phone) {
	        this.customerId = customerId;
	        this.customerName = customerName;
	        this.email = email;
	        this.phone = phone;
	    }

	    // Getters and Setters
	    public int getCustomerId() {
	        return customerId;
	    }

	    public void setCustomerId(int customerId) {
	        this.customerId = customerId;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public void setCustomerName(String customerName) {
	        this.customerName = customerName;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }
	}