package bestel;

import Constants.Constants;

public abstract class Product {
	// NOTE: fields may be
	
	private static String name;
	private static int totalPrice;
	private static int pricePerUnit;
	private static int unit;
	private static String imageUrl;
	
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
		this.imageUrl = imageUrl;
		this.unit = unit;
	}
	
	public Product(String name, int pricePerUnit, String imageUrl) {
		this(name, pricePerUnit, imageUrl, Constants.ITEM);
	}
	
}
