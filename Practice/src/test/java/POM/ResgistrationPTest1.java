package POM;

import org.testng.annotations.Test;

public class ResgistrationPTest1 extends BaseTest{

	
	@Test
	public void regi()
	{
		RegistractionPage  rp=new RegistractionPage(driver);
		rp.clickReg();
	}

	@Test
	public void setdata()
	{
		RegistractionPage  rp=new RegistractionPage(driver);
		rp.clickGender();
		rp.setFirstName();
		rp.setEmail("vaibhavkalubarme@gmail.com");
	
	}
}
