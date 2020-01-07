package singleton;

class ThreadSafeSingleLazy {

	static ThreadSafeSingleLazy se;
	int i;

	private ThreadSafeSingleLazy() {
		i = 5;
		System.out.println("Object created");
	}

	//creates two object w/o synchronized keyword
	public static synchronized ThreadSafeSingleLazy getObject() {
		if (se == null) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			se = new ThreadSafeSingleLazy();
		}
		return se;
	}

}

public class ThreadSafeLazyInitializationSingleton {
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(()->{
			ThreadSafeSingleLazy ob1 = ThreadSafeSingleLazy.getObject();
		});
		
		Thread t2 = new Thread(()->{
			ThreadSafeSingleLazy ob2 = ThreadSafeSingleLazy.getObject();
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		//System.out.println(ob1.i);
		//System.out.println(ob2.i);

	}

}
