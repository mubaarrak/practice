package leetcode;

public class Singleton {

	private static Singleton singleton = null;

	private Singleton() {
		throw new RuntimeException("Please use geInstance method.");
	}

	public Singleton getInstance() {

		if (singleton == null) {

			synchronized (Singleton.class) {

				if (singleton == null) {

					singleton = new Singleton();

				}

			}

		}

		return singleton;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
