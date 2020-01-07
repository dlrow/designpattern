package singleton;

class EfficientThreadSafe {

	static EfficientThreadSafe se;

	private EfficientThreadSafe() {
		System.out.println("Object created");
	}

	//double check
	public static EfficientThreadSafe getObject() {
		if (se == null) {
			synchronized (EfficientThreadSafe.class) {
				if (se == null)
					se = new EfficientThreadSafe();
			}

		}
		return se;
	}

}

public class EfficientThreadSafeLazyInitializationSingleton {
	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> {
			EfficientThreadSafe ob1 = EfficientThreadSafe.getObject();
		});

		Thread t2 = new Thread(() -> {
			EfficientThreadSafe ob2 = EfficientThreadSafe.getObject();
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();
		

	}

}
