package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bigbasket.com.bigbasket.Basepage;
import com.bigbasket.com.bigbasket.Basetest;

import POM.signup;

public class signup_capthcaerrmsg extends Basetest{

	@Test
	public void capthcaerrmsg()
	{
		signup su= new signup(driver);
		su.clicksignuplink();
		su.enterfirstname("viju");
		su.enterlastname("123");
		su.enterpwd("12345678");
		su.clicksignupbtn();
		
		Basepage bp=new Basepage(driver);
		WebElement element = driver.findElement(By.xpath("(//label[.='Enter the string in image'])[2]"));
		bp.VerifyElementIsPresent(element);
	}
}
