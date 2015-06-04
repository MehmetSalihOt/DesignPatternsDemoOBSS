public class SingletonTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Singleton.instance().printThis();
		}
	}
}
