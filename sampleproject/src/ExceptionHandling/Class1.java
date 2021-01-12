package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Class1 {

	@Test
	public static void trycatch() {

		Scanner scanner = new Scanner(System.in);
		try {

			int a, b, c;

			System.out.println("enter a value");
			a = scanner.nextInt();
			System.out.println("enter b value");

			b = scanner.nextInt();

			c = a / b;
			System.out.println("c value:" + c);

		} catch (ArithmeticException | NumberFormatException e) {
			scanner.close();
			System.out.println("b value is wrong input" + e.getMessage());
		} catch (InputMismatchException ime) {
			System.out.println("pls provide int vals");
		}

	}

}
