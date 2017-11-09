package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.bigbasket.com.bigbasket.Basetest;

import POM.signup;

public class signup_validsignup extends Basetest {
	
	
	@Test
	public void validsignup()
	{
		signup su= new signup(driver);
		su.clicksignuplink();
		su.enterfirstname("viju");
		su.enterlastname("123");
		su.enterpwd("12345678");
		
		su.clicksignupbtn();
	}

}
