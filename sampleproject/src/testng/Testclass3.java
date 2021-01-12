package testng;

import org.testng.annotations.Test;

public class Testclass3 {
	@Test(groups = "manager")
	public void method7() {
		System.out.println("method7");
	}

	@Test(groups = "test")
	public void method8() {
		System.out.println("method8");
	}

	@Test(groups = "admin")
	public void method9() {
		System.out.println("method9");
	}

	@Test(groups = "test")
	public void method10() {
		System.out.println("method10");
	}

	@Test(groups = "test")
	public void method11() {
		System.out.println("method11");
	}

	@Test(groups = "admin")
	public void method12() {
		System.out.println("method12");
	}

}
