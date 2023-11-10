package app02;

public class ImportedProduct extends Product {
	private double customsFee;
	
	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.setCustomsFee(customsFee);
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return getPrice() + customsFee;
	}

	 @Override
	public String priceTag() {
		return getName() + " $ " + totalPrice() + "| Customs Fee :" + customsFee;
	}
}
