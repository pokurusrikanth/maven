package singleton;

public class Myclass {

	private static Myclass current_instance;

	private Myclass() {

	}

	public static Myclass get_instance() {
		if (current_instance == null) {
			current_instance = new Myclass();
		}
		return current_instance;

	}

}
