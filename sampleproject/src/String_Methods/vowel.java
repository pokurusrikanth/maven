package String_Methods;

public class vowel {

	public static void main(String[] args) {
		String str = "kumar";
		int length = str.length();
		int i = 0;
		for (; i <= length - 1; i++) {
			char mychar = str.charAt(i);
			if (mychar == 'a' || mychar == 'e' || mychar == 'i' || mychar == 'o' || mychar == 'u') {
				break;
			}

		}
		String leftside = str.substring(0, i);
		String rightside = str.substring(i);
		System.out.println(rightside + leftside + "ai");

	}

}
