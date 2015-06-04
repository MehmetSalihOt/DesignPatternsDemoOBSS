public class Singleton {

	private static Singleton instance = null;

	private Singleton() {
		System.out.println("singletion init()");
	}

	public static Singleton instance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public void printThis() {
		System.out.println(this);
	}
}