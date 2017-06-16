package bestel;

import Constants.Constants;

public abstract class Product {
	
	protected String name;
	protected int totalPrice;
	protected int pricePerUnit;
	protected int unit;
	protected String imageURL;
	
	abstract String getName();
	abstract int getUnit();
	abstract int getPricePerUnit();
	abstract String getImageURL();

	
	public String toString() {
		return "Name: " + name + ", unit: " + unit + ", price: " + pricePerUnit;
	}
	
	public int getPrice(int items) {
		return items * pricePerUnit;
	}
	
	public Product(String name, int pricePerUnit, String imageUrl, int unit) {
		this.name = name;
		this.pricePerUnit = pricePerUnit;
		this.imageURL = imageUrl;
		this.unit = unit;
	}
	
	public Product(String name, int pricePerUnit, String imageUrl) {
		this(name, pricePerUnit, imageUrl, Constants.ITEM);
	}
	
}
