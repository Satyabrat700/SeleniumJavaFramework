package listeners;



import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class TestNGListenersDemo {

	@Test
	public void test1() {

		System.out.println("inside Test1");
	}
	@Test	
	public void test2() {

		System.out.println("inside Test1");
		
		Assert.assertTrue(false);
	}
	@Test
	public void test3() {

		System.out.println("inside Test1");
	}

}
