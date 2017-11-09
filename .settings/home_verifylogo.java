package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bigbasket.com.bigbasket.Basetest;

import POM.HomePage;

public class home_verifylogo extends Basetest{
	
	

	@Test
	public void logo() throws InterruptedException
	{
	//loginpage lp=new loginpage()	
	  HomePage hp= new HomePage(driver);
		
	  hp.logo();
	  hp.entersearchtf("home");
	  Thread.sleep(2000);
//	  List<WebElement> list= driver.findElements(By.xpath("//input[@id='uiv2-a2c-100567469']"))	;
//	  int count = list.size();

	driver.findElement(By.xpath("//input[@id='uiv2-a2c-100567469']")).click();

	}

}
