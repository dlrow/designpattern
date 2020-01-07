package builder;

public class PhoneBuilder {
	double screenSize;
	int ram;
	int hd;
	String os;
	double cost;
	
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setHd(int hd) {
		this.hd = hd;
		return this;
	}
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setCost(double cost) {
		this.cost = cost;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(screenSize, ram, hd, os, cost);
	}
}
