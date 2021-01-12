package String_Methods;

public class Chech_The_Given_String_IsIn_Clockwise_Direction {
	public static void main(String[] args) {
		String[] str = { "abcd", "bcda", "cdab", "dabc" };
		boolean isInOrder = true;
		int length = str.length;
		for (int i = 0; i <= length - 2; i++) {
			String str1 = str[i];
			String str2 = str[i + 1];
			str1 = str1.substring(1) + str1.substring(0, 1);
			if (!str1.equals(str2)) {
				isInOrder = false;
				System.out.println(str1 + ":" + str2);

			}
		}
		if (isInOrder) {
			System.out.println("all in order");
		} else {
			System.out.println("order is mismatched");
		}

	}

}
