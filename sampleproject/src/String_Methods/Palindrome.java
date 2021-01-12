package String_Methods;

	public class Palindrome {

		/*
		 * public static void main(String[] args) { String val = "malayalam"; String res
		 * = ""; int total = val.length(); for (int i = total - 1; i >= 0; i--) { char
		 * mychar = val.charAt(i); res = res + mychar;
		 * 
		 * } if (res.equalsIgnoreCase(val)) { System.out.println("polyndrome"); } else {
		 * System.out.println("not polyndrome"); }
		 * 
		 * }
		 */
		public static void main(String[] args) {
			String val = "malayalam";
			boolean ispalindrome = true;
			int total = val.length();
			for (int i = 0, j = total - 1; i < j; i++, j--) {
				char mychar = val.charAt(i);
				char mychar1 = val.charAt(j);
				if (mychar != mychar1) {
					ispalindrome = false;
				}
			}
			if (ispalindrome) {
				System.out.println("palyndrome");
			} else {
				System.out.println("not palyndrome");
			}

		}

}
