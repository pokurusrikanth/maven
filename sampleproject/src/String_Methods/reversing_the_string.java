package String_Methods;

public class reversing_the_string {
	public static void main(String[] args) {
		String str = "hi this is anil";
		String[] str1 = str.split(" ");
		str = "";
		for (String word : str1) {
			str = word + " " + str;
		}
		System.out.println(str);

	}

}
