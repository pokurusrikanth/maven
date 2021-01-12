package javapractice;

import org.testng.annotations.Test;

public class Singletonclass {
	private static Singletonclass current_Instance;

	private Singletonclass() {

	}

	public static Singletonclass getInstance() {
		if (current_Instance == null)
			current_Instance = new Singletonclass();

		return current_Instance;
	}

	@Test
	public void array() {

		int[][] vals = new int[3][];
		vals[0] = new int[6];
		vals[1] = new int[5];
		vals[2] = new int[4];

	}

}
