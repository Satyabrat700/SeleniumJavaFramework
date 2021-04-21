package priority;

import org.testng.annotations.Test;

public class Priority {

	@Test
	public void Test1() {

		System.out.println("Inside Test 1");


	}
	@Test(priority=2)
	public void Test2() {
		System.out.println("Inside Test 2");

	}
	
	@Test(priority=1)
	public void Test3() {
		System.out.println("Inside Test 3");

	}

}
