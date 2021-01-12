package String_Methods;


	public class Eliminate_First_And_Last_String_From_Array {

		public static void main(String[] args) {
			String[] str = { "anil", "loki", "eswar", "rakesh", "guna" };
			int len = str.length;
			String newstr = "";
			for (int i = 0; i <= len - 1; i++) {
				if (i == 0 || i == len - 1) {
				} else {
					newstr = newstr + str[i] + ",";
				}
			}
			System.out.println(newstr);
		}
	

}
