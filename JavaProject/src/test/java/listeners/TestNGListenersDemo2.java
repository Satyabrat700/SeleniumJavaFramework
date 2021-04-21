package listeners;



import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class TestNGListenersDemo2 {

	@Test
	public void test4() {

		System.out.println("inside Test4");
	}
	@Test	
	public void test5() {

		System.out.println("inside Test5");
		
		Assert.assertTrue(false);
	}
	@Test
	public void test6() {

		System.out.println("inside Test6");
	}

}
