package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {
	
	@Test
	public void test1()
	{
		SoftAssert s = new SoftAssert();
		System.out.println("Execution of test1 started");
		s.assertEquals(100, 101, "Prashant");
//		Assert.assertEquals(500, 501, "TESTNG RESULT");
		s.assertAll();
	}
	
	@Test
	public void test2()
	{
		SoftAssert s = new SoftAssert();
		System.out.println("Execution of test2 started");
//		s.assertEquals(100, 101, "Prashant");
		Assert.assertEquals(500, 501, "TESTNG RESULT");
//		s.assertAll();
	}
}
