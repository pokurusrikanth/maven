package String_Methods;


	public class Check_whether_two_strings_are_anagram_of_each_other {

		public static void main(String[] args) {
			String str = "silent";
			String newstr = "listen";
			int count = 0;
			int strlen = str.length();
			int newstrlen = newstr.length();

			for (int i = 0; i <= strlen - 1; i++) {
				boolean isfound = false;
				char mychar = str.charAt(i);
				for (int j = 0; j <= newstrlen - 1; j++) {
					char mychar1 = newstr.charAt(j);
					if (mychar == mychar1) {
						isfound = true;
						break;
					}
				}
				if (isfound == false) {
					count++;
					System.out.println(mychar + "is not found");
				}

			}
			if (count == 0) {
				System.out.println("String1 and String2 contains same characters");
			}

		}

}
