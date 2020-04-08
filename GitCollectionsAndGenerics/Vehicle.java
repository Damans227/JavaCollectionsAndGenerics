package Collections;

public class Vehicle {
	
	String make;
	String model;
	int price;
	boolean forWdrive;
	
	
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + ", forWdrive=" + forWdrive + "]";
	}
	public Vehicle(String make, String model, int price, boolean forWdrive) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		this.forWdrive = forWdrive;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isForWdrive() {
		return forWdrive;
	}
	public void setForWdrive(boolean forWdrive) {
		this.forWdrive = forWdrive;
	}

}
