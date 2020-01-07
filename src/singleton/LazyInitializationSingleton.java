package singleton;

class SingleLazy {

	static SingleLazy se;
	int i;

	private SingleLazy() {
		i = 5;
		System.out.println("Object created");
	}

	public static SingleLazy getObject() {
		if (se == null) {
			se = new SingleLazy();
		}
		return se;
	}

}

public class LazyInitializationSingleton {
	public static void main(String[] args) {
		SingleEager ob1 = SingleEager.getObject();
		SingleEager ob2 = SingleEager.getObject();
		System.out.println(ob1.i);
		System.out.println(ob2.i);

	}

}
