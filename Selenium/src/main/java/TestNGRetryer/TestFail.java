package TestNGRetryer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFail {

	@Test
	public void fail()
	{
		System.out.println("This is failed one");
		Assert.assertTrue(true);
	}
}
