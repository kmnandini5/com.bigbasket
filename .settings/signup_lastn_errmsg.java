package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bigbasket.com.bigbasket.Basepage;
import com.bigbasket.com.bigbasket.Basetest;

import POM.signup;

public class signup_lastn_errmsg extends Basetest{
	
	@Test
	public void lastn_errmsg()
	{
	signup su =new signup(driver);
	su.clicksignuplink();
	su.enterfirstname("viju");
	su.clicksignupbtn();
	
	Basepage bp=new Basepage(driver);
	WebElement element=driver.findElement(By.xpath("//label[.='Enter a last name.']"));
	bp.VerifyElementIsPresent(element);
	}
}


