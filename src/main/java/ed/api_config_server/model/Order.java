package ed.api_config_server.model;

public class Order {

	private Integer id;
	private String email;
	private double price;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", email=" + email + ", price=" + price + "]";
	}
	
	
}
