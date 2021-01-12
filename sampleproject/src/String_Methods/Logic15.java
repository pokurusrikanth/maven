package String_Methods;

public class Logic15 {
	public static void main(String[] args) {
		/*
		 * String str = " username : anil | password : a123 )"; String[] allvalues =
		 * str.split(" "); String username = allvalues[3]; String password =
		 * allvalues[7]; System.out.println("username :" + username);
		 * System.out.println("password :" + password);
		 */
		String str = " 1 2 3 4 5 6 7 8";
		String[] allvalues = str.split(" ");
		String username = allvalues[0];
		String password = allvalues[7];
		System.out.println("username :" + username);
		System.out.println("password :" + password);

	}

}
