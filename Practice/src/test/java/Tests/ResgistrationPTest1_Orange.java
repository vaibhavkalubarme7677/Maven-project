package Tests;

import org.testng.annotations.Test;
import Pages.RegistractionPage_Orange;

public class ResgistrationPTest1_Orange extends RegistractionTest_Orange{
	
	@Test
	public void Username() throws InterruptedException
	{
		RegistractionPage_Orange  rp=new RegistractionPage_Orange(driver);
		rp.setusername();
	}

	@Test
	public void Password() throws InterruptedException
	{
		RegistractionPage_Orange  rp=new RegistractionPage_Orange(driver);
		rp.setpassword();
	}
	
	@Test
	public void Login() throws InterruptedException
	{
		RegistractionPage_Orange  rp=new RegistractionPage_Orange(driver);
		rp.Login();
	}
	
	
}
