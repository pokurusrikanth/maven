package String_Methods;


	public class Print_The_Duplicates_In_A_String_Array {

		public static void main(String[] args) {
			String[] str = { "hi", "this", "hi", "anil", "anil" };
			int length = str.length;

			for (int i = 0; i <= length - 1; i++) {
				for (int j = i + 1; j <= length - 1; j++) {
					if (str[i].equals(str[j])) {
						System.out.println("duplicate eliment is:" + str[i]);
					}

				}

			}
		}

		public static void Print_The_Duplicates() {
			String[] str = { "hi", "this", "hi", "anil", "anil", "anil" };
			int length = str.length;

			for (int i = 0; i <= length - 1; i++) {
				String str1 = str[i];
				for (int j = i + 1; j <= length - 1; j++) {
					String newstr = str[j];
					if (str1.equals(newstr)) {
						System.out.println("duplicate eliment is:" + str1);
					}

				}

			}
		}

}
