package builder;

public class Main {
	public static void main(String[] args) {
		PhoneBuilder pb = new PhoneBuilder();
		Phone p = pb.setCost(15000).setHd(128).setOs("Android").getPhone();
		System.out.println(p);
	}

}
