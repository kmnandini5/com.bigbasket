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

import POM.HomePage;

public class addingprdttocart extends Basetest{
	
	@Test
	public void addproduct_tocart() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.entersearchtf("orange juice");
		Thread.sleep(3000);
		
		driver.findElement(By.id("'uiv2-qty-265719'")).sendKeys("3");
		driver.findElement(By.id("uiv2-a2c-265719")).click();
		driver.findElement(By.xpath("//i[@class='icon svg-header svg-basket svg-basket-dim']")).click();
		
		Basepage bp=new Basepage(driver);
		//WebElement etitle = driver.findElement(By.xpath("//a[contains(.,'Orange 200')]"));
		bp.verifyTitle("orange 200");
	}

}
