package execution;

import org.testng.annotations.Test;

import util.InvokeBrowser;



public class TestCase1 {
	@Test
	public void testCase1() {
		InvokeBrowser obj=new InvokeBrowser();
		
		obj.invokeBrowser();
		
	}

}
