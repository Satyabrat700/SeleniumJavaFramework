package testNGGrouping;

import org.testng.annotations.Test;
@Test(groups="AllClassTests")
public class GroupingDemo {
	
	@Test(groups= {"Sanity"})
	public void Test1() {
		System.out.println("Inside Test1");
	}
	@Test(groups= {"Smoke","Regression"})
	public void Test2() {
		System.out.println("Inside Test2");
	}
	@Test(groups= {"Smoke","Sanity"})
	public void Test3() {
		System.out.println("Inside Test3");
	}
	@Test(groups= {"Regression","Sanity"})
	public void Test4() {
		System.out.println("Inside Test4");
	}
	@Test(groups= {"Windows.Regression"})
	public void Test5() {
		System.out.println("Inside Test5");
	}
	@Test(groups= {"C","Sanity","Smoke"})
	public void Test6() {
		System.out.println("Inside Test6");
	}

}
