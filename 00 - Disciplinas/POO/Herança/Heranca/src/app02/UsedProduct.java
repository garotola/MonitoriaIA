package app02;

import java.util.Date;

public class UsedProduct extends Product {
	Date date;
	
	public UsedProduct(String name, double price, Date date) {
		super(name, price);
		this.date = date;
	}
	@Override
	public String priceTag() {
		// TODO Auto-generated method stub
		return getName() + "(Usado)" + getPrice() + "| Data : " + date;
	}
}
