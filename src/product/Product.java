package product;

	public class Product {
	    private int productId;
	    private String productName;
	    private double price;
	    private int storeId;

	    public Product(int productId, String productName, double price, int storeId) {
	        this.productId = productId;
	        this.productName = productName;
	        this.price = price;
	        this.storeId = storeId;
	    }

	    // Getters and Setters
	    public int getProductId() {
	        return productId;
	    }

	    public void setProductId(int productId) {
	        this.productId = productId;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public void setProductName(String productName) {
	        this.productName = productName;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public int getStoreId() {
	        return storeId;
	    }

	    public void setStoreId(int storeId) {
	        this.storeId = storeId;
	    }
	}