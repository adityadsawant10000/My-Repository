package Test;

import org.testng.annotations.Test;

import Generic.BaseTest;
import aditya.RegPage;

public class ValidateReg extends BaseTest{
	@Test
	void validRegister() {
		RegPage rp=new RegPage(driver);
		rp.getfName().sendKeys("");
		
	}
}
