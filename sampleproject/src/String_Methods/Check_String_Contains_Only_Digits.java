package String_Methods;

public class Check_String_Contains_Only_Digits {

	public static void main(String[] args) {
		String str = "abc1";
		int length = str.length();
		for (int i = 0; i <= length - 1; i++) {
			char mychar = str.charAt(i);
			if (mychar >= 'a' && mychar <= 'z') {
				System.out.println("String contains only apbhabetics");
			} else if (mychar >= 48 && mychar <= 57) {
				System.out.println("String contains alphanumeric");
			}
		}

	}

}
