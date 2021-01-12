package collections;

public class Stackoverflow {

	public static void main(String[] args) {

		// printing1_2_100(1, 100);
		mainmethod();
	}

	public static void mainmethod() {
		System.out.println("we r in stack");
		mainmethod();

	}

	public static void printing1_2_100(int start, int end) {
		System.out.println(start);
		start++;
		if (start <= end) {
			printing1_2_100(start, end);
		}
	}

}
