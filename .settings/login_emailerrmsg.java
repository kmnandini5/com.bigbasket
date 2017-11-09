package Scripts;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import com.bigbasket.com.bigbasket.Basetest;

import POM.loginpage;

public class login_emailerrmsg extends Basetest{
	
	public void email_errmsg()
	{
		loginpage lp=new loginpage(driver);
		lp.clickloginlink();
		lp.enteremailid("vijayalaxmibgudage@gmail.com");
		lp.enterpwd("12345678");
		lp.clickloginbtn();
		String expected="viju";
		String actual="//span[.='viju']";
			
		Assert.assertEquals(actual, expected);
		
			System.out.println("login successfull");
		}
	}


