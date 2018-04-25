package by.htp.reportng.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReportNgTest {
	private int a = 2;
	private int b = 2;
	private int c = 3;

	@Test
	public void f() {
		Assert.assertEquals(a, b, "a not equals b");
	}

	@Test
	public void w() {
		Assert.assertEquals(a, b, "a not equals b");
	}

	@Test
	public void q() {
		Assert.assertEquals(a, c, "a not equals b");
	}

	@Test
	public void e() {
		Assert.assertEquals(c, b, "a not equals b");
	}
}
