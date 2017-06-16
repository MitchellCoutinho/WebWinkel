package bestel;

import Constants.Constants;

public class QuantumDiscount extends Product {

	public QuantumDiscount(String name, int pricePerUnit, String imageUrl, int unit) {
		super(name, pricePerUnit, imageUrl, unit);
	}
	
	public QuantumDiscount(String name, int pricePerUnit, String imageUrl) {
		this(name, pricePerUnit, imageUrl, Constants.ITEM);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getUnit() {
		return unit;
	}

	@Override
	public int getPricePerUnit() {
		return pricePerUnit;
	}

	@Override
	public String getImageURL() {
		return imageURL;
	}
}
