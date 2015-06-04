public class SingletonThreadSafe {

	private static SingletonThreadSafe instance = null;

	private static Object lock = new Object();

	private SingletonThreadSafe() {
		System.out.println("singletion init()");
	}

	public static SingletonThreadSafe instance() {
		if (instance == null) {
			
			synchronized (lock) {
				if (instance == null) {
					instance = new SingletonThreadSafe();
				}
			}
		}
		return instance;
	}

	public void printThis() {
		System.out.println(this);
	}
}