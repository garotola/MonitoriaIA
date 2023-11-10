package app01;

public class OutsourcedEmployee extends Employee{
	private double additionalCharge;
	
	public OutsourcedEmployee(String name, int hour, double valuePerHour, double additionalCharge) {
		super(name, hour, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + (additionalCharge * 1.1);
	}
	
}
