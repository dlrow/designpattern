package singleton;

class SingleEager {

	static SingleEager se = new SingleEager();
	int i;
	private SingleEager() {
		i=5;
		System.out.println("Object created");
	}

	public static SingleEager getObject() {
		return se;
	}

}

public class EagerSingleton {
	public static void main(String[] args) {
		SingleEager ob1 = SingleEager.getObject();
		SingleEager ob2 = SingleEager.getObject();
		System.out.println(ob1.i);
		System.out.println(ob2.i);
		
	}

}
