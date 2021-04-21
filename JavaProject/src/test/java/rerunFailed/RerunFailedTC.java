package rerunFailed;

import org.junit.Assert;
import org.testng.annotations.Test;

public class RerunFailedTC {

	@Test
	public void Test1() {

		System.out.println("Inside Test1");
	}
	@Test(retryAnalyzer = listeners.RetryAnalyzer.class)
	public void Test2() {
		System.out.println("Inside Test2");
		int i=5/0;
		
	}

	@Test
	public void Test3() {
		Assert.assertTrue(true);
		System.out.println("Inside Test3");
	}


}
