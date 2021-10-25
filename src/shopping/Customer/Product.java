package shopping.Customer;

public class Product implements Item 
{
	//Attributes
	private String name;
	private double unitPrice;
	private ItemType type;
	
	
	public Product(String name, double price, ItemType type) {
		super();
		this.name = name;
		this.unitPrice = price;
		this.type = type;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public String getName() {
		return name;
	}
	public double priceForQuantity(int quantity) {
		return unitPrice*quantity;
	}
	public ItemType getType() {
		return type;
	}
	
}
