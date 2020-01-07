package builder;

public class Phone {
	double screenSize;
	int ram;
	int hd;
	String os;
	double cost;
	
	
	public Phone(double screenSize, int ram, int hd, String os, double cost) {
		super();
		this.screenSize = screenSize;
		this.ram = ram;
		this.hd = hd;
		this.os = os;
		this.cost = cost;
	}
	
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHd() {
		return hd;
	}
	public void setHd(int hd) {
		this.hd = hd;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Phone [screenSize=" + screenSize + ", ram=" + ram + ", hd=" + hd + ", os=" + os + ", cost=" + cost
				+ "]";
	}
	

}
