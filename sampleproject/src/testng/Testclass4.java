
package testng;

import org.testng.annotations.Test;

public class Testclass4 {
	@Test(groups = "manager")
	public void method1() {
		System.out.println("method1");
	}

	@Test(groups = "manager")
	public void method2() {
		System.out.println("method2");
	}

	@Test(groups = "manager")
	public void method3() {
		System.out.println("method3");
	}

	@Test(groups = "admin")
	public void method4() {
		System.out.println("method4");
	}

	@Test(groups = "admin")
	public void method5() {
		System.out.println("method5");
	}

	@Test(groups = "admin")
	public void method6() {
		System.out.println("method6");
	}
}
