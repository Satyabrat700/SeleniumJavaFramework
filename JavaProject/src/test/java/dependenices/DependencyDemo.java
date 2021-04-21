package dependenices;

import org.testng.annotations.Test;

public class DependencyDemo {
	
	@Test(dependsOnGroups  = {"Sanity1"})
	public void Test1() {
		
		
		System.out.println("Inside Test1");
	}
	@Test(groups="Sanity1")
	public void Test2() {
		
		
		System.out.println("Inside Test2");
	}
	
	@Test(groups="Sanity1")
	public void Test3() {
		
		
		System.out.println("Inside Test3");
	}


}
