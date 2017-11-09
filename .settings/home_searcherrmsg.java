package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bigbasket.com.bigbasket.Basetest;

import POM.HomePage;

public class home_searcherrmsg extends Basetest{
	
	@Test
	public void searcherrormsg()
	{
		HomePage hp=new HomePage(driver);
		hp.entersearchtf("1234");
		WebElement results = driver.findElement(By.xpath("p[@id='uiv2-no-result']"));
		System.out.println(results);
		
	}
	
	

	
	//p[@id='uiv2-no-result']/i
	
}
