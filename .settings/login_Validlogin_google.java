package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bigbasket.com.bigbasket.Basepage;
import com.bigbasket.com.bigbasket.Basetest;
import com.bigbasket.com.bigbasket.Excel;
import POM.loginpage;

public class login_Validlogin_google extends Basetest{
	
	Excel e1=new Excel();
	loginpage l1=new loginpage(driver);
	Basepage bp=new Basepage(driver);
	
	
	
	
	
	
	@Test
	public void validlogin()
	{
		//String etitle=driver.getTitle();
		bp.verifyTitle("Online Grocery Shopping and Online Supermarket in India-Bigbasket");
	    l1.clickloginlink();
	    l1.Loginwithgoogle();
	    driver.findElement(By.xpath("//p[.='nandini km']")).click();
	    driver.findElement(By.id("id-tnc-1")).click();
	    driver.findElement(By.id("create-account-btn")).click();    
	}	
}
