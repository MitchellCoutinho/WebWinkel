package bestel;

import Constants.Constants;

public class DefaultProduct extends Product{

	public DefaultProduct(String name, int pricePerUnit, String imageUrl, int unit) {
		super(name, pricePerUnit, imageUrl, unit);
	}
	
	public DefaultProduct(String name, int pricePerUnit, String imageUrl) {
		super(name, pricePerUnit, imageUrl, Constants.ITEM);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	int getUnit() {
		return unit;
	}

	@Override
	int getPricePerUnit() {
		return pricePerUnit;
	}

	@Override
	String getImageURL() {
		return imageURL;
	}
	
}
